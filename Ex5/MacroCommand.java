import java.util.*;

public class MacroCommand implements Command {

    private List<Command> list = new ArrayList<>();

    public void add(Command c) {
        list.add(c);
    }

    @Override
    public void execute() {
        for (Command c : list) {
            c.execute();
        }
    }

    @Override
    public void undo() {
        for (Command c : list) {
            c.undo();
        }
    }
}