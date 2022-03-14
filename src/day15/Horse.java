package day15; //�ٸ������ �ּ� ����

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

//��Ƽ������ ó��
//��� : A is a B
//     �� has a ��ư

public class Horse extends Thread {

	JButton jbtn; //���������� �������� ����ϴϱ� �Ʒ��� this���ֱ�
	ImageIcon img1,img2;
	
	Horse(JButton jbtn,ImageIcon img1,ImageIcon img2) { 
		this.jbtn = jbtn;
		this.img1 = img1;
		this.img2 = img2;
		System.out.println(this.jbtn);
	}

	@Override
	public void run() {
		// ���ÿ� ó���� �ڵ�..
		jbtn.setIcon(img1);//�޸��� �̹����� ��ü
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
		jbtn.setIcon(img2); //������ �̹����� ��ü
	}

}
