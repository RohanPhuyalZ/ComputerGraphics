package Assignment;
import javax.swing.*;
import java.awt.*;

public class Question7 extends JPanel {

    private int centerX, centerY, radius;

    public Question7(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int x = 0;
        int y = radius;
        int p = 1 - radius;

        drawCirclePoints(g, x, y);

        while (x < y) {
            x++;

            if (p < 0)
                p += 2 * x + 1;
            else {
                y--;
                p += 2 * (x - y) + 1;
            }

            drawCirclePoints(g, x, y);
        }
    }

    private void drawCirclePoints(Graphics g, int x, int y) {
        g.fillRect(centerX + x, centerY + y, 1, 1);
        g.fillRect(centerX - x, centerY + y, 1, 1);
        g.fillRect(centerX + x, centerY - y, 1, 1);
        g.fillRect(centerX - x, centerY - y, 1, 1);
        g.fillRect(centerX + y, centerY + x, 1, 1);
        g.fillRect(centerX - y, centerY + x, 1, 1);
        g.fillRect(centerX + y, centerY - x, 1, 1);
        g.fillRect(centerX - y, centerY - x, 1, 1);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Midpoint Circle Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        int centerX = 200;
        int centerY = 200;
        int radius = 100;

        Question7 circleDrawing = new Question7(centerX, centerY, radius);
        frame.add(circleDrawing);

        frame.setVisible(true);
    }
}
