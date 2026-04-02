import java.util.*;

public class CommandQueue implements Queue {

    private List<Command> list = new ArrayList<>();
    private boolean wait = false;
    private boolean stop = false;

    public CommandQueue() {
        new Thread(new Worker()).start();
    }

    public void shutdown() {
        stop = true;
    }

    @Override
    public synchronized void put(Command c) {
        list.add(c);
        notify();
    }

    @Override
    public synchronized Command take() {
        while (list.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        return list.remove(0);
    }

    private class Worker implements Runnable {
        public void run() {
            while (!stop) {
                Command c = take();
                c.execute();
            }
        }
    }
}