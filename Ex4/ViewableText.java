// Фабрика для створення текстового представлення
public class ViewableText extends Viewable {

    @Override
    public View createView() {
        return new ViewText(); // створення текстового відображення
    }
}