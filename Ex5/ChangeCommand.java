import java.util.*;

// Команда зміни даних з підтримкою undo
public class ChangeCommand implements ConsoleCommand {

    private List<Double> backup = new ArrayList<>(); // резервна копія

    @Override
    public char getKey() {
        return 'c'; // клавіша виклику
    }

    @Override
    public void execute() {

        // Збереження попереднього стану
        backup = new ArrayList<>(GenerateCommand.data);

        // Зміна даних (множення на 2)
        for (int i = 0; i < GenerateCommand.data.size(); i++) {
            GenerateCommand.data.set(i,
                    GenerateCommand.data.get(i) * 2);
        }

        System.out.println("Changed");
    }

    @Override
    public void undo() {
        // Відновлення попереднього стану
        GenerateCommand.data = new ArrayList<>(backup);
        System.out.println("Undo change");
    }
}