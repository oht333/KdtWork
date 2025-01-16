package com.servlet.app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetPostHandler
 */
//@WebServlet("/GetPostHandler")
public class GetPostHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetPostHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = request.getParameter("userName");
		int age = Integer.parseInt(request.getParameter("userAge")); 
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobby");
//		String age = request.getParameter("userAge");
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(hobbies);
		
//		response.setContentType("text/html; charset=UTF-8");
//		response.getWriter().println("<h1>GET 요청 처리</h1>");
//		response.getWriter().println("<p>" + name + "님 환영합니다</p>");
//		response.getWriter().println("<p>"+ name + "님의 2025년 나이는 " + age + "살 입니다</p>");
		
		 request.setAttribute("name", name);
	     request.setAttribute("age", age);
	     request.setAttribute("gender", gender);
	     request.setAttribute("hobbies", hobbies);
	     
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
