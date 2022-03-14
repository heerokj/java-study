package day14hw; //1. 사진이 들어가있는 버튼 만들기

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Q01 extends JFrame{
	
	JButton jbnt1, jbnt2 ;
	ImageIcon img1, img2;
	
	Q01(){
		setLayout(null);
		img1 = new ImageIcon("src/imags/dog.jpg");
		img2 = new ImageIcon("src/imags/cat.jpg");
	
		jbnt1 = new JButton(img1);
		jbnt2 = new JButton(img2);
		
		jbnt1.setBounds(100,100,100,100);
		jbnt2.setBounds(400,100,100,100);
		add(jbnt1);		
		add(jbnt2);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,100,600,400);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		Q01 q = new Q01();
	}

}
