package day11hw;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWinEx3 extends Frame implements WindowListener,ActionListener {
	Button dan;
	
	MyWinEx3(){
		setLayout(null);
		
		dan = new Button("구구단 버튼");
//		dan.addActionListener(this);
		add(dan);
		
		dan.setSize(200,200);
		dan.setLocation(300,200);
		
				
		setSize(800,600);
		setLocation(200,200);
		setTitle("종료가능창");
		setVisible(true);
				
		addWindowListener(this);
		dan.addActionListener(this);
			
	}
	
	public static void main(String[] args) {
		MyWinEx3 mw = new MyWinEx3();		
	}
	
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("종료합니다.");
		System.exit(0);		
	}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) { //클릭하면 콘솔에 랜덤하게 구구단중 1개의단 출력
		
		
	}	
}
