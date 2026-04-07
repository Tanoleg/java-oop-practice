import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Клас для керування результатами та їх збереження
public class ResultManager {

    // Список результатів
    private List<CalculationResult> results = new ArrayList<>();

    // Додавання результату
    public void addResult(CalculationResult r) {
        results.add(r);
    }

    // Отримання списку результатів
    public List<CalculationResult> getResults() {
        return results;
    }

    // Збереження результатів у файл
    public void save() throws Exception {
        ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("results.ser"));

        out.writeObject(results); // серіалізація списку
        out.close();
    }

    // Завантаження результатів з файлу
    public void load() throws Exception {
        ObjectInputStream in =
                new ObjectInputStream(new FileInputStream("results.ser"));

        results = (List<CalculationResult>) in.readObject(); // десеріалізація
        in.close();
    }
}