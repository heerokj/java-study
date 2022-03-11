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
	JPanel jp; // 그냥 판 

	String[] msg = {
			"밥 먹었어?","졸리지?","그냥 집에 가라","나이쑤",
			"밥은 먹고 다니냐", "싫어", "좋아"
	};
	Random rnd = new Random();
	
		
	chatting() {
		jp = new JPanel();
		jta = new JTextArea();
		jtf = new JTextField(20); // text칠 수 있는 공간확보
		jbtn = new JButton("send");
		jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		Font f  = new Font("굴림체",Font.PLAIN,20);	
		jta.setFont(f);
		jtf.setFont(f);
		
		// jbtn.setBounds(270, 500, 100, 50); 요렇게 하면 안되나??
	
		
		add(jsp, "Center"); // 정중앙에 붙음(Center안붙어도 정중앙이긴 함)
		//add(jbtn, "South");
		//add(jtf, "South"); 겹쳐서 나타남 그래서 JPanel사용하기
		jp.add(jtf); //텍스트
		jp.add(jbtn); //버튼 => 순서중요 (텍스트 다음 버튼)
		add(jp,"South");
		
		
		//이벤트 처리(버튼을 누르면 텍스트가 창에 나타나게)
		jbtn.addActionListener(this);
		
				
		// 엑스버튼 창 종료(아예종료)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		// 창 사이즈 등 설정
		setTitle("채팅창");
		setBounds(100, 100, 400, 600);
		setVisible(true);
		
		
		//사용자가 채팅장 수정하지 못하게
		jta.setEditable(false);
				
		
		// 기본적으로 커서가 채팅창 필드에 있게하기
        jtf.requestFocusInWindow(); //순서: setVisible(true); 다음에!
        
        
        // 키보드에 이벤트가 있을때 실행(키보드 엔터키치면 텍스트가 채팅창에 입력)
        jtf.addKeyListener(this);
        
        
        //처음 창 킬때 나타남
        jta.append("심심이 : 반가워");              
	}

		
	public static void main(String[] args) {	
		
		chatting ch = new chatting(); // chatting ch(); 이렇게도 사용가능

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//1. jtf의 값 가져오기
		String data = jtf.getText(); //텍스트가져와서 data저장
		
		//2. jta에 이 값을 지정하기
	//	jta.setText(data); //창에 data 띄우기
		jta.append(data+"\n"); //전에 보냈던 텍스트 지우지 말기
		
		//3. 텍스트 필드에 글자지우기 (글자써서 send누르면 필드에(창x)글자지워짐)
		jtf.setText("");		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent e) {
		//1.엔터키가 눌렸는지 판단
		int code = e.getKeyCode();
		if(code == KeyEvent.VK_ENTER ) {
			String data = jtf.getText();
			jta.append("나 :"+data+"\n");
			jtf.setText("");
			//상대방 심심이의 대화 출력(내가 텍스트 입력했을때 대답)
			int size = msg.length; //7
			//랜덤뽑기
			int idx = rnd.nextInt(size); //0~6 정수
			
			String m  = msg[idx]; //심심이 대화 선택
			
			jta.append("심심이 : "+m+"\n");
			
			//한줄로 나타내면..
			//jta.append("심심이 : "+msg[rnd.nextInt(msg.length)]+"\n");
			
		}	
	}
	
	@Override
	public void keyReleased(KeyEvent e) {}
	
}
