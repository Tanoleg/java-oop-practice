import java.util.*;

public class MainTest {

    public static void main(String[] args) {

        List<Double> data = Arrays.asList(10.0, 20.0, 30.0);

        new MaxCommand(data).execute();
        new MinCommand(data).execute();
        new AvgCommand(data).execute();

        System.out.println("Test OK");
    }
}