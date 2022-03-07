package day11hw;

import java.awt.Button;
import java.awt.Frame;

public class MyWinEx1 extends Frame{
	Button btn1,btn2;
	
	MyWinEx1(){
		
		btn1 = new Button("Áß¾Ó");
		btn2 = new Button("ÇÏ´Ü");
		
		add(btn1,"Center");
		add(btn2,"South");
		
		setSize(300,300);
		setLocation(150,150);
		setTitle("sample window");
		setVisible(true);
	}
		
	public static void main(String[] args) {
		MyWinEx1 mw = new MyWinEx1();
	}
	
}
