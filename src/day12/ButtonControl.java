package day12;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonControl extends Frame implements KeyListener{

	Button btn; //���������� ����
	ButtonControl(){
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("�����մϴ�.");
				System.exit(0);
			}
		}); //snippet�ҷ��� ==>���� �ҷ���...
		 	
		setLayout(null);

		// Button btn = new Button("^^"); // ��������
		btn = new Button("^^"); // �������� btn���
		
		btn.addKeyListener(this);
		
		btn.setBounds(200,200,60,60);	
		add(btn);
		
		setBounds(50,50,800,600);
		setVisible(true);	
	}		
	public static void main(String[] args) {
		ButtonControl bc= new ButtonControl();
	}
	@Override
	public void keyTyped(KeyEvent e) { }
	@Override
	public void keyPressed(KeyEvent e) {//������������ ���ȣ��
		//System.out.println("Ű����Ű�� ������ ȣ��");
	   int code = e.getKeyCode();
	   System.out.println(code);
	   
	   //��ư�� x,y �� ����ϱ�
	   int x = btn.getX();
	   int y = btn.getY();
	   if(code == 37) { //���ʹ���Ű������ 3��ŭ �̵�
		   x -= 3;
	   }else if(code == 38) { //������Ű������ 3��ŭ �̵�
		   y -= 3;
	   }else if(code ==39) { //�����ʹ���Ű������ 3��ŭ �̵�
		   x += 3;
	   }else if(code ==40) { //�Ʒ�����Ű������ 3��ŭ �̵�
		   y += 3;
	   }else if(code ==32) { //�����̽��ٴ����� ����
		   //�ݺ������� 30�� ����
		   for(int i = 1; i <= 30; i++) { //���οö󰡱�
			   y -=2;
			   btn.setLocation(x,y);
			   try {
				Thread.sleep(10);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} //1�� ����..			   
	   }
		   for(int i = 1; i <= 30; i++) { //�Ʒ��γ�������
			   y +=2;
			   btn.setLocation(x,y);
			   try {
				Thread.sleep(10);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} //1�� ����..			
	   }
	}   
	  // System.out.println("��ư��ġ : "+x+","+y);
	   btn.setLocation(x,y);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		//System.out.println("���� ȣ��"); //������ ���� �ȵǰ� ������ ȣ��
	}
}
