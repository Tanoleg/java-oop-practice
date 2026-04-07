// Клас для текстового відображення даних
public class ViewText extends View {

    @Override
    public void show(double[] data) {

        // Вивід кожного елемента
        for (double d : data) {
            System.out.println("Value = " + d);
        }
    }
}