public class MainTest {

    public static void main(String[] args) {

        GenerateCommand g = new GenerateCommand();
        g.execute();

        ChangeCommand c = new ChangeCommand();
        c.execute();
        c.undo();

        System.out.println("Test OK");
    }
}