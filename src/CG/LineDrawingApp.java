package CG;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LineDrawingApp extends JFrame {

    private LineStyle currentLineStyle = LineStyle.SOLID;
    private Point startPoint;
    private Point endPoint;

    public LineDrawingApp() {
        setTitle("Line Drawing App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startPoint = e.getPoint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                endPoint = e.getPoint();
                repaint();
            }
        });
    }

    public void setCurrentLineStyle(LineStyle lineStyle) {
        this.currentLineStyle = lineStyle;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        if (startPoint != null && endPoint != null) {
            g2d.setStroke(currentLineStyle.getStroke());
            g2d.setColor(currentLineStyle.getColor());
            g2d.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LineDrawingApp app = new LineDrawingApp();
            app.setVisible(true);
        });
    }
}

enum LineStyle {
    SOLID(new BasicStroke(1.0f)),
    DASHED(new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, new float[]{5.0f}, 0.0f)),
    DOTTED(new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, new float[]{1.0f, 5.0f}, 0.0f));

    private Stroke stroke;

    LineStyle(Stroke stroke) {
        this.stroke = stroke;
    }

    public Stroke getStroke() {
        return stroke;
    }

    public Color getColor() {
        return Color.BLACK;
    }
}

