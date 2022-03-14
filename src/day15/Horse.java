package day15; //다른사람꺼 주석 보기

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

//멀티스레드 처리
//상속 : A is a B
//     말 has a 버튼

public class Horse extends Thread {

	JButton jbtn; //지역변수가 멤버면수로 써야하니깐 아래에 this써주기
	ImageIcon img1,img2;
	
	Horse(JButton jbtn,ImageIcon img1,ImageIcon img2) { 
		this.jbtn = jbtn;
		this.img1 = img1;
		this.img2 = img2;
		System.out.println(this.jbtn);
	}

	@Override
	public void run() {
		// 동시에 처리할 코드..
		jbtn.setIcon(img1);//달리는 이미지로 교체
		Random rnd = new Random();
		for (int i = 0; i <= 100; i++) {
			jbtn.setLocation(jbtn.getX() + rnd.nextInt(20), 
					jbtn.getY());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		jbtn.setIcon(img2); //정지된 이미지로 교체
	}

}
