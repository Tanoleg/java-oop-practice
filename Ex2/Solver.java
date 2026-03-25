public class Solver {

    private CalculationData data;

    public Solver(CalculationData data) {
        this.data = data;
    }

    public void solve() {

        double sum = 0;

        for (int i = 1; i <= data.getN(); i++) {
            sum += Math.pow(i, 2) + Math.pow(i, 3);
        }

        double result = sum + 10 * Math.cos(data.getAlpha());

        data.setResult(result);
    }
}