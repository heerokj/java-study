package day10;

public class StringBufferEx1 {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("SELECT *"); //append : �������ִ��� �߰��� ���̱�
		sb.append("FROM EMP ");
		sb.append("WHERE deptno = 10");
		
		System.out.println(sb.toString());
		System.out.println(sb.reverse()); //��� for�� �� �Ƚᵵ ��
		
		System.out.println();
		String str = "java oracle";
		StringBuffer sb2 = new StringBuffer(str);
		System.out.println(sb2.reverse()); // for�� �� ���� �Ųٷ� ����ϱ�
		
		
		
		
	}
}
