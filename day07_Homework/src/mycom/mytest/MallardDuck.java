package day07_Homework.src.mycom.mytest;

import java.awt.*;

public class MallardDuck extends FlyableDuck{
    public MallardDuck() {
    super();
    }
    public MallardDuck(int x, int y){
        super(x, y);
    }
    @Override
    public void quack(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("꽥꽥", x+45, y+10);
    }
    @Override
    public void display(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
    }
}

