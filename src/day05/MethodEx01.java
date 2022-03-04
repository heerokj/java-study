package day05; // ok
public class MethodEx01 {
	// 자주쓰는 코드는 메인 메소드 위에 적는다. (의미있는 메소드 이름짓기)
    // 여기서 수정하면 불러오는곳(다른 곳)에서도 모두 수정됨
	
	// static void 이름(){
	// 코드;
	// }
	
	//method
	//cnt : 매개변수, 인자, 아큐먼트
	 
	
	static void printStar(int cnt) {  //메소드 옆 괄호는 변할수 있는값 => 메인메소드에서 실행할때 //변수는 연걸고리역할 //선언도 한것이고 실행할때 할당도 해줌 실행하는 순간 그 값을 넣고 실행하는것 
		String str = "";
		for (int i = 1; i <= cnt; i++) {
			str += "*";               
			System.out.println(str);
		}
	}
	static void printCode(String code) {  //변할 수 있는 값 과 타입같이 적기
		String msg ="";
		for(int i=1; i<=6; i++){
			System.out.println(msg);
			msg += code;
		}
	}
	
	static void printGuGuDan(int dan) { 
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+" = "+dan*i);
			} 
	}
	 
	public static void main(String[] args) {

		printStar(3); //->이런 코드를 가서 실행해 위로 올라가서 실행하고 돌아옴
		printStar(3); //별 3줄출력
	System.out.println("1");
		printStar(5); //별 5줄줄력
		System.out.println("2");
			
		printGuGuDan(5);
		printGuGuDan(2);
		printGuGuDan(6);
			
		printCode("+");
		
	}
}