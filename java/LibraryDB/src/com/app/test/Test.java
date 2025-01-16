package com.app.test;

import java.util.List;

import com.app.dao.BookDAO;
import com.app.dao.UserDAO;
import com.app.domain.BookDTO;
import com.app.domain.UserDTO;

public class Test {
public static void main(String[] args) {
    //연결 테스트
    
//  try {
//     Connection conn = DBConnector.getConnection();
//     System.out.println("연결성공");
//     conn.close();
//  } catch (SQLException e) {
//
//     e.printStackTrace();
//    System.out.println("연결실패");

	
      UserDTO userDTO = new UserDTO();
      UserDAO userDAO = new UserDAO();
      
      BookDTO bookDTO = new BookDTO();
      BookDAO bookDAO = new BookDAO();
      
//      //사용자 등록 테스트1
//      userDTO.setUserId("GOD");
//      userDTO.setUserPw("1234");
//      userDTO.setUserName("놀부");
//      userDTO.setUserPhone("010-1234-5678");
//      
//       //사용자 등록 메소드1
//      userDAO.addUser(userDTO);
      
      
      
      //사용자 등록 테스트2
//      userDTO.setUserId("HOT_");
//      userDTO.setUserPw("9876");
//      userDTO.setUserName("흥부");
//      userDTO.setUserPhone("010-9876-5432");
//      
//       //사용자 등록 메소드2
//      userDAO.addUser(userDTO);
      
//      //사용자 등록 테스트3
//      userDTO.setUserId("AAA");
//      userDTO.setUserPw("1234");
//      userDTO.setUserName("제비");
//      userDTO.setUserPhone("010-7777-7777");
//      
//       //사용자 등록 메소드3
//      userDAO.addUser(userDTO);
      
      
//      //로그인
//      System.out.println(userDAO.login("GOD","1234"));

//      //도서 등록
//      bookDTO.setBookTitle("반지의 제왕");
//      bookDTO.setBookAuthor("J.R.R 톨킨");
//      bookDTO.setBookRent(Boolean.parseBoolean("false"));
//      
//      System.out.println(bookDTO);
//      bookDAO.registerBook(bookDTO);
      
      
//      // 도서 목록 조회
//      List<BookDTO> books = bookDAO.selectAllBook();
//      for(BookDTO book : books) {
//         System.out.println(book);
//      }
      
      // 도서 검색
      List<BookDTO> searchBooks = bookDAO.searchBooks("반지의");
      for(BookDTO book : searchBooks) {
         System.out.println(book);
      }
//      //도서 대여
//      bookDAO.bookRent(1);
      
      //책 이름으로 대여중인지 확인하기(Test.java)
//         if(bookDAO.bookRantalStatus("도둑맞은 집중력")) { //true
//            if(bookDAO.bookRantalStatus("불편한 편의점2")) { //false
//               System.out.println("대여중 입니다");
//            } else {
//               System.out.println("대여중이 아닙니다");
//            }
      
		}
      
               
   }


