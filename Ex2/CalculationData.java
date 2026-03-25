import java.io.Serializable;

public class CalculationData implements Serializable {

    private static final long serialVersionUID = 1L;

    private double alpha;
    private int n;

    private double result;

    // transient поле (не буде серіалізуватись)
    private transient long timestamp;

    public CalculationData(double alpha, int n) {
        this.alpha = alpha;
        this.n = n;
        this.timestamp = System.currentTimeMillis();
    }

    public double getAlpha() {
        return alpha;
    }

    public int getN() {
        return n;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}