package day14hw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Q05GUI_Lotto extends JFrame implements ActionListener {

	JButton jbtn1, jbtn2, jbtn3, jbtn4, jbtn5, jbtn6, jbtn7;

	Q05GUI_Lotto() {

		setLayout(null);

		// 컴포넌트 초기화
		jbtn1 = new JButton();
		jbtn2 = new JButton();
		jbtn3 = new JButton();
		jbtn4 = new JButton();
		jbtn5 = new JButton();
		jbtn6 = new JButton();
		jbtn7 = new JButton("인생은 한방!");

		// 컴포넌트 위치 크기설정
		jbtn1.setBounds(100, 100, 50, 50);
		jbtn2.setBounds(150, 100, 50, 50);
		jbtn3.setBounds(200, 100, 50, 50);
		jbtn4.setBounds(250, 100, 50, 50);
		jbtn5.setBounds(300, 100, 50, 50);
		jbtn6.setBounds(350, 100, 50, 50);
		jbtn7.setBounds(100, 250, 300, 50);

		// 컴포넌트 추가
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		add(jbtn4);
		add(jbtn5);
		add(jbtn6);
		add(jbtn7);


		// 이벤트 처리
		jbtn7.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 200, 500, 400);
		setTitle("로또");
		setVisible(true);
	}

	public static void main(String[] args) {
		Q05GUI_Lotto lotto = new Q05GUI_Lotto();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand() == "인생은 한방!") {

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

			jbtn1.setText(str1);
			jbtn2.setText(str2);
			jbtn3.setText(str3);
			jbtn4.setText(str4);
			jbtn5.setText(str5);
			jbtn6.setText(str6);

		}

	}
}
