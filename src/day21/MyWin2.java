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

//frame으로 만들기
//100,100,800,600 창 그리기
//종료기능
//버튼 : 창의 남쪽위치에

public class MyWin2 extends Frame implements ActionListener{

	Button btn;
	MyWin2(){
		btn = new Button("시작");
		add(btn,"South");
		
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료합니다.");
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
		System.out.println("버튼눌림");
		repaint(); //지우는 작업, 그리기 작업
				
	}
	
	@Override
	public void paint(Graphics g) {		
		super.paint(g);
		g.drawLine(100, 100, 300, 300);

		
/*		//랜덤한 두 점 사이에 선긋기
		Random rnd = new Random();
		int x1 = rnd.nextInt(800);
		int y1 = rnd.nextInt(600);
		int x2 = rnd.nextInt(800);
		int y2 = rnd.nextInt(600);
		g.drawLine(x1, y1, x2, y2);
		 
		//색상도 랜덤하게
		int cr = rnd.nextInt(255);
		int cg = rnd.nextInt(255);
		int cb = rnd.nextInt(255);
		Color c = new Color(cr, cg, cb);
		g.setColor(c);
		g.drawLine(x1, y1, x2, y2);
*/		
		
		
		
/*		Random rnd = new Random();
		for(int i =0; i<200; i++) { //200번 돌리기
			int x1 = rnd.nextInt(800);
			int y1 = rnd.nextInt(600);
			int x2 = rnd.nextInt(800);
			int y2 = rnd.nextInt(600);
			g.drawLine(x1, y1, x2, y2);
			 
			//색상도 랜덤하게
			int cr = rnd.nextInt(255);
			int cg = rnd.nextInt(255);
			int cb = rnd.nextInt(255);
			Color c = new Color(cr, cg, cb);
			g.setColor(c);
			g.drawLine(x1, y1, x2, y2);
		}
*/
		
		
		//0.1초 간격으로 선그리기
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
				//색상도 랜덤하게 &원으로 수정
				//g.drawLine(x1, y1, x2, y2);
				g.drawOval(x1, y1, x2, y2);
			}
		}
	}