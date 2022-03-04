package day08hw;

public class Q08OfficeWorker extends Q07Man {
	
	String jposition, residence;
	
	
	Q08OfficeWorker(String name, int age, String jposition, String residence) {
		this.age = age;
		this.name = name;
		this.jposition = jposition;
		this.residence = residence;		
	}
	
	
	@Override
	public void showInfo() {
		System.out.println(name+","+age+","+jposition+","+residence);
	}
	
	public void getAddrs() {
		System.out.println(residence);
	}
	
}
