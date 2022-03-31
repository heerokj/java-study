package day20; //DeptDAO ��ü ����� ����ϱ�

import java.util.ArrayList;

import dao.DeptDAO; //dao��Ű�� - DeptDAOŬ����
import vo.DeptVO; //vo��Ű�� - DeptVOŬ����

                        //1~8���� �ݺ��Ǵ� �κ� ���θ�����ָ�
public class TestMain { //main���� ������ 1~8�ڿ��ݳ� �Ź� �ۼ������൵ ��
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		
		//dao.selectAll(); //db�� ��絥���� ������ ��
		//�ֿܼ� ����ϴ°� �ƴϰ� �ٸ������� �پ��ϰ� �����ֵ��� DeptVO�������..?	
		ArrayList<DeptVO> list = dao.selectAll();
		System.out.println(list);		
		for(DeptVO vo : list) {
			System.out.println(vo.getDeptno() +" : "+vo.getDname()+" : "+vo.getLoc());
		}
			
		
		//�μ���ȣ 10�� ������ ������(������ �Ѱ� ������)
		DeptVO vo = dao.selectOne(10);
		System.out.println(vo.getDeptno() +" : "+vo.getDname()+" : "+vo.getLoc());
		System.out.println("-------");
		
		//�μ� �߰��ϱ�
		DeptVO vo1 = new DeptVO(3, "ȸ��", "�λ�");
		dao.insertOne(vo1);
		System.out.println("-------");
		
		//2�� �μ��� ��ġ�� ��õ���� �����ϱ�
		dao.updateOne(2,"��õ"); 
		System.out.println("-------");
		
		//3�� �μ� ����
		dao.deleteOne(3);
		
		//�ڿ��ݳ�
		dao.close();
	}
}
 