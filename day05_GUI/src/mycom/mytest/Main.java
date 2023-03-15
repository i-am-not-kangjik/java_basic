package mycom.mytest;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Frame f = new Frame();
        Button btn = new Button("로그인");
        f.add(btn);
        f.setSize(800, 600);
        f.setBackground(Color.lightGray);
        f.setVisible(true);
    }
}
