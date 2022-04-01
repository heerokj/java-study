package day21; //폰보며 다시

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWin extends Frame{

	MyWin(){ //snippets으로 만든거 사용하기
		this.addWindowListener(new WindowAdapter() {

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("종료합니다.");
			System.exit(0);
		}	
	}); //addWindowListener 인터페이스를 구현한 객체
		setBounds(100,100,800,600);
		setVisible(true);
	
	}

	@Override //paint 메소드 : GUI화면에 그리는 것 
	public void paint(Graphics g) {		
		super.paint(g); //윈도우창 그리기
		System.out.println("화면그려지는중");
		//Graphics : 붓
		
		//직선그리기
		g.drawLine(100, 100, 200, 200);
		//사각형그리기
		g.drawRect(300, 300, 100, 100);
		//타원그리기
		g.drawArc(150, 150, 100, 100, 0, 150);
		//원그리기
		g.drawOval(250, 250, 100, 100);
		
		//사각형채우기
		g.fillRect(400, 400, 50, 50);
		
		//drawXXX() : 채우지 않고 그리기
		//fillXXX() : 채우고 그리기
		g.setColor(Color.blue);
		
		//글쓰기
		g.drawString("홍길동", 250, 100);
		
		//RGB로 색상지정
		Color c = new Color(54,180,22);
		g.setColor(c);
		g.drawString("홍길동", 250, 100);
		
	
	}
	public static void main(String[] args) {
		MyWin mw = new MyWin();
	}

}
