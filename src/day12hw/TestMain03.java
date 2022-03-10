package day12hw; //����..����.. =>ok

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestMain03 extends Frame implements ActionListener {

	Button btn;
	Label lb;
	TextField tf; 

	TestMain03() {

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("�����մϴ�.");
				System.exit(0);
			}
		});

		// ������Ʈ �ʱ�ȭ
		btn = new Button("print");
		lb = new Label("��");
		tf = new TextField();

		// ��ġ������ X
		setLayout(null);
		//
		Font f = new Font("���", Font.BOLD, 30);
		tf.setFont(f);

		// ������Ʈ ũ��� ��ġ����
		btn.setBounds(150, 200, 300, 50);
		lb.setBounds(350, 100, 100, 50);
		tf.setBounds(150, 100, 150, 50);

		// ���� �����ӿ� ����
		add(btn);
		add(lb);
		add(tf);

		btn.addActionListener(this); //�ʱ�ȭ�ϱ����� �ϸ� ������ ������Ʈ

		setBounds(100, 100, 600, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		TestMain03 tm = new TestMain03();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 1.�ؽ�Ʈ�ʵ��� �� ��������
		String inputData = tf.getText();
		// 2.���� ==> ���ڷ� �� ��ȯ
		int dan = Integer.parseInt(inputData);
		// 3.�������� �ܼ��� ���
		for (int i = 0; i <= 9; i++) {
			System.out.println(dan + "*" + i + " = " + dan * i);
		}
	}
}
