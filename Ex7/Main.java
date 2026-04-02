import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) throws Exception {

        DataModel model = new DataModel();

        // Observers
        ConcreteObserver console = new ConcreteObserver(model);
        if (!java.awt.GraphicsEnvironment.isHeadless()) {
            ChartFrame gui = new ChartFrame(model);
            model.addObserver(gui);
        } else {
            System.out.println("GUI not supported (headless mode)");
        }

        model.addObserver(console);

        // Reflection
        Class<?> cls = model.getClass();

        if (cls.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation ann = cls.getAnnotation(MyAnnotation.class);
            System.out.println("Annotation: " + ann.value());
        }

        // Діалог
        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("1 - generate, 0 - exit");
            int choice = sc.nextInt();

            if (choice == 0) break;

            model.generate();
        }
    }
}