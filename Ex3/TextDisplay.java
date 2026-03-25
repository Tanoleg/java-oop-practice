public class TextDisplay implements Displayable {

    @Override
    public String display(CalculationResult result) {
        return "Result value = " + result.getValue();
    }
}