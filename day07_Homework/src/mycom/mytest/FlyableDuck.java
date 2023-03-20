package day07_Homework.src.mycom.mytest;

import java.awt.*;

public class FlyableDuck extends Duck{
    public FlyableDuck() {
        super();
    }
    public FlyableDuck(int x, int y){
        super(x, y);
    }
    public void fly(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("날다", x-20, y+60);
    }
}
