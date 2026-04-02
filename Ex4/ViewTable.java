import java.util.Scanner;

public class ViewTable extends View {

    private int width = 10;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setWidth(int width, boolean print) {
        this.width = width;
        if (print) {
            System.out.println("Width set to " + width);
        }
    }

    @Override
    public void show(double[] data) {

        System.out.println("TABLE VIEW");

        for (double d : data) {
            System.out.printf("| %-" + width + ".2f |\n", d);
        }
    }

    public void askWidth() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter table width: ");
        width = sc.nextInt();
    }
}