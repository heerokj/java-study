package day12hw; //8. ���ݱ��� ��� ��ư�� ��ư �迭�� ó���ؼ� Ǯ��

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestMain08 extends Frame implements KeyListener{

	//��ư �迭 ����
	Button[] btn;
	
	TestMain08(){
		//��ư �迭 ����
		btn = new Button[6];
		
		//��ġ������X		 	
		setLayout(null);		
	
		//������Ʈ �ʱ�ȭ - ��ư ��ü ����, ��ġ �� ũ�� ����, ��ư����
		for(int i =0; i<btn.length; i++) {
			btn[i] = new Button();
		}
		btn[0].setBounds(400,400,100,50);
		btn[1].setBounds(510,460,100,50);
		btn[2].setBounds(340,460,50,100);
		btn[3].setBounds(400,460,100,150);
		btn[4].setBounds(400,620,40,100);
		btn[5].setBounds(460,620,40,100);		
	
		for(int i =0; i<btn.length; i++) {
			add(btn[i]);
			btn[i].addKeyListener(this);
		}
				
		//�ݱ� ��ư Ŭ�� �� â ����						
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("�����մϴ�.");
				System.exit(0);
			}
		});				
		setBounds(50, 20, 1200, 800);
		setVisible(true);
	}	
	
	
	
	public static void main(String[] args) {
		TestMain08 tm = new TestMain08();
	}
	@Override
	public void keyTyped(KeyEvent e) { }
	@Override
	public void keyPressed(KeyEvent e) {		
//		int code = e.getKeyCode();
//		System.out.println(code);
		
		//��ư1��x���� �ҷ����µ� ����x1������ (6���� ��ư ���ϱ�)
		int x = btn.getX();
		for(int i =0; i<btn.length; i++) {
			int x =btn[i].getX();
		}
		//��ư1�� y�� �ҷ����µ� �� ���� ���� y1�� ����(6�� ���ϱ�)
		int y = btn.getY();
		for(int i =0; i<btn.length; i++) {
			int y = btn[i].getY();
		}
		if(code == 37) { 
			x1 -= 3;
			x2 -= 3;
			x3 -= 3;
			x4 -= 3;
			x5 -= 3;
			x6 -= 3;
		}else if (code == 39) {
			x1 += 3;
			x2 += 3;
			x3 += 3;
			x4 += 3;
			x5 += 3;
			x6 += 3;
		}else if(code == 38) {
			y1 -= 3;
			y2 -= 3;
			y3 -= 3;
			y4 -= 3;
			y5 -= 3;
			y6 -= 3;
		}else if(code == 40) {
			y1 += 3;
			y2 += 3;
			y3 += 3;
			y4 += 3;
			y5 += 3;
			y6 += 3;
		}else if(code == 10) {
			for(int i =0; i<=10; i++) {
				x2+=20;
				btn2.setLocation(x2,y2);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			for(int i =0; i<=10; i++) {
				x2-=20;
				btn2.setLocation(x2,y2);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}			
		}
		btn1.setLocation(x1,y1); 
		btn2.setLocation(x2,y2); 
		btn3.setLocation(x3,y3); 
		btn4.setLocation(x4,y4); 
		btn5.setLocation(x5,y5); 
		btn6.setLocation(x6,y6); 
	}
	@Override
	public void keyReleased(KeyEvent e) {}
}
