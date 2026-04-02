import java.util.*;

public class Menu implements Command {

    private List<ConsoleCommand> commands = new ArrayList<>();

    public void add(ConsoleCommand c) {
        commands.add(c);
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("g-generate, v-view, c-change, u-undo, q-exit");
            char ch = sc.next().charAt(0);

            if (ch == 'q') break;

            for (ConsoleCommand c : commands) {
                if (c.getKey() == ch) {
                    c.execute();
                }
            }
        }
    }

    @Override
    public void undo() {}
}