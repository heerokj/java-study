package day11hw; //��������ġ /��ư��ɺο�

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWinEx6 extends Frame implements ActionListener {
	Button btn;

	MyWinEx6() {

		btn = new Button("����");
		add(btn);

		setLayout(null);
		btn.setSize(100, 50);

		btn.addActionListener(this); // �ٸ��������� ����ϸ�
		// Ŭ���� ���� ���� �Ǵµ� �� ����� ���⼭�� ����ϸ� �׳�
		// this�� ���� ��

		setSize(800, 600);
		setLocation(200, 200);
		// setBound(��ġ,��ġ,������,������) (200,200,800,600)
		setTitle("��������ġ");
		setVisible(true);
	}

	public static void main(String[] args) {
		MyWinEx6 mw = new MyWinEx6();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//      ������ Ǯ�� - �� ������ Ǫ��			
//		int ranX = (int)(Math.random()*750);
//		int ranY = (int)(Math.random()*550);

		String str = "��ư�̵��մϴ�.";
		System.out.println(str);

		if (str.equals("��ư�̵��մϴ�.")) {
			int ranX = (int) (Math.random() * 750);
			int ranY = (int) (Math.random() * 550);
			btn.setLocation(ranX, ranY);
		}
	}

}
