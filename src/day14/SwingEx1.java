package day14;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

//AWT 개선되어서 만들어진 버전 SWING(앞에 J븥여서 사용)
public class SwingEx1 extends JFrame { // X창누르면 창 안보이게 가능(완전히 종료된건 아님)
	
	JButton btn;
	SwingEx1(){
		ImageIcon img1 = new ImageIcon("images/baby.jpg");		
		btn = new JButton(img1);
		add(btn);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 종료해주는 기능
		setBounds(100,100,800,600);
		setVisible(true); 		
		
	}
	
	
	
	
	public static void main(String[] args) {
		SwingEx1 sw = new SwingEx1();
		

	}

}
