import java.util.Scanner;

// Головний клас програми
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] data = {10, 20, 30, 40}; // тестові дані

        // Вибір режиму відображення
        System.out.println("1 - Text");
        System.out.println("2 - Table");

        int choice = sc.nextInt();

        Viewable factory;

        // Вибір фабрики
        if (choice == 1) {
            factory = new ViewableText();
        } else {
            factory = new ViewableTable();
        }

        // Поліморфізм
        View view = factory.createView();

        // Додаткова логіка для таблиці
        if (view instanceof ViewTable) {
            ((ViewTable) view).askWidth();
        }

        // Відображення даних
        view.show(data);
    }
}