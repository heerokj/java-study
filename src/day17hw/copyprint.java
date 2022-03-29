package day17hw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class copyprint extends JFrame implements ActionListener{
	
	JButton jbs, jbd, jbc, jb1, jb2;
	JTextField jtf1, jtf2;
	
	copyprint(){
		
		setLayout(null);
		
		//������Ʈ �ʱ�ȭ
		jbs = new JButton("SOURCE");
		jbd = new JButton("DESTINATION");
		jbc = new JButton("COPY");
		jb1 = new JButton("����");
		jb2 = new JButton("����");
		
		jtf1 = new JTextField();
		jtf2 = new JTextField();
		
		//������Ʈ ��ġ, ũ�� ����
		jbs.setBounds(100,100,200,50);
		jbd.setBounds(100,200,200,50);
		jbc.setBounds(200,300,400,50);
		jb1.setBounds(620,100,100,50);
		jb2.setBounds(620,200,100,50);
		
		jtf1.setBounds(400,100,200,50);
		jtf2.setBounds(400,200,200,50);
		
		//��ư �׼Ǹ�����
		jbs.addActionListener(this);
		jbd.addActionListener(this);
		jbc.addActionListener(this);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jtf1.addActionListener(this);
		jtf2.addActionListener(this);
		
				
		//����
		add(jbs);
		add(jbd);
		add(jbc);
		add(jb1);
		add(jb2);
		add(jtf1);
		add(jtf2);
		
		
		setTitle("���� �����");
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setBounds(300, 150, 800, 500);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		copyprint copy = new copyprint(); //��ü�����ؾ� â ��	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		Object obj = e.getSource(); 
		
		//1. source ��ư Ȥ�� ���� ��ư�� ������ ���� ���� â�� ���� ������ ����
		if(obj == jbs || obj == jb1) {
			JFileChooser jfc = new JFileChooser("c:\\");
			int result = jfc.showOpenDialog(this);
			System.out.println(result);
			if (result == JFileChooser.APPROVE_OPTION) {
				File f = jfc.getSelectedFile(); 
				System.out.println(f.getAbsolutePath()); // ������ ������
			
			
		 //2. destination ��ư Ȥ�� ���� ��ư�� ������ ���� ���� â�� ���� ������ ����	
		}else if (obj == jbd || obj == jb2) {
			JFileChooser fjc = new JFileChooser("c:\\");
			int result1 = fjc.showSaveDialog(this);
			System.out.println(result1);
			if(result1 == JFileChooser.APPROVE_OPTION) {
				System.out.println("��������");
				
				File f = fjc.getSelectedFile();
				System.out.println(f.getAbsolutePath());
			
			}

		  //3. copy ��ư�� ������  ���� �ؽ�Ʈ �ʵ��� ����� ������ �����ؼ�  �Ʒ���  �ؽ�Ʈ �ʵ��� ��ġ�� ������ ����
		}else if(obj == jbc) { 
			
			//�ؼ�........ 		
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(new File(jbs.getText())));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter(jbd.getText()));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			
			String msg = null;
			
			try {
				while ((msg = br.readLine()) != null) { 
					// Destination �ؽ�Ʈ�ʵ� �����ο� ���ϻ����Ͽ� �о�� �� �ۼ�
					bw.write(msg + "\n"); 
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				bw.flush();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}		

		}

	}

}

}





