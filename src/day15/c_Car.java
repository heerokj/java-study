package day15;

import java.util.ArrayList;
import java.util.Random;

public class c_Car {
	
	//String Ŭ������ ���� �� �ִ� ���� Object�迭
	//����
	ArrayList<String> list;
	
	String [] carNameList = {
			"������","�غ�ī","�ڶ���","���׽ý�","����"
			};
	
	public c_Car() {
		list = new ArrayList<String>();
	}

	// �ڵ��� �̸��� ������  getCarName()
	public String getCarName() {
		Random rnd = new Random();
		return carNameList[rnd.nextInt(carNameList.length)];
	}
	 
	// ������ �����ؼ� ���� �ִ� �޼��� push()
	public synchronized void push(String car) {
		System.out.println("���� ���� ���� : "+list);
		System.out.println("�ڵ����� ����Ǿ����ϴ�. "+car);
		list.add(car);
		
		//++��� �׸� �ڰ��ִ� ���� �Ͼ����
		//this.notify(); 
		this.notifyAll(); //��α���� => ������� ��
	}
		
	// ������ �޼��� pop()
	public synchronized String pop() {
		String carName = null;
		System.out.println("���� ���� ���� : "+list);
		//�� ������ ���
		if(list.size()==0) {
			System.out.println("���� ������ �����ϴ�. ��� ��ٸ�����");
			//������  wait : ��ٷ�~! this.waiat();�ϰ� try/catch������
			try {
				this.wait(); //���� ���μ��� ����Ű������� ==> synchronized Ű���� ���̱� / �ٵ� ���Ѵ���� ==>++Ư�� ���μ��� �������
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		carName = list.remove(list.size()-1); //  �߸��ϸ� ������ => ����  0�������� �� �������ݾ� �ּ�1��� �־����
		System.out.println("�ڵ����� ���Ǿ����ϴ� : ���̸� : "+carName);
		return carName;
		
	}
}
