import java.util.*;

public class AvgCommand implements Command {

    private List<Double> data;

    public AvgCommand(List<Double> data) {
        this.data = data;
    }

    @Override
    public void execute() {

        double sum = 0;

        for (double d : data) {
            sum += d;
        }

        double avg = sum / data.size();

        System.out.println("AVG = " + avg);

        try { Thread.sleep(1000); } catch (Exception e) {}
    }
}