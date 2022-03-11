package day14;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class chatting extends JFrame implements ActionListener, KeyListener{

	JTextArea jta;
	JTextField jtf;
	JButton jbtn;
	JScrollPane jsp;
	JPanel jp; // �׳� �� 

	String[] msg = {
			"�� �Ծ���?","������?","�׳� ���� ����","���̾�",
			"���� �԰� �ٴϳ�", "�Ⱦ�", "����"
	};
	Random rnd = new Random();
	
		
	chatting() {
		jp = new JPanel();
		jta = new JTextArea();
		jtf = new JTextField(20); // textĥ �� �ִ� ����Ȯ��
		jbtn = new JButton("send");
		jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		Font f  = new Font("����ü",Font.PLAIN,20);	
		jta.setFont(f);
		jtf.setFont(f);
		
		// jbtn.setBounds(270, 500, 100, 50); �䷸�� �ϸ� �ȵǳ�??
	
		
		add(jsp, "Center"); // ���߾ӿ� ����(Center�Ⱥپ ���߾��̱� ��)
		//add(jbtn, "South");
		//add(jtf, "South"); ���ļ� ��Ÿ�� �׷��� JPanel����ϱ�
		jp.add(jtf); //�ؽ�Ʈ
		jp.add(jbtn); //��ư => �����߿� (�ؽ�Ʈ ���� ��ư)
		add(jp,"South");
		
		
		//�̺�Ʈ ó��(��ư�� ������ �ؽ�Ʈ�� â�� ��Ÿ����)
		jbtn.addActionListener(this);
		
				
		// ������ư â ����(�ƿ�����)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		// â ������ �� ����
		setTitle("ä��â");
		setBounds(100, 100, 400, 600);
		setVisible(true);
		
		
		//����ڰ� ä���� �������� ���ϰ�
		jta.setEditable(false);
				
		
		// �⺻������ Ŀ���� ä��â �ʵ忡 �ְ��ϱ�
        jtf.requestFocusInWindow(); //����: setVisible(true); ������!
        
        
        // Ű���忡 �̺�Ʈ�� ������ ����(Ű���� ����Űġ�� �ؽ�Ʈ�� ä��â�� �Է�)
        jtf.addKeyListener(this);
        
        
        //ó�� â ų�� ��Ÿ��
        jta.append("�ɽ��� : �ݰ���");              
	}

		
	public static void main(String[] args) {	
		
		chatting ch = new chatting(); // chatting ch(); �̷��Ե� ��밡��

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//1. jtf�� �� ��������
		String data = jtf.getText(); //�ؽ�Ʈ�����ͼ� data����
		
		//2. jta�� �� ���� �����ϱ�
	//	jta.setText(data); //â�� data ����
		jta.append(data+"\n"); //���� ���´� �ؽ�Ʈ ������ ����
		
		//3. �ؽ�Ʈ �ʵ忡 ��������� (���ڽἭ send������ �ʵ忡(âx)����������)
		jtf.setText("");		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent e) {
		//1.����Ű�� ���ȴ��� �Ǵ�
		int code = e.getKeyCode();
		if(code == KeyEvent.VK_ENTER ) {
			String data = jtf.getText();
			jta.append("�� :"+data+"\n");
			jtf.setText("");
			//���� �ɽ����� ��ȭ ���(���� �ؽ�Ʈ �Է������� ���)
			int size = msg.length; //7
			//�����̱�
			int idx = rnd.nextInt(size); //0~6 ����
			
			String m  = msg[idx]; //�ɽ��� ��ȭ ����
			
			jta.append("�ɽ��� : "+m+"\n");
			
			//���ٷ� ��Ÿ����..
			//jta.append("�ɽ��� : "+msg[rnd.nextInt(msg.length)]+"\n");
			
		}	
	}
	
	@Override
	public void keyReleased(KeyEvent e) {}
	
}
