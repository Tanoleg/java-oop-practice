import java.util.*;

// Головний клас програми
public class Main {

    public static void main(String[] args) {

        List<Double> data = new ArrayList<>();

        // Генерація випадкових даних
        for (int i = 0; i < 10; i++) {
            data.add(Math.random() * 100);
        }

        System.out.println("DATA: " + data);

        // Створення черг команд
        CommandQueue queue1 = new CommandQueue();
        CommandQueue queue2 = new CommandQueue();

        // Додавання команд у черги
        queue1.put(new MaxCommand(data));
        queue2.put(new MinCommand(data));
        queue2.put(new AvgCommand(data));

        // Очікування виконання
        try {
            Thread.sleep(3000);
        } catch (Exception e) {}

        // Завершення потоків
        queue1.shutdown();
        queue2.shutdown();

        System.out.println("DONE");
    }
}