package day05; //���������� �ٽ� �����ϱ�

public class MethodEx03 {
    //$$
	static int getMaxValue(int[] m) { // ���ϰ����� int�� ���� �����ִ� �޼���getMaxValue ����, int�� �迭 m�� ����
		int max = 0; // int�� ����max ���� �� 0 ���� / ���� �ʱ�ȭ ���ִ°�
		for (int i = 0; i < m.length; i++) { // int�� ���� i ���� �� 0����, i�� �迭m�� ���̺��� ������ {}���� ���� ���� �� i +1 -> ���� �������� ���������� �ݺ�
			if (m[i] > max)  //m[i]���� max�� �� m[i]�� ũ�� 
				max = m[i];  //max�� m[i]�� ���� => �ᱹ max���� ū m[i]�� �ٽ� max�����Ѱ�
		}
		return max; //max�� ����(ȣ���� ������ ���� ������) 
	}
    //##
	static int getMaxValuePosition(int[] m) { //���ϰ����� int�� ���� �����ִ� �޼���getMaxValuePosition ����, int�� �迭m ����
		int pos = 0; //int�� ����pos���� �� 0����
		int maxValue = 0; // int�� ���� maxValue ���� �� 0����
		for (int i = 0; i < m.length; i++) { 
			if (maxValue < m[i]) {
				maxValue = m[i];
				pos = i; //0���� 1�� ���� => ��ġ�� �����ϸ�� 0���� 1��°~ �������� �迭m����-1��°
			}
		}
		return pos;  //ȣ���� ������ ���ϰ� ������
	}
	
    //%%setMaxValue
	// �迭�� �ִ밪��ġ�� ã��, ������ ������ ����
	static void setMaxValue(int[] m, int value) { //�޼���setMaxValue ����, int�� �迭 �� int�� ��value����
		// �ٸ� �޼����� �� �ҷ��� �� �����Ƿ� ���� �ڵ� �� �ʿ���� �ҷ��ͼ� ���� ��.
		// �޼��� ���� �� ���� �ڵ尡 ��������
		int pos = getMaxValuePosition(m); //int�� ���� pos�� ���� ��, �޼��� getMaxValuePosition�� m���� �� �������� ���ϰ� ����	=>6�� pos�� ����
		m[pos] = value; //�迭m�� pos��° ���� value������ ��ü => m[6] = 100; -> 6��° ���� 100���� ��ü 
	}
	
	//&&
	static int getMinValue(int[] m, int max) {
		int min = max;
		int pos =0;
		for(int i=0; i<m.length; i++) { // int�� ���� i ���� �� 0����, i�� �迭m�� ���̺��� ������ {}���� ���� ���� �� i +1 -> ���� �������� ���������� �ݺ�
			if(m[i]<min)  // ���� ������ ������ m[i] �� ���� min�� �� ���ؼ� m[i]�� ���� ������
				min = m[i];  // min�� ������ m[i] �� �� ����
		}
		return min;				
	}

	
	
	public static void main(String[] args) {

		int[] m = { 23, 53, 22, 11, 66, 77, 88, 29 }; // int�� �迭m�� {}�� ���� ������� ���� (����� ���ÿ� �ʱ�ȭ)

		// $$�ִ밪 ���ϱ�$$ 
		int max = getMaxValue(m); // int�� ���� max ���� ��, �޼ҵ� getMaxValue����m�����ؼ� ������ return�� ����
		// ##�ִ밪�� ���� ��ġ
		int pos = getMaxValuePosition(m); //int�� ���� pos ������, getMaxValuePosition(m) ���ϰ� ����
		System.out.println("�ִ밪 :" + max); // max�� ���
		System.out.println("�ִ밪�� ��ġ�� : " + pos); // pos�� ���

		// ���������� �޼��尡 �����Ҷ� ���� ������� ����
		// ȣ���� ������ ������ ��ġ�� �ʴ´�.
		// �������� �����ϸ� �������� ���ؼ� ������ ������ ���� / m[2]     ???

	
		// %% �ִ밪�� 100���� ����
		setMaxValue(m, 100); //�޼ҵ�setMaxValue�� �Ű������� m�� 100���� �� ����� ��������./ 
		//���� for���� �´��� ����
		System.out.println("--------------------"); 
		System.out.println("m[6]�� ��� : "+m[6]); // 100���� ����� m[6]�� ���		
		System.out.println("--------------------"); 
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i] + "\t");
		}

	
		System.out.println("--------------------"); 
		// &&�ּҰ� ���ϱ�&&
		
		int min = getMinValue(m, max);
		
		System.out.println("�ּҰ� : " + min);  // min �� ���
//		System.out.println("�ּҰ��� ��ġ�� : " + pos);  // pos �� ���
	}
}
