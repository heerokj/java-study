package day20;

import dao.MemberDAO;
import vo.MemberVO;

public class TestMain2 {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		
	
		MemberVO vo = dao.selectOne("aaa");

		if (vo != null) {
			System.out.println(vo.getEname() + " : " + vo.getGender());
		} else {
			System.out.println("그런 아이디를 가진 회원이 없습니다.");
		}

	}
}