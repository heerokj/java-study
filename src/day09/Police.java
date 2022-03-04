package day09;
// 상속 : A is a B 가 성립해야됨 예)토끼는 포유류입니다O/경찰은 총입니다X
//       A has a B 
public class Police extends Gun{
	String name;
	String rank;
//	Gun g; //상속말고 변수로 추가해야됨(클래스가 달라서 참조안됨?)=> getter setter로!
	Weapon w;
	
	
	Police(){
		this.name = "포순이";
		this.rank = "순경";
	}	
	

	public Weapon getW() {
		return w;
	}
	public void setW(Weapon w) {
		this.w = w;
	}
	
	public void use() {
		if(w != null)
			w.use();
	else
		System.out.println("무기를 지정해주세요");
		}
	
	public void reuse() {
		if(w != null)
			w.reuse();
	else
		System.out.println("무기를 지정해주세요");
		}
	
		
/*
	//setter, getter 추가하기
	//마우스오른쪽 -> source -> setter&getter
	public Gun getG() {
		return g;
	}
	public void setG(Gun g) {
		this.g = g;
	}
	
*/		
	public void eating() {
		System.out.println("도넛을 먹어요");
	}	
	public void arrest() {
		System.out.println("당신은 묵비권을 행사할 수 있으며~");
	}

}
