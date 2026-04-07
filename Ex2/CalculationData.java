import java.io.Serializable;

// Клас для зберігання параметрів і результату (підтримує серіалізацію)
public class CalculationData implements Serializable {

    private static final long serialVersionUID = 1L;

    private double alpha;   // параметр alpha
    private int n;          // кількість ітерацій
    private double result;  // результат обчислення

    // transient поле (не серіалізується)
    private transient long timestamp;

    // Конструктор
    public CalculationData(double alpha, int n) {
        this.alpha = alpha;
        this.n = n;
        this.timestamp = System.currentTimeMillis();
    }

    // Гетери
    public double getAlpha() {
        return alpha;
    }

    public int getN() {
        return n;
    }

    public double getResult() {
        return result;
    }

    // Сетер для результату
    public void setResult(double result) {
        this.result = result;
    }
}