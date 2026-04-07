// Клас для виконання обчислень (агрегує CalculationData)
public class Solver {

    private CalculationData data; // об'єкт з даними

    // Конструктор
    public Solver(CalculationData data) {
        this.data = data;
    }

    // Метод обчислення
    public void solve() {
        double sum = 0;

        // Обчислення суми
        for (int i = 1; i <= data.getN(); i++) {
            sum += Math.pow(i, 2) + Math.pow(i, 3);
        }

        // Остаточний результат
        double result = sum + 10 * Math.cos(data.getAlpha());

        // Збереження результату
        data.setResult(result);
    }
}