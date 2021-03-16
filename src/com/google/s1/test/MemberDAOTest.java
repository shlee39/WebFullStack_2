package com.google.s1.test;

import com.google.s1.member.MemberDAO;
import com.google.s1.member.MemberDTO;

public class MemberDAOTest {
	public static void main(String[] args) {
		//web에서 메인 메서드는 테스트 용도만 사용
		MemberDAO memberDAO = new MemberDAO();
		
		MemberDTO memberDTO = new MemberDTO();
		
		memberDTO.setId("iu");
		memberDTO.setPw("pw1");
		
		try {
			memberDTO = memberDAO.login(memberDTO);
			
			System.out.println(memberDTO != null);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
