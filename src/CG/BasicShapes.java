package CG;

import javax.swing.*;
import java.awt.*;

public class BasicShapes {
    BasicShapes(){
        JFrame frame = new JFrame("Line");

        frame.setSize(600,600);
        frame.setLocation(50,50);
        frame.add(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paint(g);
                g.drawLine(0,0,600,700);
            }
        });
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        BasicShapes bs= new BasicShapes();


    }
}
