package day14;

public class TestMain2Gen {
	public static void main(String[] args) {
		Integer [] arr1 = {20,10,30,40,50};
		
		GenEx<Integer> ge1 = new GenEx<Integer>();
		ge1.setArray(arr1);
		ge1.print();
		
		System.out.println("------------------");
		
		String [] str = {"aaa","bbb","ccc","ddd"};
		GenEx<String> ge2 = new GenEx<String>();
		ge2.setArray(str);
		ge2.print();
		

	}
}
