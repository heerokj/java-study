package day11;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWinEx2 extends Frame {

	Button btnYes, btnNo;
	MyWinEx2() {
		btnYes = new Button("Yes");
		btnNo = new Button("No");
		
		//��ġ������ : Frame : BorderLayout �⺻���� ��������
		//��ġ������ FlowLayout�� �����ϱ�
//		FlowLayout layout =new FlowLayout();
		
		setLayout(null); //��ġ������ �Ⱦ��ڴٴ� �ǹ�
		
		//������Ʈ�� ũ�� �����ϱ� => ��ġ������ �Ƚᵵ ��ư ����
		btnYes.setSize(100,60);
		btnNo.setSize(100,60);
		
		//������Ʈ�� ��ġ
		btnYes.setLocation(200,450);
		btnNo.setLocation(200,450);		
		
		// <Yes��ư�� Ŭ���ظ� �ȳ��ϼ��� �޼����� �ֿܼ� ���>
		// 1.�̺�Ʈ �ҽ����� : btnYes
		// 2.�̺�Ʈ ������ �߰� : ActionListener
		Handler2 hd = new Handler2();
		btnYes.addActionListener(hd);
		btnNo.addActionListener(hd);
		//3. �ڵ鷯���� (Handler hd = new Handler();)
		
		//�����̳ʿ� ����
		add(btnYes); 
		add(btnNo);
	
		setTitle("Yes or No");
		setSize(800, 600);
		setLocation(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWinEx2 mw = new MyWinEx2();
	}
}

class Handler2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand(); //getActionCommand : ��ư�� �ִ� ���ڰ� �Ѿ��
		if(cmd.equals("Yes")) {
			System.out.println("YES ��ư ����");
		}else {
			System.out.println("NO ��ư ����");			
		}				
	}	
}