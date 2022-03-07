package day11;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWinEx2 extends Frame {

	Button btnYes, btnNo;
	MyWinEx2() {
		btnYes = new Button("Yes");
		btnNo = new Button("No");
		
		//배치관리자 : Frame : BorderLayout 기본으로 쓰고있음
		//배치관리자 FlowLayout로 변경하기
//		FlowLayout layout =new FlowLayout();
		
		setLayout(null); //배치관리자 안쓰겠다는 의미
		
		//컴포넌트의 크기 지정하기 => 배치관리자 안써도 버튼 붙음
		btnYes.setSize(100,60);
		btnNo.setSize(100,60);
		
		//컴포넌트의 위치
		btnYes.setLocation(200,450);
		btnNo.setLocation(200,450);		
		
		// <Yes버튼을 클릭해면 안녕하세요 메세지를 콘솔에 출력>
		// 1.이벤트 소스결정 : btnYes
		// 2.이벤트 리스너 추가 : ActionListener
		Handler2 hd = new Handler2();
		btnYes.addActionListener(hd);
		btnNo.addActionListener(hd);
		//3. 핸들러정의 (Handler hd = new Handler();)
		
		//컨테이너에 부착
		add(btnYes); 
		add(btnNo);
	
		setTitle("Yes or No");
		setSize(800, 600);
		setLocation(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWinEx2 mw = new MyWinEx2();
	}
}

class Handler2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand(); //getActionCommand : 버튼에 있는 글자가 넘어옴
		if(cmd.equals("Yes")) {
			System.out.println("YES 버튼 눌림");
		}else {
			System.out.println("NO 버튼 눌림");			
		}				
	}	
}