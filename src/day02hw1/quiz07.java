package day02hw1;

public class quiz07 {
	public static void main (String[] args) {
		
		for(int i=1; i<=19; i++) {
			System.out.println("19*"+i+" = "+(19*i) ); //for문 이용
		}
		
		System.out.println("----------------");
		
		int i = 1;
		while ( i<=19) {
			System.out.println("19*"+i+" = "+(19*i) ); //while문 이용
			i++;
		}
		
		System.out.println("----------------");

		int j =1;
		do {
			System.out.println("19*" +j+" = " +(19*j)); //do문 이용
			j++;
		}while(j<=19);
		
	}

}
