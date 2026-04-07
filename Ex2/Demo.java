import java.io.*;
import java.util.Scanner;

// Клас для демонстрації роботи програми та серіалізації
public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ввід даних
        System.out.print("alpha = ");
        double alpha = sc.nextDouble();

        System.out.print("n = ");
        int n = sc.nextInt();

        // Створення об'єкта з даними
        CalculationData data = new CalculationData(alpha, n);

        // Обчислення
        Solver solver = new Solver(data);
        solver.solve();

        // Вивід результату
        System.out.println("Result = " + data.getResult());

        // Серіалізація (збереження у файл)
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream("data.ser"))) {

            out.writeObject(data);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Десеріалізація (відновлення з файлу)
        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream("data.ser"))) {

            CalculationData restored =
                    (CalculationData) in.readObject();

            System.out.println("Restored result = " + restored.getResult());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}