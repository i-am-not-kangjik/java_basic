package day08_FinalDuck.src.mycom.mytest.duck;

import day08_FinalDuck.src.mycom.mytest.main.MyFrame;

import java.awt.*;
import java.util.Random;

public abstract class Duck {
    protected int x;
    protected int y;
    public static final int DUCK_SIZE = 50;
    public static int num=1; //클래스변수

    public Duck() {
        Random rnd =new Random();
        x = rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50; //0~799
        y = rnd.nextInt(MyFrame.FRAME_HEIGHT-140)+70;
    }
    public Duck(int x, int  y) {
        this.x=x;
        this.y=y;
    }

    public void swim(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("수영", x-20, y+10);
    }
    public abstract void display(Graphics g);
};
