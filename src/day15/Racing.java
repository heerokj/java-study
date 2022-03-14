package day15; //�ٸ������ �ּ� ����

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Racing extends JFrame implements ActionListener {

	JButton jbtn1, jbtn2, jbtn3, jbtnStart;
	ImageIcon img1, img2;
	Horse h1, h2, h3;

	Racing() {

		// ������Ʈ �ʱ�ȭ

		img1 = new ImageIcon("src/imags/horse.gif"); // �޸��� �̹���
		img2 = new ImageIcon("src/imags/horsestop.gif"); // �������ִ� �̹���

		jbtn1 = new JButton(img2);
		jbtn2 = new JButton(img2);
		jbtn3 = new JButton(img2);
		jbtnStart = new JButton("Start");

		// �⺻ ��ġ������ :BorderLayout
		// ��ġ������X
		setLayout(null);

		// ������Ʈ ũ��� ��ġ ����
		jbtn1.setBounds(50, 150, 120, 60);
		jbtn2.setBounds(50, 250, 120, 60);
		jbtn3.setBounds(50, 350, 120, 60);
		jbtnStart.setBounds(250, 700, 800, 50);

		// ������Ʈ �߰�
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		add(jbtnStart);

		// �̺�Ʈ ����
		jbtnStart.addActionListener(this);

		setTitle("�渶��");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(50, 50, 1200, 800);
		setVisible(true);
	}

	public static void main(String[] args) {
		Racing th = new Racing();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		/*
	      for(int i =0; i<=30; i++) {
			//���� ��ư�� ��ġ�� ��������
				int x = jbtn1.getX();
				int y = jbtn1.getY();
				// x��ǥ ���� ������Ű��
				x += 5;	
			// ������ ��ǥ�� 3���� ��ư�� �̵���Ų��
				jbtn1.setLocation(x,y);
				jbtn2.setLocation(jbtn2.getX()+5,jbtn2.getY());
				jbtn3.setLocation(jbtn3.getX()+5,jbtn3.getY());
	
				try {
					Thread.sleep(20);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();	
				}
		 */

		// ���� �̵��Ѵ�
		// ��ư�� �̵��Ѵ�
		// System.out.println(jbtn1);

//		Horse h1 = new Horse(jbtn1);
//		Horse h2 = new Horse(jbtn2);
//		Horse h3 = new Horse(jbtn3);

		
		if (h1 == null) { // �̷��� �ϸ� Ŭ������ص� �� �Ȼ�����
			h1 = new Horse(jbtn1, img1, img2); // �����ڸ� ���� �������ذ�
			h2 = new Horse(jbtn2, img1, img2);
			h3 = new Horse(jbtn3, img1, img2);
			
			// �켱������ ���� �� �ִ�.
			h1.setPriority(Thread.MAX_PRIORITY);
			// �켱������ ���� �� �ִ�.
			h3.setPriority(Thread.MIN_PRIORITY);

			h1.start();
			h2.start();
			h3.start();

		}
	}
}
