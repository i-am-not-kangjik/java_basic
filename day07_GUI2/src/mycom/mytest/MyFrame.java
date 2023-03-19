package Day07_GUI2.src.mycom.mytest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class MyFrame extends Frame{
	Duck[] arr = new Duck[10];
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	public MyFrame() {
		super();	//Frame f=new Frame();
		makeDucks();
		this.setSize(FRAME_WIDTH,FRAME_HEIGHT); //f.setSize();
		this.setVisible(true); // 독점권요청 -->OS-->독점권뺏고 다시 부여-->paint(g)
	}

	private void makeDucks(){
		for (int i=0; i<arr.length; i++){
			arr[i] = new Duck();
		}
	}
	@Override
	public void paint(Graphics g) {
		// duck들 그리기
		if (arr != null){
			for(int i=0; i<arr.length; i++){
				if(arr[i] != null){
					arr[i].display(g);
				}
			}
		}
	}
};
