package com.app.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.app.dao.DBConnector;
import com.app.dao.UserDAO;
import com.app.domain.UserDTO;

public class Test {
   public static void main(String[] args) {
      //연결 테스트
      
//      try {
//         Connection conn = DBConnector.getConnection();
//         System.out.println("연결성공");
//         conn.close();
//      } catch (SQLException e) {
//         // TODO Auto-generated catch block
////         e.printStackTrace();
//         System.out.println("연결실패");
//      }
	   
	   UserDTO userDTO = new UserDTO();
	   UserDAO userDAO = new UserDAO();
	   
//	   userDTO.setUserId("abc");
//	   userDTO.setUserPw("1234");
//	   userDTO.setUserName("홍길동");
//	   userDTO.setUserAge(5);
//	   userDTO.setUserGender("M");
//	   userDTO.setUserBirth("20001010");
	   
	   //아이디 중복검사
	   System.out.println(userDAO.checkId(userDTO.getUserId()));
	   //회원가입
	   userDAO.join(userDTO);
	   //로그인
	   System.out.println(userDAO.login("abc", "1234"));
	   //이름과 생일로 아이디 찾기
	   List<String> userIds = userDAO.findId("오현택", "2000-07-10");
	   System.out.println(userIds);
	   
	   //빠른for문 사용
	   for(String id : userIds) {
		   System.out.println(id);
	   }
	   
	   //streamAPI사용
	   userIds.forEach(System.out::println);
	   
	   UserDTO user = userDAO.findUser(1);
	   System.out.println(user);
	   
	   //회원정보 전체 수정
//	   user.setUserId("updateTest");
//	   user.setUserPw("update1");
//	   user.setUserName("test");
//	   user.setUserAge(10);
//	   user.setUserGender("W");
//	   user.setUserBirth("2025-01-06");
//	   userDAO.update(user);
//	   System.out.println(user);
	   
	   // 회원탈퇴		(userNumber 1번 회원 탈퇴)
	   if(userDAO.delete(1)) {
		   System.out.println("회원 탈퇴 완료");
	   } else {
		   System.out.println("회원 탈퇴 실패");
	   }
   }
}
