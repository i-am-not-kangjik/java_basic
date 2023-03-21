package mycom.mytest;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class MyFrame extends Frame{

    public static final int FRAME_WIDTH =800;
    public static final int FRAME_HEIGHT = 600;
    ArrayList<MyShape> arr = new ArrayList<>();
    public MyFrame() {
        super("이벤트 프로그램");
        //이벤트 처리기를 등록
        this.addMouseListener(new MyHandler());
        //윈도우 창닫기 처리기 등록
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) //WindowAdapter class Overriding
            {
                System.exit(0); //프로그램 종료 하기
            }
        });
        this.setSize(MyFrame.FRAME_WIDTH, MyFrame.FRAME_HEIGHT);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        // 그리기
        for(MyShape s:arr){
            s.display(g);
        }
    }

    //User로부터 마우스 클릭이 일어날때 그리기 동작이 수행
    //클릭에 대한 Listener
    class MyHandler implements MouseListener{

        @Override
        public void mousePressed(MouseEvent e) {
            arr.add(new MyShape(e.getX(), e.getY()));
            repaint();
        }

        @Override
        public void mouseClicked(MouseEvent e) {;}
        @Override
        public void mouseReleased(MouseEvent e) {;}
        @Override
        public void mouseEntered(MouseEvent e) {;}
        @Override
        public void mouseExited(MouseEvent e) {;}


    };//inner

};//outer