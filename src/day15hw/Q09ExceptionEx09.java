package day15hw;
import java.util.ArrayList;

//Q09. �Ʒ� �ڵ忡�� �Ϻ� ������ �ִ� �̰��� �����Ͽ�
//������ �߻����� �ʰ� ó���Ͻÿ�.

public class Q09ExceptionEx09 {
	
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add("����");
		list.add(500);
		list.add("����");
		list.add("���ξ���");
		
		for(int i=0;i<list.size();i++){
			Object name = list.get(i);
			System.out.println(name);
		}
		
	}
}
