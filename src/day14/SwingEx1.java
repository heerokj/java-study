package day14;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

//AWT �����Ǿ ������� ���� SWING(�տ� J������ ���)
public class SwingEx1 extends JFrame { // Xâ������ â �Ⱥ��̰� ����(������ ����Ȱ� �ƴ�)
	
	JButton btn;
	SwingEx1(){
		ImageIcon img1 = new ImageIcon("images/baby.jpg");		
		btn = new JButton(img1);
		add(btn);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); // �������ִ� ���
		setBounds(100,100,800,600);
		setVisible(true); 		
		
	}
	
	
	
	
	public static void main(String[] args) {
		SwingEx1 sw = new SwingEx1();
		

	}

}
