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
		
		//â�� ����� �� ����� ����
		//Toolkit�� ���� �������� ������ �� �� �ִ�.
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension d = tool.getScreenSize();
		
		//���� ������� �ʺ�, ����
		double width = d.getWidth();
		double height = d.getHeight();
		System.out.println("���������� �ʺ�, ���� : " +width+", "+height );
		
		//���������� �ʺ�, ���� : 1536.0, 864.0	
		//1536.0/2 = 768 ���⿡ â�� ���α��� ���� ���ֱ� => 768-400
		//864.0/2 = 432 ���⿡ â�� ���α��� ���� ���ֱ� => 432-300
		//���� ������ֱ� 
		x = (int)(width/2 - 800/2);
		y = (int)(height/2 - 600/2);
		
		//�̹���
		img = tool.getImage("src/imags/baby.jpg");
		
		
		// ���� �����ӿ� �̺�Ʈ ó��
		addMouseListener(this);
		
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("�����մϴ�.");
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
		
		//�� �׸���
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
		System.out.println("���콺 ����" +"(" +x +", "+y +")");
		x1 = x;
		y1 = y;
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("���콺 ����" +"(" +x +", "+y +")");
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
