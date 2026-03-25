import java.io.*;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("alpha = ");
        double alpha = sc.nextDouble();

        System.out.print("n = ");
        int n = sc.nextInt();

        CalculationData data = new CalculationData(alpha, n);

        Solver solver = new Solver(data);
        solver.solve();

        System.out.println("Result = " + data.getResult());
        
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream("data.ser"))) {

            out.writeObject(data);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // десеріалізація
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