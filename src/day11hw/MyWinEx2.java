package day11hw; // Ư�������ư Ŭ���� String����� ����

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWinEx2 extends Frame {
	Button btn1, btn2;

	MyWinEx2() {

		btn1 = new Button("�߾�");
		btn2 = new Button("����");

		add(btn1, "Center");
		add(btn2, "South");

		Handler5 hd = new Handler5();
		btn1.addActionListener(hd);
		btn2.addActionListener(hd);

		setSize(300, 300);
		setLocation(150, 150);
		setTitle("sample window");
		setVisible(true);
	}

	public static void main(String[] args) {
		MyWinEx2 mw = new MyWinEx2();
	}

}

class Handler5 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		System.out.println("�����մϴ�!");
		System.exit(0);

	}
}