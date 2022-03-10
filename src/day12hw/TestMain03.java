package day12hw; //에러..뭐임.. =>ok

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestMain03 extends Frame implements ActionListener {

	Button btn;
	Label lb;
	TextField tf; 

	TestMain03() {

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
		});

		// 컴포넌트 초기화
		btn = new Button("print");
		lb = new Label("단");
		tf = new TextField();

		// 배치관리자 X
		setLayout(null);
		//
		Font f = new Font("고딕", Font.BOLD, 30);
		tf.setFont(f);

		// 컴포넌트 크기와 위치지정
		btn.setBounds(150, 200, 300, 50);
		lb.setBounds(350, 100, 100, 50);
		tf.setBounds(150, 100, 150, 50);

		// 현재 프레임에 부착
		add(btn);
		add(lb);
		add(tf);

		btn.addActionListener(this); //초기화하기전에 하면 에러남 널포인트

		setBounds(100, 100, 600, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		TestMain03 tm = new TestMain03();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 1.텍스트필드의 값 가져오기
		String inputData = tf.getText();
		// 2.문자 ==> 숫자로 형 변환
		int dan = Integer.parseInt(inputData);
		// 3.구구단을 콘솔을 출력
		for (int i = 0; i <= 9; i++) {
			System.out.println(dan + "*" + i + " = " + dan * i);
		}
	}
}
