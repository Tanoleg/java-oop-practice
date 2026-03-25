

public class Main {

    public static void main(String[] args) throws Exception {

        ResultManager manager = new ResultManager();

        manager.addResult(new CalculationResult(10));
        manager.addResult(new CalculationResult(20));

        manager.save();
        manager.load();

        DisplayFactory factory = new TextDisplayFactory();
        Displayable display = factory.createDisplay();

        for (CalculationResult r : manager.getResults()) {
            System.out.println(display.display(r));
        }
    }
}