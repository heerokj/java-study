package day15;

import java.util.ArrayList;
import java.util.Random;

public class c_Car {
	
	//String 클래스만 담을 수 있는 전용 Object배열
	//차고
	ArrayList<String> list;
	
	String [] carNameList = {
			"포르쉐","붕붕카","코란도","제네시스","벤츠"
			};
	
	public c_Car() {
		list = new ArrayList<String>();
	}

	// 자동차 이름을 얻어오기  getCarName()
	public String getCarName() {
		Random rnd = new Random();
		return carNameList[rnd.nextInt(carNameList.length)];
	}
	 
	// 차량을 생성해서 차고에 넣는 메서드 push()
	public synchronized void push(String car) {
		System.out.println("현재 차고 상태 : "+list);
		System.out.println("자동차가 생산되었습니다. "+car);
		list.add(car);
		
		//++대기 그만 자고있는 고객님 일어나세요
		//this.notify(); 
		this.notifyAll(); //모두깨우기 => 순번대로 들어감
	}
		
	// 꺼내는 메서드 pop()
	public synchronized String pop() {
		String carName = null;
		System.out.println("현재 차고 상태 : "+list);
		//차 있으면 출고
		if(list.size()==0) {
			System.out.println("차고에 차량이 없습니다. 잠시 기다리세요");
			//없으면  wait : 기다려~! this.waiat();하고 try/catch누르기
			try {
				this.wait(); //상대방 프로세스 대기시키고싶으면 ==> synchronized 키워드 붙이기 / 근데 무한대기임 ==>++특정 프로세스 깨워줘야
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		carName = list.remove(list.size()-1); //  잘못하면 에러남 => 차고에  0개있으면 차 뺄수없잖아 최소1대는 있어야지
		System.out.println("자동차가 출고되었습니다 : 차이름 : "+carName);
		return carName;
		
	}
}
