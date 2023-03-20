package day08_FinalDuck.src.mycom.mytest.duck;

import java.awt.*;

public class MallardDuck extends Duck implements Flyable, Quackable {
    public MallardDuck() {
    super();
    }
    public MallardDuck(int x, int y){
        super(x, y);
    }
    @Override
    public void display(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
    }

    @Override
    public void fly(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("날다", this.x-20, this.y+60);
    }

    @Override
    public void quack(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("꽥꽥", x+45, y+10);
    }
}

