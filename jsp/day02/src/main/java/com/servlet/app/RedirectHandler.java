package com.servlet.app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirctHandler
 */
public class RedirectHandler extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RedirectHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      response.getWriter().append("Served at: ").append(request.getContextPath());
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
//      doGet(request, response);
      
      String redirectName = request.getParameter("redirectName");
      System.out.println(redirectName);
      
      
      //Redirect 페이지 이동
//      response.setContentType("text/html; charset = urf-8");

      
      //세션에 데이터 저장
//      request.getSession().setAttribute("redirectName", redirectName);
      //redirect 요청처리
      response.sendRedirect("redirectResult.jsp");
   }

}
