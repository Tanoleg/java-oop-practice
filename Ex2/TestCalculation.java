// Клас для тестування обчислень
public class TestCalculation {

    public static void main(String[] args) {

        // Тестові дані
        CalculationData data = new CalculationData(1.0, 5);

        // Обчислення
        Solver solver = new Solver(data);
        solver.solve();

        // Перевірка результату
        if (data.getResult() != 0) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }
}