package day14;

public class GenEx1  {
	
	int [] array;

	//setter
	public int[] getArray() {
		return array;
	}
	//getter
	public void setArray(int[] array) {
		this.array = array;
	}
	//print()
	//배열의 모든 요소를 화면에 출력
	public void print() {
//		for(int i =0; i<array.length;i++) {
//			System.out.println(array[i]);
//		}
		
		//향상된 for문, 개선된 for문 =>위의 for문과 같음
		for(int x :array) {
			System.out.println(x);
		}
		
		
	}


}