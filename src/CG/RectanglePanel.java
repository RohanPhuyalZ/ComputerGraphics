package CG;

import javax.swing.*;
import java.awt.*;

public class RectanglePanel {
    RectanglePanel(){
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setLocation(200,200);
        JPanel jpanel = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.RED);
                g2d.drawRect(20,20,200,100);
                g2d.setColor(Color.BLUE);
                g2d.fillRect(21,21,199,99);

            }
        };
        frame.add(jpanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new RectanglePanel();
    }
}
