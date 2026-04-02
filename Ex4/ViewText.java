public class ViewText extends View {

    @Override
    public void show(double[] data) {
        for (double d : data) {
            System.out.println("Value = " + d);
        }
    }
}