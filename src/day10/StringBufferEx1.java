package day10;

public class StringBufferEx1 {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("SELECT *"); //append : 기존에있던거 추가로 붙이기
		sb.append("FROM EMP ");
		sb.append("WHERE deptno = 10");
		
		System.out.println(sb.toString());
		System.out.println(sb.reverse()); //얘는 for문 등 안써도 됨
		
		System.out.println();
		String str = "java oracle";
		StringBuffer sb2 = new StringBuffer(str);
		System.out.println(sb2.reverse()); // for문 등 없이 거꾸로 출력하기
		
		
		
		
	}
}
