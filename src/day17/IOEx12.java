package day17;  //Member클래스와 연관  // '객체' 읽어오기   ok 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IOEx12 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		FileInputStream fis = new FileInputStream("c:\\member.txt");
		
		//객체읽어오기
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//어케읽어
		Object obj = ois.readObject(); // readObject()
		
		//오브젝트는 메서드 11개밖에없으니 
		//겍체형변환
		Member m2 = (Member)obj; 
		System.out.println(m2.getName()); //한개씩 꺼내서 정보보기
		System.out.println(m2.getId()); 
		System.out.println(m2.getPw()); 
		System.out.println(m2.getAddrs()); 
		System.out.println(m2.getEmail()); 
		System.out.println(m2.getAge()); 
		
		
		
	}

}
