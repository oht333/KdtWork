package com.servlet.app;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

/**
 * Servlet implementation class MyServlet
 */
//@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      request.setAttribute("userId", request.getParameter("userId"));
      request.setAttribute("userPw", request.getParameter("userPw"));
      request.setAttribute("userName", request.getParameter("userName"));
      request.setAttribute("userAge", request.getParameter("userAge"));
      request.setAttribute("userGender", request.getParameter("userGender"));

      
      //sqlSessionFactory의 openSession()을 사용하면 sqlSession을 가져온다
      //반환타입 확인하기!!!
      //openSession()에 true를 넣어줘야 auto commit이 된다
      SqlSession sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
      
      //++++++++++
      //UserMapper에 넘겨줄 map 만들기
      Map<String, String> userMap = new HashMap<>();
      userMap.put("userId", request.getParameter("userId"));
      userMap.put("userPw", request.getParameter("userPw"));
      userMap.put("userName", request.getParameter("userName"));
      userMap.put("userAge", request.getParameter("userAge"));
      userMap.put("userGender", request.getParameter("userGender"));
      //++++++++++
      
      //sqlSession에는 insert, select, update, delete 메소드가 존재한다(crud)
      //매개변수로 미리 작성한 sql문의 위치를 알려주면된다
      //sql문 mapper.xml파일에 작성되어야한다(아직 없으므로 만들러간다)
      
      sqlSession.insert("user.join", userMap); //userMapper.xml에서 (namespace).(id)
      
      request.getRequestDispatcher("result.jsp").forward(request, response);
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doGet(request, response);
   }

}
