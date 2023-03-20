package day07_Homework.src.mycom.mytest;

import java.awt.*;

public class RedDuck extends FlyableDuck{
    public RedDuck() {
        super();
    }
    public RedDuck(int x, int y){
        super(x, y);
    }

    @Override
    public void quack(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("꽥꽥", x+45, y+10);
    }

    @Override
    public void display(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
    }
}
