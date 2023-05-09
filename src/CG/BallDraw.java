package CG;

import javax.swing.*;
import java.awt.*;

public class BallDraw {
    BallDraw(){
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setLocation(200,200);
        JPanel jpanel = new JPanel(){
          @Override
          public void paintComponent(Graphics g){
              Graphics2D g2d = (Graphics2D) g;
              g2d.setStroke(new BasicStroke(5));
          }
        };
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
