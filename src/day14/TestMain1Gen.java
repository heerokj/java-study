package day14;

public class TestMain1Gen {
	public static void main(String[] args) {
		
		GenEx1 ge1 = new GenEx1();
		int[] m = {10,20,30,40};
		ge1.setArray(m);
		ge1.print();
		
		
		GenEx2 ge2 = new GenEx2();
		String[] str = { "aaa", "bbb", "ccc", "ddd" };
		ge2.setArray(str);
		ge2.print();
		
		
		GenEx3 ge3 = new GenEx3();
		float[] height = { 187.3f, 171.2f, 192.3f, 178.4f };
		ge3.setArray(height);
		ge3.print();
	}

}
