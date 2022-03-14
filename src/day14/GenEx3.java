package day14;


public class GenEx3 {
	float[] array;

	public float[] getArray() {
		return array;
	}

	public void setArray(float[] array) {
		this.array = array;
	}

	public void print() {
		for (float x : array) { //배열 array에서 한개 꺼내서 x에 담는다.
			System.out.println(x);
		}
	}

}
