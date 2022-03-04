package day10;
import java.awt.Button;
//창크기 800 600
//위치 300 300
//창 제목 컴포넌트 배치
import java.awt.Frame;
//Frame 배치관리자 : BorderLayout
public class MyWin3 extends Frame{

	Button btn1, btn2, btn3, btn4, btn5;
	 
	MyWin3(){
		//컴포넌트 초기화
		btn1 = new Button("중앙");
		btn2 = new Button("남");
		btn3 = new Button("동");
		btn4 = new Button("서");
		btn5 = new Button("북");
		
		add(btn1,"Center"); 
		add(btn2,"South"); 
		add(btn3,"East"); 
		add(btn4,"West");
		add(btn5,"North");
		
		
		setSize(800,600);
		setLocation(300,300);
		setTitle("컴포넌트 배치");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWin3 mw = new MyWin3();
	}
}
