package Assignment;

import javax.swing.*;
import java.awt.*;

public class Question4 {
    Question4(){
        JFrame frame = new JFrame("Gadi");
        frame.setSize(600,600);
        Panel panel = new Panel(){
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                g.drawRect(50,50,400,200);
                g.drawOval(90,220,90,90);
                g.drawOval(300,220,90,90);
                g.drawRect(300,90,150, 80);

                g.setColor(Color.BLACK);
                g.fillRect(50,50,400,200);
                g.setColor(Color.RED);
                g.fillOval(90,220,90,90);
                g.fillOval(300,220,90,90);
                g.setColor(Color.blue);
                g.fillRect(300,90,150, 80);
            }
        };
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Question4();
    }
}
