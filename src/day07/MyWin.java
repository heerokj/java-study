package day07;

import java.awt.Frame;

public class MyWin extends Frame{
	
	MyWin(){
		super();
		setTitle("���� ���� ������â"); //â�� Ÿ��Ʋ ����
		setSize(600,400); //â�� ������
		setLocation(300,300); //â�� ��ġ(ȭ���� ���� ����� ��ġ)
		setVisible(true); //â�� ȭ�鿡 ���̰� ����
	}
	public static void main(String[] args) {
		MyWin mw = new MyWin();
	}

}
