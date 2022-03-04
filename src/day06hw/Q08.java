package day06hw;

public class Q08 {
	
	public static void main(String[] args) {
			 
		
		 Q08Student s1 = new Q08Student(1, "lee", 80, 90, 60); // 번호  이름 국어 영어 수학 
		 s1.상태보기();
		 		 
         Q08Student s2 = new Q08Student(2, "kim", 70, 80, 90);
         s2.상태보기();
        
         
         Q08Student s3 = new Q08Student(3, "hong", 90, 75, 70);
         s3.상태보기();

                 
         Q08Student s4 = new Q08Student(4, "choi", 90, 60, 50);
         s4.상태보기();

                  
         Q08Student s5 = new Q08Student(5, "park", 100, 90, 70);
         s5.상태보기();

        s1.printSum();
        s1.printAvg(); 
        
        s2.printSum();
        s2.printAvg();
        
        s3.printSum();
        s3.printAvg();
	}
}
