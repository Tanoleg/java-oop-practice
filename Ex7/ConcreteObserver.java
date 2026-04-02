public class ConcreteObserver implements Observer {

    private DataModel model;

    public ConcreteObserver(DataModel model) {
        this.model = model;
    }

    @Override
    public void update() {
        System.out.println("Updated: " + model.getData());
    }
}