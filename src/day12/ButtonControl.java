package day12;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonControl extends Frame implements KeyListener{

	Button btn; //전역변수로 선언
	ButtonControl(){
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
		}); //snippet불러옴 ==>어케 불러와...
		 	
		setLayout(null);

		// Button btn = new Button("^^"); // 지역변수
		btn = new Button("^^"); // 전역변수 btn사용
		
		btn.addKeyListener(this);
		
		btn.setBounds(200,200,60,60);	
		add(btn);
		
		setBounds(50,50,800,600);
		setVisible(true);	
	}		
	public static void main(String[] args) {
		ButtonControl bc= new ButtonControl();
	}
	@Override
	public void keyTyped(KeyEvent e) { }
	@Override
	public void keyPressed(KeyEvent e) {//누르고있으면 계속호출
		//System.out.println("키보드키가 눌릴때 호출");
	   int code = e.getKeyCode();
	   System.out.println(code);
	   
	   //버튼의 x,y 값 출력하기
	   int x = btn.getX();
	   int y = btn.getY();
	   if(code == 37) { //왼쪽방향키누르면 3만큼 이동
		   x -= 3;
	   }else if(code == 38) { //위방향키누르면 3만큼 이동
		   y -= 3;
	   }else if(code ==39) { //오른쪽방향키누르면 3만큼 이동
		   x += 3;
	   }else if(code ==40) { //아래방향키누르면 3만큼 이동
		   y += 3;
	   }else if(code ==32) { //스페이스바누르면 점프
		   //반복문으로 30번 수행
		   for(int i = 1; i <= 30; i++) { //위로올라가기
			   y -=2;
			   btn.setLocation(x,y);
			   try {
				Thread.sleep(10);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} //1초 잠들어..			   
	   }
		   for(int i = 1; i <= 30; i++) { //아래로내려오기
			   y +=2;
			   btn.setLocation(x,y);
			   try {
				Thread.sleep(10);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} //1초 잠들어..			
	   }
	}   
	  // System.out.println("버튼위치 : "+x+","+y);
	   btn.setLocation(x,y);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		//System.out.println("뗄때 호출"); //누르고 있음 안되고 떼에야 호출
	}
}
