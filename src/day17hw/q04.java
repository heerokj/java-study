package day17hw;

//Q04. File 클래스를 통해서 파일을 생성하고 File클래스의 다양한 메서드를 이용해서
//결과를 출력하는 코드는 작성하시오(각 메서드가 하는 기능을 정리)

import java.io.File;

public class q04 {
	public static void main(String[] args) {
		
		File f = new File("C:\\q04.txt");
		System.out.println(f.getAbsolutePath()); // 파일의 절대경로
		System.out.println(f.canExecute());  //프로그램이 추상 경로 이름으로 표시된 파일을 실행할수있는지 여부
		System.out.println(f.canRead()); //파일 읽을 수 있는지 여부
		System.out.println(f.getName()); // 파일이름

	
		
	}
}
