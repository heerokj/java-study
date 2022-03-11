package day14;
//모든 자료형에 대해서 처리
//아직 자료형을 결정하지 않은 미완성 자료형으로 선언


// Generic : 데이터 형식에 의존하지 않고 하나의 값이
//여러 다른 데이터 타입들을 가질 수 있는 기술에 중점을 두어
//재사용을 높일 수 있는 프로그래밍방식
public class GenEx<T> {
	T[] array;

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public void print() {
		for (T x : array) {
			System.out.println(x);
		}
	}

}
