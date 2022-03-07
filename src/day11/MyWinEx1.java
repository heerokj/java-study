package day11;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//1. event �ҽ��� ���� : btn(����� �Ǵ°� ����)
//2. event �ҽ��� �����⸦ ���� : addActionListener
//3. handler�� ����

public class MyWinEx1 extends Frame{
	Button btn;
	
	MyWinEx1(String title){		
		super(title); //String �Ű����� �ִ� �θ�����ڸ� ȣ��
		setSize(800,600); //âũ��
		setLocation(400,300); //â��ġ
		setVisible(true);
		
		//������Ʈ �ʱ�ȭ
		btn = new Button("�� Ŭ���غ�!");
		
		Handler hd = new Handler();
		//�̺�Ʈ ó��
		btn.addActionListener(hd);//ActionListener ������ ��ü�� �;���
		
		add(btn); //�����̳ʿ� ��ƾ� �������� =>��ưȭ�� ���߾ӿ� ��ġ		
	}
	

	public static void main(String[] args) {
		MyWinEx1 mw = new MyWinEx1("�̺�Ʈ ó��");
	}
	
}
class Handler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��ư ����");
		
	}
	
}
