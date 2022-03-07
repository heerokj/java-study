package day11;

// Abstract Window Toolkit
// java.awt
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWinEx4 extends Frame implements WindowListener {

	MyWinEx4() {

		// ������ â�� ��ȭ�� ������
		// ���� �� Ŭ������ �ٰ���
		addWindowListener(this);
		// addXXXListener
		// XXXListener �������̽��� ������ ��ü�� �Ű������� ���´�=> implements�� import���ֱ�

		setSize(800, 600);
		setLocation(100, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyWinEx4 mw = new MyWinEx4();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("â�� ������ ȣ��");

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("â�� �������϶� ȣ��");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("â�� ����� �Ŀ� ȣ��");

	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("â�� ������ȭ �Ǿ����� ȣ��");

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("â�� �� ������ȭ �Ǿ����� ȣ��");

	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("â�� Ȱ��ȭ�Ǿ����� ȣ��");

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("â�� �� Ȱ��ȭ �Ǿ����� ȣ��");

	}
}
