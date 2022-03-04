package day07;

import day06.Person;

//import day6.Person;

//✔ctrl + shift + o : 자동으로 import



public class TestMain4 {
	public static void main(String[] args) {

		
		Person p1 = new Person();
		p1.setAge(30);
		System.out.println(p1.getAge());
		
		
//		<day06 Person class의 변수를 public으로 설정했을때>
//		Person p1 = new Person();  // 외부(여기)에서도 접가능
//	    System.out.println(p1.나이); 			

//		<day06 Person class의 변수를 private로 설정했을때>
//      그런데 나이 변수를 직접접근 차단했다면(외부에서 접근못하게 차단했다면)  
//		캡슐화..
//		1.public  2.setter  3.getter  사용하기


	}

}
