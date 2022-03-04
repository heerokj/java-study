package day10;

import java.awt.Button;
import java.awt.Frame;

public class MyWin2 extends Frame{

	//버튼 컴포넌트
	Button btn;
	//창에 배치 : 어떻게 배치하면 좋을까?
	//배치관리자 /컨테이너마다 전용 배치관리자가 존재
	//BorderLayout이라는 배치관리자 사용
	//이는 동서남북중앙 배치가능
	
	
	MyWin2(){
		btn = new Button("YES");
		System.out.println("btn : "+btn);
		//현재 창에 버튼 부착
		add(btn);
		
		setSize(500,500);
		setLocation(350,350);
		setTitle("내가 만든 윈도우창");
		setVisible(true);		
	}
	
	
	//상속받았으니 Frame클래스의 모든 메세드가 이곳에 놓인것처럼 
	
	
	public static void main(String[] args) {
		MyWin2 mw = new MyWin2();
					
	}
}
