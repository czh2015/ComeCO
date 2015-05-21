package org.gr.pm.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.gr.pm.biz.IUserBiz;
import org.gr.pm.biz.impl.UserBizImpl;
import org.gr.pm.po.User;


/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		IUserBiz userBiz=new UserBizImpl();
				
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String email = new String(request.getParameter("email").getBytes("iso8859-1"), "UTF-8");
		String password = new String(request.getParameter("password").getBytes("iso8859-1"), "UTF-8");
		User user = userBiz.searchByEmail(email);
		if (user == null) {
			request.setAttribute("errorInfo", "name");
			response.getWriter().write("usernameError");
			return;
		}
		System.out.println(user.getPassword());
		boolean pwdflag = user.getPassword().equals(password);
		if (!pwdflag) {
			request.setAttribute("errorInfo", "password");
			response.getWriter().write("passwordError");
			return;
		}
		email=userBiz.searchById(user.getId()).getEmail();
		
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("homepage.jsp");
		dispatcher.forward(request, response);
	}

}
