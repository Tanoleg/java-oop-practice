import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] data = {10, 20, 30, 40};

        System.out.println("1 - Text");
        System.out.println("2 - Table");

        int choice = sc.nextInt();

        Viewable factory;

        if (choice == 1) {
            factory = new ViewableText();
        } else {
            factory = new ViewableTable();
        }

        // Поліморфізм (dynamic dispatch)
        View view = factory.createView();

        if (view instanceof ViewTable) {
            ((ViewTable) view).askWidth();
        }

        view.show(data);
    }
}