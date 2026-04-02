import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ChartFrame extends JFrame implements Observer {

    private DataModel model;

    public ChartFrame(DataModel model) {
        this.model = model;
        setSize(400, 300);
        setTitle("Chart");
        setVisible(true);
    }

    @Override
    public void update() {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        List<Double> data = model.getData();

        int x = 50;

        for (double d : data) {
            int height = (int) d;
            g.fillRect(x, 250 - height, 20, height);
            x += 30;
        }
    }
}