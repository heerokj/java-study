package day10;
import java.awt.Button;
//âũ�� 800 600
//��ġ 300 300
//â ���� ������Ʈ ��ġ
import java.awt.Frame;
//Frame ��ġ������ : BorderLayout
public class MyWin3 extends Frame{

	Button btn1, btn2, btn3, btn4, btn5;
	 
	MyWin3(){
		//������Ʈ �ʱ�ȭ
		btn1 = new Button("�߾�");
		btn2 = new Button("��");
		btn3 = new Button("��");
		btn4 = new Button("��");
		btn5 = new Button("��");
		
		add(btn1,"Center"); 
		add(btn2,"South"); 
		add(btn3,"East"); 
		add(btn4,"West");
		add(btn5,"North");
		
		
		setSize(800,600);
		setLocation(300,300);
		setTitle("������Ʈ ��ġ");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWin3 mw = new MyWin3();
	}
}
