package Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class Question14 {
    JFrame frame;
    JPanel p;
    Question14(){
        frame = new JFrame();
        frame.setSize(400,400);
        p = new JPanel(){
            public void paint(Graphics g){
                solidLines(g);
            }
            public void solidLines(Graphics g){
                Graphics2D g2 = (Graphics2D)g;
                Point2D point1 = new Point2D.Double(100,100);
                Point2D point2 = new Point2D.Double(300,270);
                Line2D line = new Line2D.Double(point1,point2);
                Stroke stroke = new BasicStroke(10,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER);
                g2.setStroke(stroke);
                g2.setColor(Color.RED);
                g2.draw(line);
                g2.translate(0,40);
            }
        };
        frame.add(p);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Question14 q14 = new Question14();
    }
}
