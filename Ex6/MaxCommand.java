import java.util.*;

public class MaxCommand implements Command {

    private List<Double> data;

    public MaxCommand(List<Double> data) {
        this.data = data;
    }

    @Override
    public void execute() {

        double max = Collections.max(data);

        System.out.println("MAX = " + max);

        try { Thread.sleep(1000); } catch (Exception e) {}
    }
}