package day21;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWin3 extends Frame implements ActionListener{

	Button btn;
	int x1, x2, y1, y2;
	
	MyWin3(){
		btn = new Button("�̵�");
		add(btn, "South");
		x1 = 100;
		x2 = 100;
		y1 = 100;
		y2 = 100;
				
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("�����մϴ�.");
				System.exit(0);
			}
		});
		
		btn.addActionListener(this);					
		
		setBounds(100, 100, 800, 600);
		setVisible(true);			
	}
		
	public static void main(String[] args) {
		MyWin3 mw = new MyWin3();
	}
	
	@Override //*
	public void paint(Graphics g) {
		super.paint(g); //������ �׸���
		g.drawLine(x1, y1, x2, y2);						
	}
	
	@Override //** (�θ� ������Ʈ no! �����ؼ� ����Ʈ�׸��� ��ɸ� ����)
	public void update(Graphics g) {
		paint(g);
	}

	
	//��ư������ 
	//�ֿܼ� �޼��� ���, ���� ���������� �����̱�(x�� ����)
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��ư Ŭ��! ���� �̵��Ѵ�!");
		
		x1 += 10;
		x2 += 10; //��������� �ٲ�������
		
		           //*
		repaint(); //repaint()�θ��� ���������� update()�θ� 
		           //update() : ����ȭ�� ����� paint()ȣ��		
		
		
		           //** update �������̵�(����ȭ�� ����� ��� ����)
		           //������ �������ʰ� �̾ �׷���
	}

}
