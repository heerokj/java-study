package day21;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWin4 extends Frame implements MouseListener{
	
	int x, y ,x1, x2, y1, y2;
	Image img;
	
	MyWin4(){
		
		//창을 모니터 한 가운데에 띄우기
		//Toolkit을 통해 현재모니터 사이즈 알 수 있다.
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension d = tool.getScreenSize();
		
		//현재 모니터의 너비, 높이
		double width = d.getWidth();
		double height = d.getHeight();
		System.out.println("현재모니터의 너비, 높이 : " +width+", "+height );
		
		//현재모니터의 너비, 높이 : 1536.0, 864.0	
		//1536.0/2 = 768 여기에 창의 가로길이 절반 빼주기 => 768-400
		//864.0/2 = 432 여기에 창의 세로길이 절반 빼주기 => 432-300
		//기계로 계산해주기 
		x = (int)(width/2 - 800/2);
		y = (int)(height/2 - 600/2);
		
		//이미지
		img = tool.getImage("src/imags/baby.jpg");
		
		
		// 현재 프레임에 이벤트 처리
		addMouseListener(this);
		
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
		});
		
		
			
		setBounds(x, y, 800, 600);
		setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
//		g.drawImage(img, 10, 10, 800, 600, this);
		
		//선 그리기
		g.drawLine(x1, y1, x2, y2);
	}
	
	
	public static void main(String[] args) {
		MyWin4 mw =new MyWin4();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("마우스 눌림" +"(" +x +", "+y +")");
		x1 = x;
		y1 = y;
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("마우스 뗄때" +"(" +x +", "+y +")");
		x1 = x;
		y1 = y;
		repaint();
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
