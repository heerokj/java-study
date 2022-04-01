package day21hw;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q01 extends Frame{
	
	Q01() {
				
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
		});
		setBounds(100,100,800,600);
		setVisible(true);
				
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.cyan);

		g.drawOval(100, 100, 400, 400);
		
		g.drawArc(170, 200, 100, 50, 0, 180);
		g.drawArc(170, 200, 100, 50, 0, 360);
		g.drawArc(330, 200, 100, 50, 0, 360);
		g.drawArc(330, 200, 100, 50, 0, 360);
				
		g.fillOval(220, 220, 20, 20);
		g.fillOval(370, 220, 20, 20);
		
		g.drawRect(300, 300, 30, 70);
		
		g.drawArc(200, 380, 200, 50, 180, 180);
		
		g.fillRect(250, 430, 20, 30);
		g.fillRect(320, 430, 20, 30);
	}

	public static void main(String[] args) {
		Q01 q = new Q01();
	}
}
