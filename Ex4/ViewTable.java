import java.util.Scanner;

// Клас для табличного відображення даних
public class ViewTable extends View {

    private int width = 10; // ширина стовпця

    // Встановлення ширини
    public void setWidth(int width) {
        this.width = width;
    }

    // Перевантажений метод із виводом повідомлення
    public void setWidth(int width, boolean print) {
        this.width = width;
        if (print) {
            System.out.println("Width set to " + width);
        }
    }

    @Override
    public void show(double[] data) {
        System.out.println("TABLE VIEW");

        // Вивід у вигляді таблиці
        for (double d : data) {
            System.out.printf("| %" + width + ".2f |\n", d);
        }
    }

    // Запит ширини у користувача
    public void askWidth() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter table width: ");
        width = sc.nextInt();
    }
}