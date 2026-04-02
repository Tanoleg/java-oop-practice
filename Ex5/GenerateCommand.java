import java.util.*;

public class GenerateCommand implements ConsoleCommand {

    public static List<Double> data = new ArrayList<>();

    @Override
    public char getKey() { return 'g'; }

    @Override
    public void execute() {
        data.clear();
        for (int i = 0; i < 5; i++) {
            data.add(Math.random() * 100);
        }
        System.out.println("Generated");
    }

    @Override
    public void undo() {
        data.clear();
    }
}