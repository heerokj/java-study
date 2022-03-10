package day12hw;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class TestMain01 extends Frame {

	Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17,
			btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30, btn31, btn32,
			btn33, btn34, btn35, btn36, btn37, btn38, btn39, btn40, btn41, btn42, btn43, btn44, btn45, btn46, btn47,
			btn48, btn49, btn50;

	TestMain01() {

		btn1 = new Button("btn1");
		btn2 = new Button("btn2");
		btn3 = new Button("btn3");
		btn4 = new Button("btn4");
		btn5 = new Button("btn5");
		btn6 = new Button("btn6");
		btn7 = new Button("btn7");
		btn8 = new Button("btn8");
		btn9 = new Button("btn9");
		btn10 = new Button("btn10");
		btn11 = new Button("btn11");
		btn12 = new Button("btn12");
		btn13 = new Button("btn13");
		btn14 = new Button("btn14");
		btn15 = new Button("btn15");
		btn16 = new Button("btn16");
		btn17 = new Button("btn17");
		btn18 = new Button("btn18");
		btn19 = new Button("btn19");
		btn20 = new Button("btn20");
		btn21 = new Button("btn21");
		btn22 = new Button("btn22");
		btn23 = new Button("btn23");
		btn24 = new Button("btn24");
		btn25 = new Button("btn25");
		btn26 = new Button("btn26");
		btn27 = new Button("btn27");
		btn28 = new Button("btn28");
		btn29 = new Button("btn29");
		btn30 = new Button("btn30");
		btn31 = new Button("btn31");
		btn32 = new Button("btn32");
		btn33 = new Button("btn33");
		btn34 = new Button("btn34");
		btn35 = new Button("btn35");
		btn36 = new Button("btn36");
		btn37 = new Button("btn37");
		btn38 = new Button("btn38");
		btn39 = new Button("btn38");
		btn40 = new Button("btn40");
		btn41 = new Button("btn41");
		btn42 = new Button("btn42");
		btn43 = new Button("btn43");
		btn44 = new Button("btn44");
		btn45 = new Button("btn45");
		btn46 = new Button("btn46");
		btn47 = new Button("btn47");
		btn48 = new Button("btn48");
		btn49 = new Button("btn49");
		btn50 = new Button("btn50");

		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
		add(btn10);
		add(btn11);
		add(btn12);
		add(btn13);
		add(btn14);
		add(btn15);
		add(btn16);
		add(btn17);
		add(btn18);
		add(btn19);
		add(btn20);
		add(btn21);
		add(btn22);
		add(btn23);
		add(btn24);
		add(btn25);
		add(btn26);
		add(btn27);
		add(btn28);
		add(btn29);
		add(btn30);
		add(btn34);
		add(btn35);
		add(btn36);
		add(btn37);
		add(btn38);
		add(btn39);
		add(btn40);
		add(btn41);
		add(btn42);
		add(btn43);
		add(btn44);
		add(btn45);
		add(btn46);
		add(btn47);
		add(btn48);
		add(btn49);
		add(btn50);
	
	 //FlowLayout 객체만들고
	 FlowLayout layout = new FlowLayout();
	 this.setLayout(layout);
		
	//현재 프레임 배치관리자를 FlowLayout 변경
	 setBounds(50, 50, 800, 600); //this 생략가능
		setVisible(true);
	}

	public static void main(String[] args) {
		TestMain01 tm = new TestMain01();
	}

}
