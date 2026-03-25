public class TextDisplayFactory implements DisplayFactory {

    @Override
    public Displayable createDisplay() {
        return new TextDisplay();
    }
}