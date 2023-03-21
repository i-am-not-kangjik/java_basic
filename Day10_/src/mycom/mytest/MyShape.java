package mycom.mytest;

import java.awt.*;

public class MyShape {
    protected int x;
    protected int y;
    public static final int SHAPE_SIZE=50;

    public MyShape(){

    }
    public void display(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, 50, 50);
    }
    public MyShape(int mx, int my){
        this.x = mx;
        this.y = my;
    }
}
