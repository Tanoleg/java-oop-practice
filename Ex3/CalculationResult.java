import java.io.Serializable;

// Клас для зберігання результату обчислень (серіалізується)
public class CalculationResult implements Serializable {

    private double value; // значення результату

    // Конструктор
    public CalculationResult(double value) {
        this.value = value;
    }

    // Геттер для отримання результату
    public double getValue() {
        return value;
    }
}