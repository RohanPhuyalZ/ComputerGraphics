package CG;

import javax.swing.*;
import java.awt.*;

public class MyPanel {
    MyPanel(){
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setLocation(200,200);

        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawLine(0,0,600,700);
            }
        };
        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MyPanel();
    }
}
