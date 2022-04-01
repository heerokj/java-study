package day21;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWin3 extends Frame implements ActionListener{

	Button btn;
	int x1, x2, y1, y2;
	
	MyWin3(){
		btn = new Button("이동");
		add(btn, "South");
		x1 = 100;
		x2 = 100;
		y1 = 100;
		y2 = 100;
				
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
		});
		
		btn.addActionListener(this);					
		
		setBounds(100, 100, 800, 600);
		setVisible(true);			
	}
		
	public static void main(String[] args) {
		MyWin3 mw = new MyWin3();
	}
	
	@Override //*
	public void paint(Graphics g) {
		super.paint(g); //윈도우 그리기
		g.drawLine(x1, y1, x2, y2);						
	}
	
	@Override //** (부모 업데이트 no! 수정해서 패인트그리는 기능만 넣음)
	public void update(Graphics g) {
		paint(g);
	}

	
	//버튼누르면 
	//콘솔에 메세지 출력, 선이 오른쪽으로 움직이기(x값 증가)
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 클릭! 선이 이동한다!");
		
		x1 += 10;
		x2 += 10; //여기까지는 바뀌진않음
		
		           //*
		repaint(); //repaint()부르면 내부적으로 update()부름 
		           //update() : 현재화면 지우고 paint()호출		
		
		
		           //** update 오버라이드(현재화면 지우는 기능 없앰)
		           //원래꺼 지우지않고 이어서 그려짐
	}

}
