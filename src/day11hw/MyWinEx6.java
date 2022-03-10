package day11hw; //버턴의위치 /버튼기능부여

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWinEx6 extends Frame implements ActionListener {
	Button btn;

	MyWinEx6() {

		btn = new Button("랜덤");
		add(btn);

		setLayout(null);
		btn.setSize(100, 50);

		btn.addActionListener(this); // 다른곳에서도 사용하면
		// 클래스 따로 만들어도 되는데 이 기능을 여기서만 사용하면 그냥
		// this로 쓰면 됨

		setSize(800, 600);
		setLocation(200, 200);
		// setBound(위치,위치,사이즈,사이즈) (200,200,800,600)
		setTitle("버턴의위치");
		setVisible(true);
	}

	public static void main(String[] args) {
		MyWinEx6 mw = new MyWinEx6();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//      선생님 풀이 - 걍 간단히 푸심			
//		int ranX = (int)(Math.random()*750);
//		int ranY = (int)(Math.random()*550);

		String str = "버튼이동합니다.";
		System.out.println(str);

		if (str.equals("버튼이동합니다.")) {
			int ranX = (int) (Math.random() * 750);
			int ranY = (int) (Math.random() * 550);
			btn.setLocation(ranX, ranY);
		}
	}

}
