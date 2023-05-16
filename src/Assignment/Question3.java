package Assignment;

import javax.swing.*;
import java.awt.*;

public class Question3 {
    JFrame frame;
    Panel panel;
    Question3(){
        frame = new JFrame("test");
        frame.setSize(600,600);
        frame.setVisible(true);
    }
    void draw(){
        panel=new Panel(){
            @Override
            public void paint(Graphics g) {
                g.drawOval(20,30,100,100);
            }
        };
    }

    public static void main(String[] args) {
        new Question3().draw();
    }
}
