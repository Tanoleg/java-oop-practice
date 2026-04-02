public class MainTest {

    public static void main(String[] args) {

        ViewTable table = new ViewTable();

        table.setWidth(15);

        if (table != null) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }
}