package day14;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MemoJJang extends JFrame implements ActionListener{

	JScrollPane jsp;
	
	JMenuBar jmb;
	JMenu jmFile,jmHelp;
	JMenuItem jmiNew, jmiOpen, jmiSave, jmiExit, jmiHelp;	
	
	JTextArea jta;
	 
	MemoJJang() {
		
		//������Ʈ �ʱ�ȭ		
		jmiNew = new JMenuItem("NEW");
		jmiOpen = new JMenuItem("OPEN");
		jmiSave = new JMenuItem("SAVE");
		jmiExit = new JMenuItem("EXIT");
		jmiHelp = new JMenuItem("HELP");
		
		jmFile = new JMenu("FILE");
		jmHelp = new JMenu("HELP");
		
		jmb = new JMenuBar();
		
		//�޴��� �޴��������� ����
		jmFile.add(jmiNew);
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.addSeparator(); //���м�
		jmFile.add(jmiExit);
		jmHelp.add(jmiHelp);
		
		//�޴��ٿ� �޴��� ����
		jmb.add(jmFile); 
		jmb.add(jmHelp);
		
		//�����ӿ� �޴��ٸ� ����
		setJMenuBar(jmb);
		
		//��ư�� �׼Ǹ����� ����
		jmiExit.addActionListener(this);
		jmiNew.addActionListener(this);
		jmiOpen.addActionListener(this);
		jmiSave.addActionListener(this);
		jmiHelp.addActionListener(this);
		 
		
		
		//<JTextArea>
		//������Ʈ �ʱ�ȭ & 
		jta = new JTextArea(); 
		Font f = new Font("����ü",Font.PLAIN,30);
		jta.setFont(f);
 
		
		//<JScrollPane>
		//������Ʈ �ʱ�ȭ & ������Ʈ ����
		//jsp = new JScrollPane(���߾ӿ�������������Ʈ, ������ũ�ѹ���å, ����ũ�ѹ���å);
		jsp = new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED );
		//add(jta); �̰� �ϸ� �ȵ�
		add(jsp);
		 
		
		
		setTitle("������� - Windows  �޸���");
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setBounds(450, 150, 800, 600);
		setVisible(true);
	}

 

	public static void main(String[] args) {
		MemoJJang memo = new MemoJJang();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		String cmd = e.getActionCommand();  //�׸�����������Ƴ�
//		System.out.println(cmd); 		
		Object obj = e.getSource(); // ������Ʈ�� �Ѿ��
		if(obj == jmiExit) { 
			System.out.println("�����մϴ�.");
			System.exit(0);		
			
		}else if(obj == jmiNew) {
			//jta�� ���ڰ� �ִٸ� ��������
			String txt = jta.getText();
			//������ ���̸� ���ؼ� ���̰� !=0�̸�
			if(txt.length()!=0) {
				//����ڿ��� �ɼ�â�� �� ��¥ �����ҷ� ��� �޼����� �����
				int result = JOptionPane.showConfirmDialog(this, "�����ҷ�?","�޸���",
						JOptionPane.YES_NO_CANCEL_OPTION);
				System.out.println("���̰� 0�� �ƴ�..");
				System.out.println(result);	
				if( result == JOptionPane.YES_NO_OPTION) {
					//��������..
					System.out.println("��������"); 
				}
			}							
			jta.setText(""); // New�������� ��Ÿ���� �ɼ�â�� YES�Ǵ�NO�Ǵ�CANCEL�������� TexArea�� ���������
			
		} else if (obj == jmiOpen) {

			
			// jta�� ������ ������ �����Ұ����� ����Ŀ� ������ ���� #
			int length = jta.getText().length();
			// 0�� �Ƹ���� �� ������ �����ϸ�
			if (length != 0) {
				int result2 = JOptionPane.showConfirmDialog(this, "���泻���� �����Ͻðڽ��ϱ�?", "�޸���",
						JOptionPane.YES_NO_CANCEL_OPTION);
				System.out.println("result2 :" + result2);  // #�� ?
				
				//���� yes��ư�� �����ٸ� ����
				if (result2 == JOptionPane.YES_OPTION) {
					
					save(); //�����ͱ�� �̿��ؼ� �����ϰ� ���� => �Ʒ� private void save() �����
					        //=> day17 teatmain ����
								
					System.out.println("���� ������ ����");
				}
			}

			
			// ���� �ɼ��г� ����
			JFileChooser jfc = new JFileChooser("c:\\"); // Ư�� ���丮�� ���� ��
			int result = jfc.showOpenDialog(this); // '����'â ��(ã����ġ c����̺�� �Ǿ�����) /����Ÿ������ ����(Ȯ��:0/���:1)
		 	System.out.println(result);// open c����̺� hello.javaŬ�� �� Ȯ��:0��� /���:1���
			if (result == JFileChooser.APPROVE_OPTION) { // result == 0
				File f = jfc.getSelectedFile(); // �����ߴ� ���ϰ�������
				System.out.println("������ ������ : " + f.getAbsolutePath());
				// c:\Hello.java

				String msg = null;
				jta.setText(""); // �������ִ� ���� �����(���Ͽ����Ҷ�, �޸��忡������ �������ִ� ������ ����� ���Ͽ�����)
				try {
					FileReader fr = new FileReader(f);
					BufferedReader br = new BufferedReader(fr);
					while ((msg = br.readLine()) != null) {
						jta.append(msg + "\n"); // jta�� �ٿ��ֱ�
					} 

				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}

			
		}else if (obj == jmiSave) {
			save();

			
		} else if (obj == jmiHelp) {
			for (int i = 0; i < 10; i++) {
				new SwingEx1(); // â 10�� ��
				setVisible(false); // ��â�� ���߱�
			}

		}

	}



	private void save() {
		JFileChooser fjc = new JFileChooser("c:\\");
		int result = fjc.showSaveDialog(this); // ������̾Ʒα׸� ������ //����Ÿ������ ����(Ȯ��:0/���:1)
		System.out.println(result); // ���
		if (result == JFileChooser.APPROVE_OPTION) { // result�� 0�̶�� ��, ���οɼ��̶��
			System.out.println("��������..");

			File f = fjc.getSelectedFile();
			// �����ϸ� ������ �����ΰ� ���
			System.out.println(f.getAbsolutePath());

			try {
				FileWriter fw = new FileWriter(f);

				BufferedWriter bw = new BufferedWriter(fw);
				// �ؽ�Ʈ������� ���ڰ�������
				String data = jta.getText();

				// ���Ͽ�����
				bw.write(data);
				bw.flush();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		
			
			
			
		}
	}
}
