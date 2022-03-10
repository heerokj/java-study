package day11hw; //버튼생성하기

import java.awt.Button;
import java.awt.Frame;

public class MyWinEx1 extends Frame{
	Button btn1,btn2;
	
	MyWinEx1(){
		
		btn1 = new Button("중앙");
		btn2 = new Button("하단");
		
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
