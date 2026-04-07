import java.util.*;

// Клас меню для керування командами
public class Menu implements Command {

    private List<ConsoleCommand> commands = new ArrayList<>();

    // Додавання команди
    public void add(ConsoleCommand c) {
        commands.add(c);
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);

        // Безкінечний цикл меню
        while (true) {
            System.out.println("g-generate, v-view, c-change, u-undo, q-exit");

            char ch = sc.next().charAt(0);

            if (ch == 'q') break;

            // Пошук і виконання команди
            for (ConsoleCommand c : commands) {
                if (c.getKey() == ch) {
                    c.execute();
                }
            }
        }
    }

    @Override
    public void undo() {
        // не використовується
    }
}