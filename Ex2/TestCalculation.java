public class TestCalculation {

    public static void main(String[] args) {

        CalculationData data = new CalculationData(1.0, 5);

        Solver solver = new Solver(data);
        solver.solve();

        if (data.getResult() != 0) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }
}