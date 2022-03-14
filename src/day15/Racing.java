package day15; //다른사람꺼 주석 보기

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Racing extends JFrame implements ActionListener {

	JButton jbtn1, jbtn2, jbtn3, jbtnStart;
	ImageIcon img1, img2;
	Horse h1, h2, h3;

	Racing() {

		// 컴포넌트 초기화

		img1 = new ImageIcon("src/imags/horse.gif"); // 달리는 이미지
		img2 = new ImageIcon("src/imags/horsestop.gif"); // 정지해있는 이미지

		jbtn1 = new JButton(img2);
		jbtn2 = new JButton(img2);
		jbtn3 = new JButton(img2);
		jbtnStart = new JButton("Start");

		// 기본 배치관리자 :BorderLayout
		// 배치관리자X
		setLayout(null);

		// 컴포넌트 크기와 위치 지정
		jbtn1.setBounds(50, 150, 120, 60);
		jbtn2.setBounds(50, 250, 120, 60);
		jbtn3.setBounds(50, 350, 120, 60);
		jbtnStart.setBounds(250, 700, 800, 50);

		// 컴포넌트 추가
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		add(jbtnStart);

		// 이벤트 지정
		jbtnStart.addActionListener(this);

		setTitle("경마장");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(50, 50, 1200, 800);
		setVisible(true);
	}

	public static void main(String[] args) {
		Racing th = new Racing();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		/*
	      for(int i =0; i<=30; i++) {
			//현재 버튼의 위치를 가져오기
				int x = jbtn1.getX();
				int y = jbtn1.getY();
				// x좌표 값을 증가시키기
				x += 5;	
			// 지정된 좌표로 3개의 버튼을 이동시킨다
				jbtn1.setLocation(x,y);
				jbtn2.setLocation(jbtn2.getX()+5,jbtn2.getY());
				jbtn3.setLocation(jbtn3.getX()+5,jbtn3.getY());
	
				try {
					Thread.sleep(20);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();	
				}
		 */

		// 말이 이동한다
		// 버튼이 이동한다
		// System.out.println(jbtn1);

//		Horse h1 = new Horse(jbtn1);
//		Horse h2 = new Horse(jbtn2);
//		Horse h3 = new Horse(jbtn3);

		
		if (h1 == null) { // 이렇게 하면 클릭계속해도 말 안빨라짐
			h1 = new Horse(jbtn1, img1, img2); // 생성자를 통해 참조값준것
			h2 = new Horse(jbtn2, img1, img2);
			h3 = new Horse(jbtn3, img1, img2);
			
			// 우선순위를 높일 수 있다.
			h1.setPriority(Thread.MAX_PRIORITY);
			// 우선순위를 낮출 수 있다.
			h3.setPriority(Thread.MIN_PRIORITY);

			h1.start();
			h2.start();
			h3.start();

		}
	}
}
