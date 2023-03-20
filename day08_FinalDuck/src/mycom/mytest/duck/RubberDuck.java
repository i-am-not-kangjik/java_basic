package day08_FinalDuck.src.mycom.mytest.duck;

import java.awt.*;

public class RubberDuck extends Duck implements Quackable{
    public RubberDuck() {
        super();
    }
    public RubberDuck(int x, int y){
        super(x, y);
    }

    public void quack(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("삑삑", x+45, y+10);
    }
    @Override
    public void display(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
    }
}
