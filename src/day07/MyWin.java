package day07;

import java.awt.Frame;

public class MyWin extends Frame{
	
	MyWin(){
		super();
		setTitle("내가 만든 윈도우창"); //창의 타이틀 지정
		setSize(600,400); //창의 사이즈
		setLocation(300,300); //창의 위치(화면의 좌측 상단점 위치)
		setVisible(true); //창이 화면에 보이게 설정
	}
	public static void main(String[] args) {
		MyWin mw = new MyWin();
	}

}
