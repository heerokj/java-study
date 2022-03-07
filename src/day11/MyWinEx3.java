package day11;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWinEx3 extends Frame implements ActionListener{
	
	Label lb;
	TextField tf;
	Button btnExit;
	MyWinEx3(){	
		//기본 지정간리자를 사용하지 않음
		setLayout(null);
		
		tf = new TextField();
		tf.setSize(200,30);
		tf.setLocation(250,450);
		
		lb = new Label("오늘은 무슨 요일인가요?",Label.CENTER);
		btnExit = new Button("종료");
		Color c = new Color(4,207,92);
		btnExit.setBackground(c);
	//	btnExit.setBackground(Color.red);
		btnExit.setSize(750,60);
		btnExit.setLocation(50,600);
		
		lb.setBackground(Color.green);
		lb.setSize(250,150);
		lb.setLocation(250,150);
		
		add(tf);
		add(lb);
		add(btnExit);

//		Handler3 hd = new Handler3();
		btnExit.addActionListener(this);
			
		setSize(850,650);
		setLocation(100,100);
		setTitle("MyWin3.java");
		setVisible(true);
	} 
	public static void main(String[] args) {
		MyWinEx3 mw = new MyWinEx3();
	}

//class Handler3 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("종료합니다.");
		System.exit(0);
	}	
}