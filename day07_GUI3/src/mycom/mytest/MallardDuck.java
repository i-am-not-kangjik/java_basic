package day07_GUI3.src.mycom.mytest;

import java.awt.*;

public class MallardDuck extends Duck{
    public MallardDuck() {

    }
    public MallardDuck(int x, int y){
        super(x, y);
    }
    @Override
    public void display(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
    }
}
