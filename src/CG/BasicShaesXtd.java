package CG;

import javax.swing.*;
import java.awt.*;

public class BasicShaesXtd extends JFrame {
    BasicShaesXtd(){
        setTitle("Drawing");
        setSize(600,600);
        setLocation(200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(0,0,600,700);
    }

    public static void main(String[] args) {
        BasicShaesXtd xtd = new BasicShaesXtd();
        xtd.setVisible(true);
    }
}
