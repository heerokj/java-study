package day12hw;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestMain04 extends Frame {

	Button btn1,btn2,btn3,btn4,btn5,btn6;
	TestMain04(){
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
		TestMain04 tm = new TestMain04();
	}
}
