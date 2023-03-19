package mycom.mytest;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;
public class MyFrame extends Frame {
    public static final int FRAME_WIDTH = 800;
    public final static int FRAME_HEIGHT = 600;

    Duck[] darr = new Duck[10];  //Super Class

    public MyFrame() {
        super();	//Frame f=new Frame();
        makeDucks();
        this.setSize(MyFrame.FRAME_WIDTH ,MyFrame.FRAME_HEIGHT); //f.setSize();
        this.setVisible(true); // 독점권요청 -->OS-->독점권뺏고 다시 부여-->paint(g)
    }

    private void makeDucks() {
        //랜덤하게 타입이 결정되도록~!!
        int type=1;
        Random rnd = new Random();

        for(int i=0;i<darr.length;i++) {

            type = rnd.nextInt(2); //0,1
            switch(type) {
                case 0:
                    //Duck d=new MallardDuck(); 부모 = 자식;
                    darr[i] = new MallardDuck(); //upcasting
                    break;
                case 1:
                    //Duck d=new RedDuck(); 부모 = 자식;
                    darr[i] = new RedDuck();
                    break;
                default:
                    darr[i] = new MallardDuck();
            }
        }//for
    }//makeDucks()


    @Override
    public void paint(Graphics g) {
        for (Duck d:darr){
            d.quack(g);
            d.display(g);

            //MallardDuck --> change()
//            if(d instanceof MallardDuck) {
//                MallardDuck md = (MallardDuck) d; //자식 = 부모
//                md.change(g);
//            }
        }
    }
};