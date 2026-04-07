// Клас-одинак (Singleton), який керує програмою
public class Application {

    // Єдиний екземпляр
    private static Application instance = new Application();

    // Приватний конструктор
    private Application() {}

    // Отримання екземпляра
    public static Application getInstance() {
        return instance;
    }

    private Menu menu = new Menu(); // меню команд

    // Запуск програми
    public void run() {
        menu.add(new GenerateCommand()); // генерація даних
        menu.add(new ViewCommand());     // перегляд
        menu.add(new ChangeCommand());   // зміна
        menu.add(new UndoCommand());     // скасування

        menu.execute(); // запуск меню
    }
}