package day21;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyWin5 extends JFrame{

	int x,y;
	Image img; 
	Container panel;
	TCanvas can;
	
	MyWin5(){
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension d = tool.getScreenSize();	
		double width = d.getWidth();
		double heigth = d.getHeight();		
		x = (int)(width/2 - 800/2);
		y = (int)(heigth/2 - 600/2);
		
		img = tool.getImage("src/imags/baby.jpg");
		
		can = new TCanvas(img);
		panel = getContentPane();
		panel.add(can);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(x,y,800,600);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		MyWin5 mw = new MyWin5();
	}
}
