package day07hw; //Q07.  아래의 3개의 클래스를 구현하세요
                 //(메서드 호출시 간단한 메세지가 출력되도록 작성해주세요)
public class Q07Rabbit {

	int eye, nose, ear;
	String name, epecies;
	
	Q07Rabbit(){
		eye = 1; 
		nose =2;
		ear = 3;
		name = "토토끼";
	}
	
	public void eating(String it) {
		System.out.println(it+"을 먹어요");
	}
	public void sleeping() {
		System.out.println("새근새근 잠을 자요");
	}
	public void jumping() {
		System.out.println("깡총깡총 뛰어요");
	}	
	
}
