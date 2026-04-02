import java.util.*;

public class MinCommand implements Command {

    private List<Double> data;

    public MinCommand(List<Double> data) {
        this.data = data;
    }

    @Override
    public void execute() {

        double min = Collections.min(data);

        System.out.println("MIN = " + min);

        try { Thread.sleep(1000); } catch (Exception e) {}
    }
}