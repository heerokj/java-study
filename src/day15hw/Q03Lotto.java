package day15hw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Q03Lotto extends JFrame implements ActionListener {

	JButton click;
	JButton [] jbtn;
	ImageIcon [] img;
	
	Q03Lotto() {

		setLayout(null);
		
		// 컴포넌트 초기화		
		img = new ImageIcon[46];
		jbtn = new JButton[6];
		click = new JButton("인생은 한방!");

		img[1] = new ImageIcon("src/imags/ball1.png");
		img[2] = new ImageIcon("src/imags/ball2.png");
		img[3] = new ImageIcon("src/imags/ball3.png");
		img[4] = new ImageIcon("src/imags/ball4.png");
		img[5] = new ImageIcon("src/imags/ball5.png");
		img[6] = new ImageIcon("src/imags/ball6.png");
		img[7] = new ImageIcon("src/imags/ball7.png");
		img[8] = new ImageIcon("src/imags/ball8.png");
		img[9] = new ImageIcon("src/imags/ball9.png");
		img[10] = new ImageIcon("src/imags/ball10.png");
		img[11] = new ImageIcon("src/imags/ball11.png");
		img[12] = new ImageIcon("src/imags/ball12.png");
		img[13] = new ImageIcon("src/imags/ball13.png");
		img[14] = new ImageIcon("src/imags/ball14.png");
		img[15] = new ImageIcon("src/imags/ball15.png");
		img[16] = new ImageIcon("src/imags/ball16.png");
		img[17] = new ImageIcon("src/imags/ball17.png");
		img[18] = new ImageIcon("src/imags/ball18.png");
		img[19] = new ImageIcon("src/imags/ball19.png");
		img[20] = new ImageIcon("src/imags/ball20.png");
		img[21] = new ImageIcon("src/imags/ball21.png");
		img[22] = new ImageIcon("src/imags/ball22.png");
		img[23] = new ImageIcon("src/imags/ball23.png");
		img[24] = new ImageIcon("src/imags/ball24.png");
		img[25] = new ImageIcon("src/imags/ball25.png");
		img[26] = new ImageIcon("src/imags/ball26.png");
		img[27] = new ImageIcon("src/imags/ball27.png");
		img[28] = new ImageIcon("src/imags/ball28.png");
		img[29] = new ImageIcon("src/imags/ball29.png");
		img[30] = new ImageIcon("src/imags/ball30.png");
		img[31] = new ImageIcon("src/imags/ball31.png");
		img[32] = new ImageIcon("src/imags/ball32.png");
		img[33] = new ImageIcon("src/imags/ball33.png");
		img[34] = new ImageIcon("src/imags/ball34.png");
		img[35] = new ImageIcon("src/imags/ball35.png");
		img[36] = new ImageIcon("src/imags/ball36.png");
		img[37] = new ImageIcon("src/imags/ball37.png");
		img[38] = new ImageIcon("src/imags/ball38.png");
		img[39] = new ImageIcon("src/imags/ball39.png");
		img[40] = new ImageIcon("src/imags/ball40.png");
		img[41] = new ImageIcon("src/imags/ball41.png");
		img[42] = new ImageIcon("src/imags/ball42.png");
		img[43] = new ImageIcon("src/imags/ball43.png");
		img[44] = new ImageIcon("src/imags/ball44.png");
		img[45] = new ImageIcon("src/imags/ball45.png");
		img[0] = new ImageIcon("src/imags/q.jpg");

		
		// 버튼 배열 6개 생성
		for (int i = 0; i < jbtn.length; i++) {
			jbtn[i] = new JButton(img[0]);
		}

		// 컴포넌트 위치 크기설정
		
		jbtn[0].setBounds(100, 100, 50, 50);
		jbtn[1].setBounds(150, 100, 50, 50);
		jbtn[2].setBounds(200, 100, 50, 50);
		jbtn[3].setBounds(250, 100, 50, 50);
		jbtn[4].setBounds(300, 100, 50, 50);
		jbtn[5].setBounds(350, 100, 50, 50);
		click.setBounds(100, 250, 300, 50);

		// 컴포넌트 추가
		add(jbtn[0]);
		add(jbtn[1]);
		add(jbtn[2]);
		add(jbtn[3]);
		add(jbtn[4]);
		add(jbtn[5]);
		add(click);


		// 이벤트 처리
		click.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 200, 500, 400);
		setTitle("로또");
		setVisible(true);
	}

	public static void main(String[] args) {
		Q03Lotto lotto = new Q03Lotto();
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

			jbtn[0].setText(str1);
			jbtn[1].setText(str2);
			jbtn[2].setText(str3);
			jbtn[3].setText(str4);
			jbtn[4].setText(str5);
			jbtn[5].setText(str6);
			
			// 버튼 위에 숫자 이미지 출력
			for (int i = 0; i < m.length; i++) {
					jbtn[i].setIcon(img[m[i]]);

		}

	}
}}
