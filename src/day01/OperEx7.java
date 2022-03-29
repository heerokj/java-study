package day01;
//7. 삼항연산자

//단항연산자 : ==,--
//이항연산자 : +,-
//삼항연산자 : (조건)?"참""거짓"

class OperEx7 {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;

		// (조건)?"참일경우의값":"거짓일경우의값"
		
		// a 와 b를 비교하여 a 가 b보다 크면(조건이 true이면) 참을 출력, 아니면 거짓을 출력
		System.out.println((a > b) ? "참" : "거짓"); //참 출력
		
		// a 가 b를 비교하여 a 와 b가 같지 않으면(조건이 true 이면) 1을 출력, 아니면 2를 출력
		System.out.println((a != b) ? "1" : "2");  //1 출력

	}

}
