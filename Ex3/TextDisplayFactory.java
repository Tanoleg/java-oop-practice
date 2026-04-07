// Конкретна фабрика для створення текстового відображення
public class TextDisplayFactory implements DisplayFactory {

    @Override
    public Displayable createDisplay() {
        return new TextDisplay(); // створення об'єкта відображення
    }
}