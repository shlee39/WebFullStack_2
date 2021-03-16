package com.google.s1.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {

	//login - id pw를 받아서 조회
	public MemberDTO login(MemberDTO memberDTO) throws Exception{
		
		
		//1. 로그인 정보
		String user = "user01";
		String password = "user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		//2. 클래스 로딩
		Class.forName(driver);
		
		//3. 로그인 Connection
		Connection con = DriverManager.getConnection(url, user, password);
		
		//4. sql문 만들기
		String sql = "SELECT * FROM MEMBER WHERE id=? and pw=?";
		
		//5. 미리 보내기
		PreparedStatement st = con.prepareStatement(sql);
		
		//6. ? 셋팅
		st.setString(1, memberDTO.getId());
		st.setString(2, memberDTO.getPw());
		
		
		//7. 최종 전송 후 처리
		//보내고 결과물 받기
		ResultSet rs = st.executeQuery();
				
		if(rs.next()) {
			memberDTO.setName(rs.getString("name"));
			memberDTO.setEmail(rs.getString("email"));
			memberDTO.setMobile(rs.getString("phone"));
		}else {
			memberDTO = null;
		}
		
		//8. 해제
		rs.close();
		st.close();
		con.close();
		
		return memberDTO;
	}
	
	
	
}
