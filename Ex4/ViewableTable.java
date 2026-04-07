// Фабрика для створення табличного представлення
public class ViewableTable extends Viewable {

    @Override
    public View createView() {
        return new ViewTable(); // створення табличного відображення
    }
}