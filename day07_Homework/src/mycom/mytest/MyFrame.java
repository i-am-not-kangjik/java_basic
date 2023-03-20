package day07_Homework.src.mycom.mytest;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;
public class MyFrame extends Frame {
    public static final int FRAME_WIDTH = 800;
    public final static int FRAME_HEIGHT = 600;

    Duck[] darr = new Duck[20];  //Super Class

    public MyFrame() {
        super();	//Frame f=new Frame();
        makeDucks();
        this.setSize(MyFrame.FRAME_WIDTH ,MyFrame.FRAME_HEIGHT); //f.setSize();
        this.setVisible(true); // 독점권요청 -->OS-->독점권뺏고 다시 부여-->paint(g)
    }

    private void makeDucks() {
        int type;
        Random rnd = new Random();

        for(int i=0;i<darr.length;i++) {

            type = rnd.nextInt(4); //0,1,2,3
            switch(type) {
                case 0:
                    darr[i] = new MallardDuck();
                    break;
                case 1:
                    //Duck d=new RedDuck(); 부모 = 자식;
                    darr[i] = new RedDuck();
                    break;
                case 2:
                    darr[i] = new RubberDuck();
                    break;
                case 3:
                    darr[i] = new DecoyDuck();
                    break;
            }
        }
    }


    @Override
    public void paint(Graphics g) {
        for (Duck d:darr){
            d.display(g);
            d.swim(g);
            d.quack(g);
            if(d instanceof FlyableDuck) {
                ((FlyableDuck) d).fly(g);
            }
        }
    }
};