package day14;

public class GenEx2 {
	String[] array;

	// setter()
	public void setArray(String[] array) {
		this.array = array;
	}

	// getter()
	public String[] getArray() {
		return array;
	}

	// print() :향상된 for문
	public void print() {
		for (String x : array) {
			System.out.println(x);
		}
	}
}
