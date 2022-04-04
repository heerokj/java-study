package day21hw;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q03 extends Frame{

	int x, y;
	
	Q03(){
				
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
		});
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension d = tool.getScreenSize();				
		double width = d.getWidth();
		double height = d.getHeight();				
		x = (int)(width/2 - 800/2);
		y = (int)(height/2 - 600/2);
		
		setBounds(x,y,800,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Q03 q =new Q03();
	}
}
