public class Application {

    private static Application instance = new Application();

    private Application() {}

    public static Application getInstance() {
        return instance;
    }

    private Menu menu = new Menu();

    public void run() {
        menu.add(new GenerateCommand());
        menu.add(new ViewCommand());
        menu.add(new ChangeCommand());
        menu.add(new UndoCommand());
        menu.execute();
    }
}