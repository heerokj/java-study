package day20; //DeptDAO 객체 만들어 사용하기

import java.util.ArrayList;

import dao.DeptDAO; //dao패키지 - DeptDAO클래스
import vo.DeptVO; //vo패키지 - DeptVO클래스

                        //1~8까지 반복되는 부분 따로만들어주면
public class TestMain { //main에서 일일이 1~8자원반납 매번 작성안해줘도 됨
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		
		//dao.selectAll(); //db의 모든데이터 가지고 옴
		//콘솔에 출력하는게 아니고 다른곳에서 다양하게 쓸수있도록 DeptVO사용하자..?	
		ArrayList<DeptVO> list = dao.selectAll();
		System.out.println(list);		
		for(DeptVO vo : list) {
			System.out.println(vo.getDeptno() +" : "+vo.getDname()+" : "+vo.getLoc());
		}
			
		
		//부서번호 10번 데이터 꺼내기(데이터 한개 꺼내기)
		DeptVO vo = dao.selectOne(10);
		System.out.println(vo.getDeptno() +" : "+vo.getDname()+" : "+vo.getLoc());
		System.out.println("-------");
		
		//부서 추가하기
		DeptVO vo1 = new DeptVO(3, "회계", "부산");
		dao.insertOne(vo1);
		System.out.println("-------");
		
		//2번 부서의 위치를 인천으로 변경하기
		dao.updateOne(2,"인천"); 
		System.out.println("-------");
		
		//3번 부서 삭제
		dao.deleteOne(3);
		
		//자원반납
		dao.close();
	}
}
 