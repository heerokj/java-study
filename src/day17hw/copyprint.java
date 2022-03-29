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
		
		//컴포넌트 초기화
		jbs = new JButton("SOURCE");
		jbd = new JButton("DESTINATION");
		jbc = new JButton("COPY");
		jb1 = new JButton("선택");
		jb2 = new JButton("선택");
		
		jtf1 = new JTextField();
		jtf2 = new JTextField();
		
		//컴포넌트 위치, 크기 조정
		jbs.setBounds(100,100,200,50);
		jbd.setBounds(100,200,200,50);
		jbc.setBounds(200,300,400,50);
		jb1.setBounds(620,100,100,50);
		jb2.setBounds(620,200,100,50);
		
		jtf1.setBounds(400,100,200,50);
		jtf2.setBounds(400,200,200,50);
		
		//버튼 액션리스너
		jbs.addActionListener(this);
		jbd.addActionListener(this);
		jbc.addActionListener(this);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jtf1.addActionListener(this);
		jtf2.addActionListener(this);
		
				
		//부착
		add(jbs);
		add(jbd);
		add(jbc);
		add(jb1);
		add(jb2);
		add(jtf1);
		add(jtf2);
		
		
		setTitle("파일 복사기");
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setBounds(300, 150, 800, 500);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		copyprint copy = new copyprint(); //객체생성해야 창 보	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		Object obj = e.getSource(); 
		
		//1. source 버튼 혹은 선택 버튼을 누르면 파일 열기 창을 띄우고 파일을 선택
		if(obj == jbs || obj == jb1) {
			JFileChooser jfc = new JFileChooser("c:\\");
			int result = jfc.showOpenDialog(this);
			System.out.println(result);
			if (result == JFileChooser.APPROVE_OPTION) {
				File f = jfc.getSelectedFile(); 
				System.out.println(f.getAbsolutePath()); // 파일의 절대경로
			
			
		 //2. destination 버튼 혹은 선택 버튼을 누르면 파일 저장 창을 띄우고 파일을 선택	
		}else if (obj == jbd || obj == jb2) {
			JFileChooser fjc = new JFileChooser("c:\\");
			int result1 = fjc.showSaveDialog(this);
			System.out.println(result1);
			if(result1 == JFileChooser.APPROVE_OPTION) {
				System.out.println("파일저장");
				
				File f = fjc.getSelectedFile();
				System.out.println(f.getAbsolutePath());
			
			}

		  //3. copy 버튼을 누르면  위쪽 텍스트 필드의 경로의 파일을 복사해서  아래쪽  텍스트 필드경로 위치에 파일을 저장
		}else if(obj == jbc) { 
			
			//해설........ 		
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
					// Destination 텍스트필드 절대경로에 파일생성하여 읽어온 값 작성
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





