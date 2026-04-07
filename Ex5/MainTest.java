// Клас для тестування команд
public class MainTest {

    public static void main(String[] args) {

        // Генерація даних
        GenerateCommand g = new GenerateCommand();
        g.execute();

        // Зміна даних
        ChangeCommand c = new ChangeCommand();
        c.execute();

        // Скасування змін
        c.undo();

        System.out.println("Test OK");
    }
}