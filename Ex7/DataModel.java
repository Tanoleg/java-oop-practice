import java.util.*;

@MyAnnotation("Model class")
public class DataModel {

    private List<Double> data = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    public void generate() {
        data.clear();
        for (int i = 0; i < 10; i++) {
            data.add(Math.random() * 100);
        }
        notifyObservers();
    }

    public List<Double> getData() {
        return data;
    }
}