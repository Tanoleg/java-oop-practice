public class ViewableText extends Viewable {

    @Override
    public View createView() {
        return new ViewText();
    }
}