package day12;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWin extends Frame {

	MyWin() {
// 		4. 익명 이너 클래스(Anonymous Inner Class) : 클래스의 선언과 객체의 생성을 동시에 하는 이름없는 클래스(일회용)

//		WindowAdapter wa = new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.out.println("종료합니다");
//				System.exit(0);
//			}
//		};

		// 닫기버튼 클릭 시 창 종료
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료합니다");
				System.exit(0);
			}
		});

		// 윈도우창 위치, 크기 조정, 보이게
		setBounds(100, 100, 800, 600);
		setVisible(true);
	}

	public static void main(String[] args) {

		// 프레임 객체 생성
		MyWin mw = new MyWin();

	}

}