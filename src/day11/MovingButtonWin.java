package day11;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MovingButtonWin extends Frame implements MouseMotionListener {
	Button btnYes, btnNo; //전역변수
	Label lb;

	MovingButtonWin() { //이 안은에 있는건 지역변수(?)

		btnYes = new Button("YES");
		btnNo = new Button("NO");
		lb = new Label("당신은 잘 생겼다고 생각하십니까?");

		setLayout(null);

		// 마우스 움직임 감지
		this.addMouseMotionListener(this); // 내클래스에서 구현하면됨닊싼 디스

		lb.setBounds(200, 100, 300, 60);
		btnYes.setBounds(160, 360, 100, 60);
		btnNo.setBounds(460, 360, 100, 60);

		add(lb);
		add(btnYes);
		add(btnNo);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
		}); // WindowListener 인터페이스를 구현한 객체

		setBounds(100, 100, 800, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		MovingButtonWin mw = new MovingButtonWin();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("마우스가 움직인다.");
		System.out.println("마우스의 좌표 :" + x + "," + y);
		
		// yes버튼의 좌표
		int bx = btnYes.getX();
		int by = btnNo.getY();
		System.out.println("Yes버튼의 좌표 :" + bx + "," + by);
		
		//Yes 버튼과 마우스와의 거리를 계산
		bx+=30; //마우스와 중앙값의 거리 측정하기 위한 조건 (원래 왼쪽 상단이 기본이라서)
		by+=30; //마우스와 중앙값의 거리 측정하기 위한 조건
		
		double dis = Math.sqrt((x-bx)*(x-bx)+(y-by)*(y-by));
		System.out.println("yes 버튼과 마우스와의 거리 : "+dis);
		
		// 거리가 80이면 가까워진것으로 판정해 버튼 이동시키기
		if(dis <= 80) {
			//yes버튼을 내 마우스우측 하단쪽의 좌표로 변경
//			btnYes.setLocation(x+50,y+50); 
			//화면밖으로 사라지지않게 랜덤값으로 변경
			int rndX = (int)(Math.random()*740);
			int rndY = (int)(Math.random()*540);
			
			btnYes.setLocation(x+rndX,y+rndY); 
			
			
		}	
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {}

}

