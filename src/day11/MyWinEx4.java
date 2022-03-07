package day11;

// Abstract Window Toolkit
// java.awt
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWinEx4 extends Frame implements WindowListener {

	MyWinEx4() {

		// 윈도우 창에 변화를 감지기
		// 현재 내 클래스에 줄거임
		addWindowListener(this);
		// addXXXListener
		// XXXListener 인터페이스를 구현한 객체를 매개변수로 갖는다=> implements와 import해주기

		setSize(800, 600);
		setLocation(100, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyWinEx4 mw = new MyWinEx4();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("창이 열릴때 호출");

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("창이 종료중일때 호출");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("창이 종료된 후에 호출");

	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("창이 아이콘화 되었을때 호출");

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("창이 비 아이콘화 되었을때 호출");

	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("창이 활성화되었을때 호출");

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("창이 비 활성화 되었을때 호출");

	}
}
