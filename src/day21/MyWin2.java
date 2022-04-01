package day21;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

//frame���� �����
//100,100,800,600 â �׸���
//������
//��ư : â�� ������ġ��

public class MyWin2 extends Frame implements ActionListener{

	Button btn;
	MyWin2(){
		btn = new Button("����");
		add(btn,"South");
		
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("�����մϴ�.");
				System.exit(0);
			}			
		});
		
		btn.addActionListener(this);
				
		setBounds(100,100,800,600);
		setVisible(true);		
	}

	public static void main(String[] args) {
		MyWin2 mw = new MyWin2();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��ư����");
		repaint(); //����� �۾�, �׸��� �۾�
				
	}
	
	@Override
	public void paint(Graphics g) {		
		super.paint(g);
		g.drawLine(100, 100, 300, 300);

		
/*		//������ �� �� ���̿� ���߱�
		Random rnd = new Random();
		int x1 = rnd.nextInt(800);
		int y1 = rnd.nextInt(600);
		int x2 = rnd.nextInt(800);
		int y2 = rnd.nextInt(600);
		g.drawLine(x1, y1, x2, y2);
		 
		//���� �����ϰ�
		int cr = rnd.nextInt(255);
		int cg = rnd.nextInt(255);
		int cb = rnd.nextInt(255);
		Color c = new Color(cr, cg, cb);
		g.setColor(c);
		g.drawLine(x1, y1, x2, y2);
*/		
		
		
		
/*		Random rnd = new Random();
		for(int i =0; i<200; i++) { //200�� ������
			int x1 = rnd.nextInt(800);
			int y1 = rnd.nextInt(600);
			int x2 = rnd.nextInt(800);
			int y2 = rnd.nextInt(600);
			g.drawLine(x1, y1, x2, y2);
			 
			//���� �����ϰ�
			int cr = rnd.nextInt(255);
			int cg = rnd.nextInt(255);
			int cb = rnd.nextInt(255);
			Color c = new Color(cr, cg, cb);
			g.setColor(c);
			g.drawLine(x1, y1, x2, y2);
		}
*/
		
		
		//0.1�� �������� ���׸���
		Random rnd = new Random();
		for(int i =0; i<200; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
				int x1 = rnd.nextInt(800);
				int y1 = rnd.nextInt(600);
				int x2 = rnd.nextInt(800);
				int y2 = rnd.nextInt(600);
		
				int cr = rnd.nextInt(255);
				int cg = rnd.nextInt(255);
				int cb = rnd.nextInt(255);
				Color c = new Color(cr, cg, cb);
				g.setColor(c);
				//���� �����ϰ� &������ ����
				//g.drawLine(x1, y1, x2, y2);
				g.drawOval(x1, y1, x2, y2);
			}
		}
	}