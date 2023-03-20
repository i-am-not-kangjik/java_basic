package day07_Homework.src.mycom.mytest;

import java.awt.*;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        super();
    }
    public DecoyDuck(int x, int y){
        super(x, y);
    }
    @Override
    public void display(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
    }
}
