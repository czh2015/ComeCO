package org.gr.pm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.gr.pm.biz.IUserBiz;
import org.gr.pm.biz.impl.UserBizImpl;
import org.gr.pm.po.User;

/**
 * Servlet implementation class RegistServlet
 */
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String email=request.getParameter("email");
		IUserBiz userbiz=new UserBizImpl();
		User user=userbiz.searchByEmail(email);
		if(user!=null){
			response.getWriter().write("usernameRep");
			return;
		}
		
		User newUser = new User();
		newUser.setGender(Integer.parseInt(request.getParameter("gender")));
		newUser.setEmail(new String(request.getParameter("email").getBytes("iso8859-1"), "UTF-8"));
		newUser.setPassword(new String(request.getParameter("password").getBytes("iso8859-1"), "UTF-8"));
		newUser.setName(new String(request.getParameter("name").getBytes("iso8859-1"), "UTF-8"));
		newUser.setLevel(Integer.parseInt(request.getParameter("level")));
		newUser.setDistrict(new String(request.getParameter("district").getBytes("iso8859-1"), "UTF-8"));
		newUser.setScore(0);
		newUser.setSchool(new String(request.getParameter("school").getBytes("iso8859-1"), "UTF-8"));
		newUser.setMajor(new String(request.getParameter("major").getBytes("iso8859-1"), "UTF-8"));
		newUser.setIntroduce(new String(request.getParameter("intro").getBytes("iso8859-1"), "UTF-8"));
		newUser.setImage(new String(request.getParameter("image").getBytes("iso8859-1"), "UTF-8"));
		
		userbiz.addUser(newUser);
		newUser=userbiz.searchByEmail(email);
		HttpSession session = request.getSession();
		session.setAttribute("user", newUser);
	}

}
