package day15; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Racing extends JFrame implements ActionListener {

	JButton jbtn1, jbtn2, jbtn3, jbtnStart;
	ImageIcon img1, img2, imgBg;
	Horse h1, h2, h3; //??%%%%% 왜 여기다..

	Racing() {

		// 기본 배치관리자 :BorderLayout
		// 배치관리자X
		setLayout(null);
		
		//이미지아이콘 추가
		imgBg = new ImageIcon("src/images/bg.jpg"); 
		img1 = new ImageIcon("src/imags/horse.gif"); // 달리는 이미지
		img2 = new ImageIcon("src/imags/horsestop.gif"); // 정지해있는 이미지

		// 컴포넌트 초기화
		jbtn1 = new JButton(img2);
		jbtn2 = new JButton(img2);
		jbtn3 = new JButton(img2);
		jbtnStart = new JButton("Start");

		
		// 컴포넌트 크기와 위치 지정
		jbtn1.setBounds(50, 150, 120, 60);
		jbtn2.setBounds(50, 250, 120, 60);
		jbtn3.setBounds(50, 350, 120, 60);
		jbtnStart.setBounds(250, 700, 800, 50);

		// 프레임에 컴포넌트 부착
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		add(jbtnStart);

		// 이벤트 지정
		jbtnStart.addActionListener(this);

		//프레임 제목, 닫기설정, 위치 및 크기, 보이게
		setTitle("경마장");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(50, 50, 1200, 800);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		//프레임 객체 생성
		Racing th = new Racing();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		/*
		
		<싱글 쓰레드>
		아래와 같이 코드 작성하면 싱글 쓰레드(모두 main Thread)이기 때문에 
        Thread.sleep cpu가 모두 하나의 프로세스로 봐서 시작 버튼 클릭부터 끝까지 전체를 sleep 시킴 
	 	=> 원하는 결과(말이 부드럽게 움직이는 것) 아니고 이상한 결과(시작버튼 누르면 멈췄다 말이 순간이동) 나옴
	 	따라서 원하는 결과 얻으려면 Multi Thread 처리 해주어야 함
			 
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

//		<멀티쓰레드 처리함>
//		 말이 이동한다
//		 버튼이 이동한다
//		 
//		Horse h1 = new Horse(jbtn1);
//		Horse h2 = new Horse(jbtn2);
//		Horse h3 = new Horse(jbtn3);
		
//		h1.start();
//		h2.start();
//		h3.start();
		
		
//		위와 같이 코드 작성하면 버튼 누를때마다 스레드가 생김 => but 참조값은 같음 => 속도 엄청 빨라짐 =>  버그
//		해결 방법 ↓: 변수를 전역변수로 만들어줌 , if문 작성(참조값이 없으면 실행하고 있으면 안함)

		//??%%%%%
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
