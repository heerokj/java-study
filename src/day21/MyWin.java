package day21; //������ �ٽ�

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWin extends Frame{

	MyWin(){ //snippets���� ����� ����ϱ�
		this.addWindowListener(new WindowAdapter() {

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("�����մϴ�.");
			System.exit(0);
		}	
	}); //addWindowListener �������̽��� ������ ��ü
		setBounds(100,100,800,600);
		setVisible(true);
	
	}

	@Override //paint �޼ҵ� : GUIȭ�鿡 �׸��� �� 
	public void paint(Graphics g) {		
		super.paint(g); //������â �׸���
		System.out.println("ȭ��׷�������");
		//Graphics : ��
		
		//�����׸���
		g.drawLine(100, 100, 200, 200);
		//�簢���׸���
		g.drawRect(300, 300, 100, 100);
		//Ÿ���׸���
		g.drawArc(150, 150, 100, 100, 0, 150);
		//���׸���
		g.drawOval(250, 250, 100, 100);
		
		//�簢��ä���
		g.fillRect(400, 400, 50, 50);
		
		//drawXXX() : ä���� �ʰ� �׸���
		//fillXXX() : ä��� �׸���
		g.setColor(Color.blue);
		
		//�۾���
		g.drawString("ȫ�浿", 250, 100);
		
		//RGB�� ��������
		Color c = new Color(54,180,22);
		g.setColor(c);
		g.drawString("ȫ�浿", 250, 100);
		
	
	}
	public static void main(String[] args) {
		MyWin mw = new MyWin();
	}

}
