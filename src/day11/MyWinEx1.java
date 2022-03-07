package day11;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//1. event 소스를 결정 : btn(대상이 되는걸 결정)
//2. event 소스에 감지기를 부착 : addActionListener
//3. handler를 정의

public class MyWinEx1 extends Frame{
	Button btn;
	
	MyWinEx1(String title){		
		super(title); //String 매개변수 있는 부모생성자를 호출
		setSize(800,600); //창크기
		setLocation(400,300); //창위치
		setVisible(true);
		
		//컴포넌트 초기화
		btn = new Button("날 클릭해봐!");
		
		Handler hd = new Handler();
		//이벤트 처리
		btn.addActionListener(hd);//ActionListener 구현한 객체가 와야함
		
		add(btn); //컨테이너에 담아야 눈에보임 =>버튼화면 정중앙에 위치		
	}
	

	public static void main(String[] args) {
		MyWinEx1 mw = new MyWinEx1("이벤트 처리");
	}
	
}
class Handler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 눌림");
		
	}
	
}
