package day20hw;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Search extends JFrame implements ActionListener{
	
	JButton jbtnSearch, jbtnAdd;
	JLabel jlDname, jlLoc, jlSearch, jlAdd;
	JTextField jtfSearch, jtfDname, jtfLoc;
	JScrollPane jsp;
	Font f = new Font("���ü",Font.BOLD,15);
	
	public Search() {
		setLayout(null);
		//��ü �ʱ�ȭ
		jbtnSearch = new JButton("�˻�");
		jbtnAdd = new JButton("ADD");
		jlSearch = new JLabel("�μ��˻�");
		jlAdd = new JLabel("�μ��߰�");
		jlDname = new JLabel("�μ���");
		jlLoc = new JLabel("��ġ");
		jtfSearch = new JTextField();
		jtfDname = new JTextField();
		jtfLoc = new JTextField();
		jsp = new JScrollPane();
		
	/////��ü ��ġ,ũ��, ����
		//��ư
		jbtnSearch.setBounds(200,50,100,50);
		add(jbtnSearch);
		jbtnAdd.setBounds(450,500,100,50);
		add(jbtnAdd);
		
		//�ؽ�Ʈ����
		jsp.setBounds(50,130,500,350);
		add(jsp);
			
		//��
		jlSearch.setBounds(70,10,100,50);
		add(jlSearch);
		jlSearch.setFont(f);
		jlAdd.setBounds(80,450,100,50);
		add(jlAdd);
		jlAdd.setFont(f);
		jlDname.setBounds(80,500,100,50);
		add(jlDname);
		jlDname.setFont(f);
		jlLoc.setBounds(270,500,100,50);
		add(jlLoc);
		jlLoc.setFont(f);
		
		//�ؽ�Ʈ�ʵ�
		jtfSearch.setBounds(50,50,100,50);
		add(jtfSearch);
		jtfDname.setBounds(150,500,100,50);
		add(jtfDname);
		jtfLoc.setBounds(320,500,100,50);
		add(jtfLoc);
		
	
		//�׼Ǹ�����
		jbtnSearch.addActionListener(this);
		jbtnAdd.addActionListener(this);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300,100,600,600);
		setVisible(true);
		

	}

	public static void main(String[] args) {
		Search s = new Search();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == jbtnSearch) {
			
		}
		
	}
}
