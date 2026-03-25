import java.io.Serializable;

public class CalculationResult implements Serializable {

    private double value;

    public CalculationResult(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}