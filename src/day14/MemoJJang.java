package day14;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

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
		
		//컴포넌트 초기화		
		jmiNew = new JMenuItem("NEW");
		jmiOpen = new JMenuItem("OPEN");
		jmiSave = new JMenuItem("SAVE");
		jmiExit = new JMenuItem("EXIT");
		jmiHelp = new JMenuItem("HELP");
		
		jmFile = new JMenu("FILE");
		jmHelp = new JMenu("HELP");
		
		jmb = new JMenuBar();
		
		//메뉴에 메뉴아이템을 부착
		jmFile.add(jmiNew);
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.addSeparator(); //구분선
		jmFile.add(jmiExit);
		jmHelp.add(jmiHelp);
		
		//메뉴바에 메뉴를 부착
		jmb.add(jmFile); 
		jmb.add(jmHelp);
		
		//프레임에 메뉴바를 부착
		setJMenuBar(jmb);
		
		//종료 메뉴아이템을 클릭하면 종료
		jmiExit.addActionListener(this);
		jmiNew.addActionListener(this);
		jmiOpen.addActionListener(this);
		jmiSave.addActionListener(this);
		jmiHelp.addActionListener(this);
		
		
		
		//<JTextArea>
		//컴포넌트 초기화 & 
		jta = new JTextArea(); 
		Font f = new Font("굴림체",Font.PLAIN,30);
		jta.setFont(f);

		
		//<JScrollPane>
		//컴포넘트 초기화 & 컴포넌트 부착
		//jsp = new JScrollPane(정중앙에부착할컴포넌트, 수직스크롤바정책, 수평스크롤바정책);
		jsp = new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED );
		//add(jta); 이거 하면 안됨
		add(jsp);
		 
		
		
		setTitle("제목없음 - Windows  메모장");
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setBounds(450, 150, 800, 600);
		setVisible(true);
	}

 

	public static void main(String[] args) {
		MemoJJang memo = new MemoJJang();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		String cmd = e.getActionCommand();  //그리좋은방법은아냐
//		System.out.println(cmd); 		
		Object obj = e.getSource(); // 오브젝트가 넘어옴
		if(obj == jmiExit) { 
			System.out.println("종료합니다.");
			System.exit(0);		
			
		}else if(obj == jmiNew) {
			//jta에 글자가 있다면 가져오기
			String txt = jta.getText();
			//글자의 길이를 구해서 길이가 !=0이면
			if(txt.length()!=0) {
				//사용자에게 옵션창을 띄어서 진짜 저장할래 라는 메세지로 물어보기
				int result = JOptionPane.showConfirmDialog(this, "저장할래?","메모장",
						JOptionPane.YES_NO_CANCEL_OPTION);
				System.out.println("길이가 0이 아님..");
				System.out.println(result);	
				if( result == JOptionPane.YES_NO_OPTION) {
					//저장하자..
					System.out.println("저장하자"); 
				}
			}							
			jta.setText(""); // New눌렀을때 나타나는 옵션창의 YES또는NO또는CANCEL눌렀을때 TexArea에 내용없어짐
			
		}else if(obj ==jmiOpen) {
			JFileChooser jfc = new JFileChooser("c:\\"); //특정 디렉토리로 띄우게 됨
			int result = jfc.showOpenDialog(this); //'열기'창 뜸(찾는위치 c드라이브로 되어있음) /정수타입으로 리턴(확인:0/취소:1)
			System.out.println(result);//open c드라이브 hello.java클릭 후 확인:0출력 /취소:1출력
			if(result == JFileChooser.APPROVE_OPTION) {  //result == 0           
		   File f = jfc.getSelectedFile();
		   System.out.println("파일의 절대경로 : "+f.getAbsolutePath());		
		  } 		
		  
	  }else if(obj == jmiSave) {
		  JFileChooser fjc = new JFileChooser("c:\\");
		  int result = fjc.showSaveDialog(this); //저장다이아로그를 보여줘 //정수타입으로 리턴(확인:0/취소:1)
		  System.out.println(result); //출력
		  if(result == JFileChooser.APPROVE_OPTION) { // result가 0이라면 즉, 승인옵션이라면
			  System.out.println("파일저장..");
		  }
		  
	  }else if(obj == jmiHelp) {
		  for(int i =0; i<10;i++) {
			  new SwingEx1(); //창 10개 뜸
			  setVisible(false); //내창은 감추기 
		  }
	 
	  }
	
   }		  

}
