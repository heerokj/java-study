package day10;

import java.awt.Button;
import java.awt.Frame;

public class MyWin2 extends Frame{

	//��ư ������Ʈ
	Button btn;
	//â�� ��ġ : ��� ��ġ�ϸ� ������?
	//��ġ������ /�����̳ʸ��� ���� ��ġ�����ڰ� ����
	//BorderLayout�̶�� ��ġ������ ���
	//�̴� ���������߾� ��ġ����
	
	
	MyWin2(){
		btn = new Button("YES");
		System.out.println("btn : "+btn);
		//���� â�� ��ư ����
		add(btn);
		
		setSize(500,500);
		setLocation(350,350);
		setTitle("���� ���� ������â");
		setVisible(true);		
	}
	
	
	//��ӹ޾����� FrameŬ������ ��� �޼��尡 �̰��� ���ΰ�ó�� 
	
	
	public static void main(String[] args) {
		MyWin2 mw = new MyWin2();
					
	}
}
