package day21hw;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Q02 extends JFrame implements ActionListener{

	JButton jbtncard, jbtn;
	ImageIcon imgace, imgback;
	
	Q02(){
		setLayout(null);
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension d = tool.getScreenSize();
		double width = d.getWidth();
		double heigth = d.getHeight();
		int x  = (int)(width/2 - 800/2);
		int y = (int)(heigth/2 - 600/2);
		
		imgace = new ImageIcon("src/imags/cardace.png");
		imgback = new ImageIcon("src/imags/cardback.jpg");
		
		jbtncard = new JButton(imgace);
		jbtn = new JButton("µÚÁý±â");
		
		jbtncard.setBounds(100,100,170,220);
		jbtn.setBounds(150,400,500,70);
		
		add(jbtncard);
		add(jbtn);
		
		jbtn.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(x, y, 800, 600);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		Q02 c = new Q02(); 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		                                                                                 
		
	}
}
