package Assignment;

import java.awt.*;

public class Question2 {
    Question2(){
        Frame frame = new Frame();
        frame.setSize(600,600);
        Panel panel = new Panel(){
            public void paint(Graphics g){
                super.paint(g);
                g.drawLine(10,20,100,200);
                g.drawOval(10,220,200,150);
                g.drawRect(150,20,190,130);
                g.drawOval(350,20,200,200);
                g.drawPolygon(new int[] {240,240,360}, new int[] {240,360,360}, 3);

                g.setColor(Color.RED);
                g.fillRect(151, 21, 189,129);
                g.setColor(Color.BLUE);
                g.fillOval(350,20,200,200);
                g.setColor(Color.GREEN);
                g.fillOval(10,220,200,150);
                g.setColor(Color.CYAN);
                g.fillPolygon(new int[] {240,240,360}, new int[] {240,360,360}, 3);
            }
        };
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Question2();
    }
}
