package day14hw; //¹öÆ°ÀÌ ¾È³ª¿È¤Ð¤Ð

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Q04Calculator_2 extends JFrame{
	
	JTextField jtf;
	JPanel jp;
	JButton jbtn [];
	
	Q04Calculator_2(){
		setLayout(null);
		
		jtf = new JTextField();
		jtf.setEditable(false);
		jtf.setBackground(Color.WHITE);
		jtf.setBounds(20, 20, 350, 100);
		Font f = new Font("°íµñÃ¼",Font.BOLD,10);
		jtf.setFont(f);
		
		jp = new JPanel();
		GridLayout g =new GridLayout(4,4,10,10);
		jp.setLayout(g);
		jp.setBounds(10, 10, 10, 10);
		String [] button_names  = {"7","8","9","+","4","5","6","-",
				"1","2","3","*","C","0","=","/"};
		
		jbtn = new JButton[button_names.length];
		
		for(int i =0; i<button_names.length; i++) {
			jbtn[i] = new JButton(button_names[i]);
			jbtn[i].setFont(new Font("°íµñÃ¼",Font.BOLD,10));
			jbtn[i].setBackground(Color.gray);
			
			jp.add(jbtn[i]);
		}
		
		add(jtf);
		add(jp);
		
		setTitle("°è»ê±â");
		setBounds(600, 100, 400, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	
	
	public static void main(String[] args) {
		Q04Calculator_2 cal =new Q04Calculator_2();
	}

}
