package day15hw;
//Q08.다음 코드를 실행할때 아래와 같은 두가지 종류의 

import java.io.IOException;

//결과가 발생할수 있다. 
//출력결과와 같은 처리하기위해 아래 코드를 수정하시오

import java.util.Random;

public class Q08ExceptionEx08 {
	public static void main(String[] args) {
		int num[] = new int[3];

		Random rnd = new Random();
		int index = rnd.nextInt(10);
		try {
			num[index] = rnd.nextInt(500);
			System.out.println("index : " + index + "num[ " + index + "] : " + num[index]);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("index : " + index + "num[ " + index + "] : 존재하지 않습니다.");
		}

	}
}
