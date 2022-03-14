package day14hw; //배열사용X..

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Q04Calculator_1 extends JFrame{
	
	JTextField jtf;
	JButton jbtn1,jbtn2,jbtn3,jbtn4,jbtn5,jbtn6,jbtn7,jbtn8,
	jbtn9,jbtn10,jbtn11,jbtn12,jbtn13,jbtn14,jbtn15,jbtn16;

	
	Q04Calculator_1(){
		
		setLayout(null);
		
		//컨포넌트 초기화
		jbtn1 = new JButton ("7");
		jbtn2 = new JButton ("8");
		jbtn3 = new JButton ("9");
		jbtn4 = new JButton ("+");
		jbtn5 = new JButton ("4");
		jbtn6 = new JButton ("5");
		jbtn7 = new JButton ("6");
		jbtn8 = new JButton ("-");
		jbtn9 = new JButton ("1");
		jbtn10 = new JButton ("2");
		jbtn11 = new JButton ("3");
		jbtn12 = new JButton ("*");
		jbtn13 = new JButton ("C");
		jbtn14 = new JButton ("0");
		jbtn15 = new JButton ("=");
		jbtn16 = new JButton ("/");	
		
		jtf = new JTextField();
		
		
		jbtn1.setBounds(40, 150, 70, 50);
		jbtn2.setBounds(120, 150, 70, 50);
		jbtn3.setBounds(200, 150, 70, 50);
		jbtn4.setBounds(280, 150, 70, 50);
		jbtn5.setBounds(40, 220, 70, 50);
		jbtn6.setBounds(120, 220, 70, 50);
		jbtn7.setBounds(200, 220, 70, 50);
		jbtn8.setBounds(280, 220, 70, 50);
		jbtn9.setBounds(40, 290, 70, 50);
		jbtn10.setBounds(120, 290, 70, 50);
		jbtn11.setBounds(200, 290, 70, 50);
		jbtn12.setBounds(280, 290, 70, 50);
		jbtn13.setBounds(40, 360, 70, 50);
		jbtn14.setBounds(120, 360, 70, 50);
		jbtn15.setBounds(200, 360, 70, 50);
		jbtn16.setBounds(280, 360, 70, 50);

		
		jtf.setEditable(false);
		jtf.setBackground(Color.WHITE);
		jtf.setBounds(45, 40, 300, 50);
		Font f = new Font("고딕체",Font.BOLD,10);
		jtf.setFont(f);
		
		
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		add(jbtn4);
		add(jbtn5);
		add(jbtn6);
		add(jbtn7);
		add(jbtn8);
		add(jbtn9);
		add(jbtn10);
		add(jbtn11);
		add(jbtn12);
		add(jbtn13);
		add(jbtn14);
		add(jbtn15);
		add(jbtn16);
		add(jtf);

		setTitle("계산기");
		setBounds(600, 100, 400, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	
	
	public static void main(String[] args) {
		Q04Calculator_1 cal =new Q04Calculator_1();
	}

}
