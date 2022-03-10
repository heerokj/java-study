package day12;
//3. local inner class : 지역변수처럼 사용되는 클래스
public class OuterClassEx3 {

	private int a = 10;
	static int b = 20;
	static final int c = 30;

	public void printAll() {
		int k = 0; // 지역변수
		// System.out.println("printall()");

		
		// 메서드의 지역변수처럼 사용
		class LocalInnerClass {
			int d = 40;
			//static int e = 50;  //아우터클래스가 뉴 되지않으면 사용안됨
			static final int f = 60;

			void print() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				//System.out.println(e);
				System.out.println(f);
			}//printAll()end
		}//LocalInnerClass end
		
		//메서드가 끝나기 전까지 사용해야 (지역변수처럼)
		LocalInnerClass lic = new LocalInnerClass();
		lic.print();
	}//printAll()end

	public static void main(String[] args) {
		OuterClassEx3 oce = new OuterClassEx3();
		oce.printAll();
	}
}
