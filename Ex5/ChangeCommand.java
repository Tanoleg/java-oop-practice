import java.util.*;

public class ChangeCommand implements ConsoleCommand {

    private List<Double> backup = new ArrayList<>();

    @Override
    public char getKey() { return 'c'; }

    @Override
    public void execute() {
        backup = new ArrayList<>(GenerateCommand.data);

        for (int i = 0; i < GenerateCommand.data.size(); i++) {
            GenerateCommand.data.set(i, GenerateCommand.data.get(i) * 2);
        }

        System.out.println("Changed");
    }

    @Override
    public void undo() {
        GenerateCommand.data = new ArrayList<>(backup);
        System.out.println("Undo change");
    }
}