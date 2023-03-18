package mycom.mytest;
import day07_GUI2.src.mycom.mytest.MyFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
public class Duck {
	protected int x;
	protected int y;

	public static final int DUCK_SIZE = 50;
	public static int num=1; //클래스변수
	private int mynum=0; //인스턴스마다 자신의 번호를 기억할 인스턴스 변수

	public Duck() {
		Random  rnd =new Random();
		x = rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50; //0~799
		y = rnd.nextInt(MyFrame.FRAME_HEIGHT-140)+70;
		Duck.num=Duck.num+1;
		this.mynum=Duck.num;
	}
	public Duck(int x, int  y) {
		this.x=x;
		this.y=y;
		Duck.num=Duck.num+1;
		this.mynum=Duck.num;
	}
	public void display(Graphics g) {
		g.setColor(new Color(255,0,0));
		g.drawString(""+this.mynum, x, y);
		g.fillOval(this.x, this.y, Duck.DUCK_SIZE,Duck.DUCK_SIZE);
	}
};