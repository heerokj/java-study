package day15hw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Q04_thread extends Thread {
	JButton[] jbtn;
	ImageIcon[] img;

	Q04_thread(JButton[] jbtn, ImageIcon[] img) {
		this.jbtn = jbtn;
		this.img = img;
	}

	public void run() {

		int[] m = new int[6];
		HashSet hs = new HashSet();
		Random rnd = new Random();

		while (hs.size() < 6) {
			int v = rnd.nextInt(45) + 1;
			hs.add(v);
		}

		Iterator it = hs.iterator();
		for (int i = 0; i < m.length; i++) {
			m[i] = (int) it.next();
		}
		Arrays.sort(m);

		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i] + "\t");
		}
		System.out.println();

		String str1 = Integer.toString(m[0]);
		String str2 = Integer.toString(m[1]);
		String str3 = Integer.toString(m[2]);
		String str4 = Integer.toString(m[3]);
		String str5 = Integer.toString(m[4]);
		String str6 = Integer.toString(m[5]);

		jbtn[0].setText(str1);
		jbtn[1].setText(str2);
		jbtn[2].setText(str3);
		jbtn[3].setText(str4);
		jbtn[4].setText(str5);
		jbtn[5].setText(str6);
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 버튼 위에 숫자 이미지 출력
		for (int i = 0; i < m.length; i++) {
			jbtn[i].setIcon(img[m[i]]);

		}

	}

}