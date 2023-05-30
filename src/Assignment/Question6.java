package Assignment;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Question6 extends JPanel {

    private int x1, y1, x2, y2;

    public Question6(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        JFrame frame = new JFrame("Bresenham Algorithm");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.WHITE);

        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int sx = x1 < x2 ? 1 : -1;
        int sy = y1 < y2 ? 1 : -1;

        int err = dx - dy;

        int x = x1;
        int y = y1;

        g.setColor(Color.BLACK);

        while (x != x2 || y != y2) {
            g.fillRect(x, y, 1, 1);

            int err2 = 2 * err;

            if (err2 > -dy) {
                err -= dy;
                x += sx;
            }

            if (err2 < dx) {
                err += dx;
                y += sy;
            }
        }
    }

    public static void main(String[] args) {
        int x1 = 50;
        int y1 = 50;
        int x2 = 200;
        int y2 = 150;

        Question6 bresenham = new Question6(x1, y1, x2, y2);
    }
}

