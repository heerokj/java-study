package day02hw1;

public class quiz07 {
	public static void main (String[] args) {
		
		for(int i=1; i<=19; i++) {
			System.out.println("19*"+i+" = "+(19*i) ); //for�� �̿�
		}
		
		System.out.println("----------------");
		
		int i = 1;
		while ( i<=19) {
			System.out.println("19*"+i+" = "+(19*i) ); //while�� �̿�
			i++;
		}
		
		System.out.println("----------------");

		int j =1;
		do {
			System.out.println("19*" +j+" = " +(19*j)); //do�� �̿�
			j++;
		}while(j<=19);
		
	}

}
