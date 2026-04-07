import java.util.*;

// Клас черги команд з обробкою в окремому потоці
public class CommandQueue implements Queue {

    private List<Command> list = new ArrayList<>(); // черга команд
    private boolean stop = false; // прапорець завершення

    // Конструктор запускає окремий потік
    public CommandQueue() {
        new Thread(new Worker()).start();
    }

    // Зупинка потоку
    public void shutdown() {
        stop = true;
    }

    // Додавання команди
    @Override
    public synchronized void put(Command c) {
        list.add(c);
        notify(); // повідомлення потоку
    }

    // Отримання команди
    @Override
    public synchronized Command take() {
        while (list.isEmpty()) {
            try {
                wait(); // очікування команди
            } catch (InterruptedException e) {}
        }
        return list.remove(0);
    }

    // Внутрішній клас-обробник
    private class Worker implements Runnable {
        public void run() {
            while (!stop) {
                Command c = take();
                c.execute(); // виконання команди
            }
        }
    }
}