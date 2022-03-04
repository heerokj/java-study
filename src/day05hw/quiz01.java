//야구게임 문제 - 완성 no
//[알고리즘]
//1. 컴퓨터가 세자리숫자를 생성한다.
//2. 사용자로부터 3자리숫자를 입력받는다.
//3. 판별한다.(자리와 숫자가 일치하면 :strike /자리는다르지만 숫자가일치하면 : ball)
//4. 출력한다.
//5. 3strike이면 종료한다.
//6. 아니면 2번으로 돌아가서 반복한다.

package day05hw;

import java.util.Arrays;
import java.util.Scanner;

public class quiz01 {
	public static void main(String[] args) {
		// 1. 컴퓨터가 세자리숫자를 생성
		int[] num = new int[3];
//		num[0] = (int)(Math.random()*10);
//		num[1] = (int)(Math.random()*10);
//		num[2] = (int)(Math.random()*10); 
//      아래처럼 간단히 
//      for(int i =0; i<num.length; i++) {
//      num[i] = (int)(Math.random()*10);
//       }

		// 중복제거해주기
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10);
			for (int j = 0; j < i; j++) {
				if (num[j] == num[i]) {
					i--;
					break; // 모르겠다..ok.. 동영상찍는거보기
				}
			}
		}
		System.out.println("랜덤값 : " + Arrays.toString(num));

		
		// 2. 사용자로부터 3자리 숫자 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자입력값 : ");
		int value = sc.nextInt();
		int[] user = new int[3];
		user[0] = value / 100;
		user[1] = value % 100 / 10;
		user[2] = value % 10;

		System.out.println("사용자입력값 : " + Arrays.toString(user));

		
		// 3. 판별

		int ball = 0;
		int strike = 0;

		for (int i = 0; i < num.length; i++)
			if (num[i] == user[i]) {
				strike++;
			} else {
				for (int j = 0; j < num.length; j++) {
					if (user[i] == num[j]) {
						ball++;
					}
				}
			}

		System.out.println(strike + "S" + "," + ball + "B");
	}
}
