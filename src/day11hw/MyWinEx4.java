package day11hw;//마우스움직임

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyWinEx4 extends Frame implements MouseMotionListener {
	
	MyWinEx4() { 

		this.addMouseMotionListener(this);

		setSize(800, 600);
		setLocation(200, 200);
		setTitle("마우스 움직임");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWinEx4 mw = new MyWinEx4();
	}
	@Override
	public void mouseDragged(MouseEvent e) {}
	@Override
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("현재마우스위치 : "+x+","+y);
	}
}
