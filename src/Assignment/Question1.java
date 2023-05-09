package Assignment;

import java.awt.*;

public class Question1 {
    Question1(){
        Frame frame = new Frame();
        frame.setSize(600,600);
        Panel panel = new Panel(){
            public void paint(Graphics g){
                super.paint(g);
                g.drawLine(10,20,100,200);
                g.drawRect(150,20,190,130);
                g.drawOval(350,20,200,200);
                g.drawOval(10,220,200,150);
                int []x= {240,240,360};
                int []y= {240,360,360};
                g.drawPolygon(x,y,3);
            }
        };
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Question1();
    }
}
