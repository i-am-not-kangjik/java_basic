package day07_GUI3.src.mycom.mytest;

import java.awt.*;

public class RedDuck extends Duck{
    public RedDuck() {

    }
    public RedDuck(int x, int y){
        super(x, y);
    }
    @Override
    public void display(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
    }
}
