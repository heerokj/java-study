package day11;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MovingButtonWin extends Frame implements MouseMotionListener {
	Button btnYes, btnNo; //��������
	Label lb;

	MovingButtonWin() { //�� ������ �ִ°� ��������(?)

		btnYes = new Button("YES");
		btnNo = new Button("NO");
		lb = new Label("����� �� ����ٰ� �����Ͻʴϱ�?");

		setLayout(null);

		// ���콺 ������ ����
		this.addMouseMotionListener(this); // ��Ŭ�������� �����ϸ�ʈ��� ��

		lb.setBounds(200, 100, 300, 60);
		btnYes.setBounds(160, 360, 100, 60);
		btnNo.setBounds(460, 360, 100, 60);

		add(lb);
		add(btnYes);
		add(btnNo);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("�����մϴ�.");
				System.exit(0);
			}
		}); // WindowListener �������̽��� ������ ��ü

		setBounds(100, 100, 800, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		MovingButtonWin mw = new MovingButtonWin();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("���콺�� �����δ�.");
		System.out.println("���콺�� ��ǥ :" + x + "," + y);
		
		// yes��ư�� ��ǥ
		int bx = btnYes.getX();
		int by = btnNo.getY();
		System.out.println("Yes��ư�� ��ǥ :" + bx + "," + by);
		
		//Yes ��ư�� ���콺���� �Ÿ��� ���
		bx+=30; //���콺�� �߾Ӱ��� �Ÿ� �����ϱ� ���� ���� (���� ���� ����� �⺻�̶�)
		by+=30; //���콺�� �߾Ӱ��� �Ÿ� �����ϱ� ���� ����
		
		double dis = Math.sqrt((x-bx)*(x-bx)+(y-by)*(y-by));
		System.out.println("yes ��ư�� ���콺���� �Ÿ� : "+dis);
		
		// �Ÿ��� 80�̸� ������������� ������ ��ư �̵���Ű��
		if(dis <= 80) {
			//yes��ư�� �� ���콺���� �ϴ����� ��ǥ�� ����
//			btnYes.setLocation(x+50,y+50); 
			//ȭ������� ��������ʰ� ���������� ����
			int rndX = (int)(Math.random()*740);
			int rndY = (int)(Math.random()*540);
			
			btnYes.setLocation(x+rndX,y+rndY); 
			
			
		}	
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {}

}

