package day04;

public class ArrayEx8 {

	public static void main(String[] args) {
		
		//1. 1���� 45�� ���� ���� �迭 rnd�� �����Ѵ�. ����� ���ÿ� �ʱ�ȭ
		int[] rnd = {
				1,2,3,4,5,6,7,8,9,10,
				11,12,13,14,15,16,17,18,19,20,
				21,22,23,24,25,26,27,28,29,30,
				31,32,33,34,35,36,37,38,39,40,
				41,42,43,44,45
		}; //for�� �ᵵ ok
			
		
		
		//2. �����ϰ� �����ϳ��� �����Ѵ�.	
		// System.out.println(Math.random());  
		//0*45<Math.random()*45<1*45  //�����ƴ�  
		
		//System.out.println(Math.random()*45);                  
		
		//������ ����Ÿ���� ��ȯ�ϰ� ���� int�� __��Ʈ ���� ����ȯ�ʿ�  
		//System.out.println((int)Math.random()*45); 
		//0���� ��?=> (int)�� ()������ ������ ��޵�. => ()���� ����
		 	
		//System.out.println((int)(Math.random()*45));// => good  // 0~44������ ����
	
		int a = (int)(Math.random()*45); 
		int b = (int)(Math.random()*45);
		System.out.println("a : "+a+","+"b = "+b);
		
		
		//a,b�� ���� index�� �ϴ� �迭�� ���� ���
		System.out.println("rnd[" +a+ "] :"+ rnd[a]);  //rnd[3] :4
		System.out.println("rnd[" +b+ "] :"+ rnd[b]);  //rnd[8] :9
		
		
		
		//���迭�� ��Ұ��� �ڸ��ٲ�
		
		int temp = rnd[a];
		rnd[a] = rnd[b];
		rnd[b] = temp; 
	
		System.out.println("rnd[" +a+ "] :"+ rnd[a]); //rnd[3] :9
		System.out.println("rnd[" +b+ "] :"+ rnd[b]); //rnd[8] :4
		
	}
		
}


