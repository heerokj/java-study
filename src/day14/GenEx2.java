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

	// print() :���� for��
	public void print() {
		for (String x : array) {
			System.out.println(x);
		}
	}
}
