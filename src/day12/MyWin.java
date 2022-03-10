package day12;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWin extends Frame {

	MyWin() {
// 		4. �͸� �̳� Ŭ����(Anonymous Inner Class) : Ŭ������ ����� ��ü�� ������ ���ÿ� �ϴ� �̸����� Ŭ����(��ȸ��)

//		WindowAdapter wa = new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.out.println("�����մϴ�");
//				System.exit(0);
//			}
//		};

		// �ݱ��ư Ŭ�� �� â ����
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("�����մϴ�");
				System.exit(0);
			}
		});

		// ������â ��ġ, ũ�� ����, ���̰�
		setBounds(100, 100, 800, 600);
		setVisible(true);
	}

	public static void main(String[] args) {

		// ������ ��ü ����
		MyWin mw = new MyWin();

	}

}