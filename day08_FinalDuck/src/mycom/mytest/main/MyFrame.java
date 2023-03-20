package day08_FinalDuck.src.mycom.mytest.main;

import day08_FinalDuck.src.mycom.mytest.duck.*;

import java.awt.Frame;
import java.awt.Graphics;

public class MyFrame extends Frame {
    public static final int FRAME_WIDTH = 800;
    public final static int FRAME_HEIGHT = 600;
    DuckManager mgr = new DuckManager();
    public MyFrame() {
        super();	//Frame f=new Frame();
        this.setSize(MyFrame.FRAME_WIDTH ,MyFrame.FRAME_HEIGHT); //f.setSize();
        this.setVisible(true); // 독점권요청 -->OS-->독점권뺏고 다시 부여-->paint(g)
    }


    @Override
    public void paint(Graphics g) {
        if(mgr!=null) {
            mgr.displayAllDucks(g);
            mgr.quackAllDucks(g);
            mgr.swimAllDucks(g);
            mgr.flyAllDucks(g);
        }
    }
}
