package day17; //Member클래스와 연관  // '객체' 저장하기   ok 

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOEx11 {
	public static void main(String[] args) throws IOException {
		
		//멤버 객체를 생성하영 c:\\member.txt 파일에 저장
		
		Member m1 = new Member("aaa", "bbb","hong","율도국","hong@gmail.com", 20 );
		
		FileOutputStream fos = new FileOutputStream("c:\\member.txt");
					
		// 객체를 저장 
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//Serializable 인터페이스를 구현한 객체만 저장하고 읽을 수 있음(member class 에서 Serializable 인터페이스함?)
		oos.writeObject(m1); //writeObject(Object obj) 
		
		
	}

}
