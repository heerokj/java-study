package day14;

public class GenEx1  {
	
	int [] array;

	//setter
	public int[] getArray() {
		return array;
	}
	//getter
	public void setArray(int[] array) {
		this.array = array;
	}
	//print()
	//�迭�� ��� ��Ҹ� ȭ�鿡 ���
	public void print() {
//		for(int i =0; i<array.length;i++) {
//			System.out.println(array[i]);
//		}
		
		//���� for��, ������ for�� =>���� for���� ����
		for(int x :array) {
			System.out.println(x);
		}
		
		
	}


}