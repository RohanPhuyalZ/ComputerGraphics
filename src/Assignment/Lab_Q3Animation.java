package Assignment;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

class Lab_Q3 extends JPanel {
    private int x = 0;
    private int y = 100;
    private final int width = 50;
    private final int height = 50;
    private int xstepsize = 10;
    private int ystepsize = 8;
    int max_x, max_y;

    public Lab_Q3(int x, int y) {
        max_x = x;
        max_y = y;
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, width, height);

        if (x + width > max_x || x < 0)
            xstepsize = -xstepsize;

        if (y + width > max_y || y < 0)
            ystepsize = -ystepsize;

        x = x + xstepsize;
        y = y + ystepsize;

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
        repaint();
    }
}

public class Lab_Q3Animation extends JFrame {
    public Lab_Q3Animation() {
        setTitle("The first java 2D program&quot");
        setSize(600, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.WHITE);
        setBackground(Color.BLACK);
        Lab_Q3 panel = new Lab_Q3(560, 660);
        panel.setBackground(Color.BLACK);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {

        Lab_Q3Animation a = new Lab_Q3Animation();

    }
}
