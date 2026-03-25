import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ResultManager {

    private List<CalculationResult> results = new ArrayList<>();

    public void addResult(CalculationResult r) {
        results.add(r);
    }

    public List<CalculationResult> getResults() {
        return results;
    }

    public void save() throws Exception {

        ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("results.ser"));

        out.writeObject(results);
        out.close();
    }

    public void load() throws Exception {

        ObjectInputStream in =
                new ObjectInputStream(new FileInputStream("results.ser"));

        results = (List<CalculationResult>) in.readObject();
        in.close();
    }
}