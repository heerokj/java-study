package day05; //이해했지만 다시 복습하기

public class MethodEx03 {
    //$$
	static int getMaxValue(int[] m) { // 리턴값으로 int형 값을 돌려주는 메서드getMaxValue 생성, int형 배열 m을 가짐
		int max = 0; // int형 변수max 생성 후 0 대입 / 먼저 초기화 해주는것
		for (int i = 0; i < m.length; i++) { // int형 변수 i 생성 후 0대입, i가 배열m의 길이보다 작으면 {}안의 문장 실행 후 i +1 -> 조건 만족하지 않을때까지 반복
			if (m[i] > max)  //m[i]값과 max비교 후 m[i]이 크면 
				max = m[i];  //max에 m[i]값 대입 => 결국 max보다 큰 m[i]가 다시 max대입한것
		}
		return max; //max값 리턴(호출한 곳으로 값을 돌려줌) 
	}
    //##
	static int getMaxValuePosition(int[] m) { //리턴값으로 int형 값을 돌려주는 메서드getMaxValuePosition 생성, int형 배열m 가짐
		int pos = 0; //int형 변수pos생성 후 0대입
		int maxValue = 0; // int형 변수 maxValue 생성 후 0대입
		for (int i = 0; i < m.length; i++) { 
			if (maxValue < m[i]) {
				maxValue = m[i];
				pos = i; //0부터 1식 증가 => 위치라 생각하면됨 0번재 1번째~ 마지막은 배열m길이-1번째
			}
		}
		return pos;  //호출한 곳으로 리턴값 돌려줌
	}
	
    //%%setMaxValue
	// 배열의 최대값위치를 찾고, 지정한 값으로 변경
	static void setMaxValue(int[] m, int value) { //메서드setMaxValue 생성, int형 배열 과 int형 값value가짐
		// 다른 메서드의 값 불러올 수 있으므로 따로 코드 쓸 필요없이 불러와서 쓰면 됨.
		// 메서드 많이 쓸 수록 코드가 간단해짐
		int pos = getMaxValuePosition(m); //int형 변수 pos를 생성 후, 메서드 getMaxValuePosition의 m대입 후 돌려지는 리턴값 대입	=>6이 pos에 대입
		m[pos] = value; //배열m의 pos번째 값을 value값으로 교체 => m[6] = 100; -> 6번째 값이 100으로 교체 
	}
	
	//&&
	static int getMinValue(int[] m, int max) {
		int min = max;
		int pos =0;
		for(int i=0; i<m.length; i++) { // int형 변수 i 생성 후 0대입, i가 배열m의 길이보다 작으면 {}안의 문장 실행 후 i +1 -> 조건 만족하지 않을때까지 반복
			if(m[i]<min)  // 위의 조건이 맞으면 m[i] 의 값과 min의 값 비교해서 m[i]의 값이 작으면
				min = m[i];  // min의 값으로 m[i] 의 값 대입
		}
		return min;				
	}

	
	
	public static void main(String[] args) {

		int[] m = { 23, 53, 22, 11, 66, 77, 88, 29 }; // int형 배열m에 {}안 값을 순서대로 대입 (선언과 동시에 초기화)

		// $$최대값 구하기$$ 
		int max = getMaxValue(m); // int형 변수 max 생성 후, 메소드 getMaxValue에서m대입해서 실행한 return값 대입
		// ##최대값을 갖는 위치
		int pos = getMaxValuePosition(m); //int형 변수 pos 생성후, getMaxValuePosition(m) 리턴값 대입
		System.out.println("최대값 :" + max); // max값 출력
		System.out.println("최대값의 위치는 : " + pos); // pos값 출력

		// 지역변수는 메서드가 종료할때 같이 사라지는 변수
		// 호출한 변수에 영향을 미치지 않는다.
		// 참조값을 전달하면 참조값을 통해서 변수의 수정이 가능 / m[2]     ???

	
		// %% 최대값을 100으로 변경
		setMaxValue(m, 100); //메소드setMaxValue의 매개변수에 m과 100대입 후 결과값 돌려받음./ 
		//이하 for문은 맞는지 실행
		System.out.println("--------------------"); 
		System.out.println("m[6]값 출력 : "+m[6]); // 100으로 변경된 m[6]값 출력		
		System.out.println("--------------------"); 
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i] + "\t");
		}

	
		System.out.println("--------------------"); 
		// &&최소값 구하기&&
		
		int min = getMinValue(m, max);
		
		System.out.println("최소값 : " + min);  // min 값 출력
//		System.out.println("최소값의 위치는 : " + pos);  // pos 값 출력
	}
}
