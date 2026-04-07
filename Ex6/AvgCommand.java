import java.util.*;

// Команда для обчислення середнього значення
public class AvgCommand implements Command {

    private List<Double> data; // список чисел

    // Конструктор
    public AvgCommand(List<Double> data) {
        this.data = data;
    }

    @Override
    public void execute() {

        double sum = 0;

        // Обчислення суми
        for (double d : data) {
            sum += d;
        }

        // Обчислення середнього
        double avg = sum / data.size();

        System.out.println("AVG = " + avg);

        // Затримка (імітація складної операції)
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
    }
}