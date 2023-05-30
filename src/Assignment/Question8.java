package Assignment;
import javax.swing.*;
import java.awt.*;

public class Question8 extends JPanel {

    private int centerX, centerY, a, b;

    public Question8(int centerX, int centerY, int a, int b) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.a = a;
        this.b = b;
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);

        int x = 0;
        int y = b;

        double d1 = b * b - a * a * b + a * a / 4.0;
        double d2;

        drawEllipsePoints(g, x, y);

        while (a * a * (y - 0.5) > b * b * (x + 1)) {
            if (d1 < 0) {
                d1 += b * b * (2 * x + 3);
                x++;
            } else {
                d1 += b * b * (2 * x + 3) + a * a * (-2 * y + 2);
                x++;
                y--;
            }

            drawEllipsePoints(g, x, y);
        }

        d2 = b * b * (x + 0.5) * (x + 0.5) + a * a * (y - 1) * (y - 1) - a * a * b * b;

        while (y > 0) {
            if (d2 < 0) {
                d2 += b * b * (2 * x + 2) + a * a * (-2 * y + 3);
                x++;
                y--;
            } else {
                d2 += a * a * (-2 * y + 3);
                y--;
            }

            drawEllipsePoints(g, x, y);
        }
    }

    private void drawEllipsePoints(Graphics g, int x, int y) {
        g.fillRect(centerX + x, centerY + y, 1, 1);
        g.fillRect(centerX - x, centerY + y, 1, 1);
        g.fillRect(centerX + x, centerY - y, 1, 1);
        g.fillRect(centerX - x, centerY - y, 1, 1);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Midpoint Ellipse Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        int centerX = 200;
        int centerY = 200;
        int a = 150;
        int b = 100;

        Question8 ellipseDrawing = new Question8(centerX, centerY, a, b);
        frame.add(ellipseDrawing);

        frame.setVisible(true);
    }
}
