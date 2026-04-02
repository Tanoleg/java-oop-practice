public class ViewableTable extends Viewable {

    @Override
    public View createView() {
        return new ViewTable();
    }
}