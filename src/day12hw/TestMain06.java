package day12hw; //Q06.5번 문제에서 asdw대신 화살표 방향키로 움직일수 있도록 변경

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestMain06 extends Frame implements KeyListener{

	Button btn1,btn2,btn3,btn4,btn5,btn6;
	TestMain06(){
		setLayout(null);
				
		btn1 = new Button("^-^");
		btn2 = new Button();
		btn3 = new Button();
		btn4 = new Button();
		btn5 = new Button();
		btn6 = new Button();

		btn1.setBounds(400,400,100,50);
		btn2.setBounds(510,460,100,50);
		btn3.setBounds(340,460,50,100);
		btn4.setBounds(400,460,100,150);
		btn5.setBounds(400,620,40,100);
		btn6.setBounds(460,620,40,100);		

		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		
		
		btn1.addKeyListener(this);
		btn2.addKeyListener(this);
		btn3.addKeyListener(this);
		btn4.addKeyListener(this);
		btn5.addKeyListener(this);
		btn6.addKeyListener(this);
		
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
		});
				
		setBounds(50, 20, 1200, 800);
		setVisible(true);
	}	
	public static void main(String[] args) {
		TestMain06 tm = new TestMain06();
	}
	@Override
	public void keyTyped(KeyEvent e) { }
	@Override
	public void keyPressed(KeyEvent e) {
		//키보드 눌렀을때의 값(아스키코드) code에 대입 => 출력(아스키코드값이 출력됨)
		int code = e.getKeyCode();
		System.out.println(code);
		
		//버튼1의x값을 불러오는데 변수x1에대입 (6개의 버튼 다하기)
		int x1 = btn1.getX();
		int x2 = btn2.getX();
		int x3 = btn3.getX();
		int x4 = btn4.getX();
		int x5 = btn5.getX();
		int x6 = btn6.getX();
		//버튼1의 y값 불러오는데 그 값을 변수 y1에 대입(6개 다하기)
		int y1 = btn1.getY();
		int y2 = btn2.getY();
		int y3 = btn3.getY();
		int y4 = btn4.getY();
		int y5 = btn5.getY();
		int y6 = btn6.getY();	
		
		//키보드 누를때 같이 움직이기
		//1. 키보드 눌렀을때의 x또는 y값 변경하기 => 그것을 대입
		//2. 대입한 값만큼 위치이동(setLocation)
		if(code == 37) { //키보드 눌렀을때의 값이 37(왼쪽방향키)일경우 모든x값(x1~x6)이 마이너스! => 그것을 대입
			x1 -= 3;
			x2 -= 3;
			x3 -= 3;
			x4 -= 3;
			x5 -= 3;
			x6 -= 3;
		}else if (code == 39) {
			x1 += 3;
			x2 += 3;
			x3 += 3;
			x4 += 3;
			x5 += 3;
			x6 += 3;
		}else if(code == 38) {
			y1 -= 3;
			y2 -= 3;
			y3 -= 3;
			y4 -= 3;
			y5 -= 3;
			y6 -= 3;
		}else if(code == 40) {
			y1 += 3;
			y2 += 3;
			y3 += 3;
			y4 += 3;
			y5 += 3;
			y6 += 3;
		}		   
		//setLocation 이용해 위치이동 (대입된 값(x,y)6개 넣어주기)
		btn1.setLocation(x1,y1); 
		btn2.setLocation(x2,y2); 
		btn3.setLocation(x3,y3); 
		btn4.setLocation(x4,y4); 
		btn5.setLocation(x5,y5); 
		btn6.setLocation(x6,y6); 
	}
	@Override
	public void keyReleased(KeyEvent e) {}
}
