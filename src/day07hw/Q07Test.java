package day07hw;

public class Q07Test {
	public static void main(String[] args) {

		Q07Monkey m = new Q07Monkey();{
		System.out.println("원숭이의 눈 :" + m.eye);
		System.out.println("원숭이의 코 :" + m.nose);
		System.out.println("원숭이의 귀 :" + m.ear);
		System.out.println("원숭이의 이름 :" + m.name);
		System.out.println("원숭이의 종 :" + m.epecies);

		m.eating("바나나");
		m.sleeping();
		m.climbing();
		}

	Q07Rabbit r = new Q07Rabbit();{

		System.out.println("토끼의 눈 :" + r.eye);
		System.out.println("토끼의 코 :" + r.nose);
		System.out.println("토끼의 귀 :" + r.ear);
		System.out.println("토끼의 이름 :" + r.name);

		r.eating("당근");
		r.sleeping();
		r.jumping();
	}

	Q07Whale w = new Q07Whale();{

		System.out.println("고래의 눈 :" + w.eye);
		System.out.println("고래의 코 :" + w.nose);
		System.out.println("고래의 귀 :" + w.ear);
		System.out.println("고래의 이름 :" + w.name);

		w.eating("생선");
		w.sleeping();
		w.swimming();
	}
 }
}
