package day09;
// ��� : A is a B �� �����ؾߵ� ��)�䳢�� �������Դϴ�O/������ ���Դϴ�X
//       A has a B 
public class Police extends Gun{
	String name;
	String rank;
//	Gun g; //��Ӹ��� ������ �߰��ؾߵ�(Ŭ������ �޶� �����ȵ�?)=> getter setter��!
	Weapon w;
	
	
	Police(){
		this.name = "������";
		this.rank = "����";
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
		System.out.println("���⸦ �������ּ���");
		}
	
	public void reuse() {
		if(w != null)
			w.reuse();
	else
		System.out.println("���⸦ �������ּ���");
		}
	
		
/*
	//setter, getter �߰��ϱ�
	//���콺������ -> source -> setter&getter
	public Gun getG() {
		return g;
	}
	public void setG(Gun g) {
		this.g = g;
	}
	
*/		
	public void eating() {
		System.out.println("������ �Ծ��");
	}	
	public void arrest() {
		System.out.println("����� ������� ����� �� ������~");
	}

}
