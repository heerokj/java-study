package day12hw; // Ǯ��

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class TestMain02 extends Frame {

	Button[] btn;

	TestMain02() {

		btn = new Button[50];
		
	//System.out.println(btn[0]); //�ڷ����� �⺻���� �ʱⰪ
		
	//	btn[0] = new Button("btn1"); //�̰��� 50�� �ݺ�		
	//	add(btn[0]); //50�� �ݺ��ؾ�
		
		for(int i=0; i<btn.length; i++) {
			btn[i] = new Button("btn"+(i+1));
			add(btn[i]);
		}
		
	 FlowLayout layout = new FlowLayout();	 
	 this.setLayout(layout);
		
	 setBounds(50, 50, 800, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		TestMain02 tm = new TestMain02();
	}

}
