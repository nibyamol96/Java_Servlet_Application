package com.face.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.RegisterBO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/**
 * @author Nibyamol
 * Action Servlet implementation class to perform user registration
 * Date - 14-11-2019
 * @category controller class
 */

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @implSpec -> action method to register customer with database
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");//content which you are give to user
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String mobile=request.getParameter("contact");
		String email=request.getParameter("email");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		RegisterBO regbo=new RegisterBO();
		// following code is encapsulation part
		regbo.setName(name);
		regbo.setAddress(address);
		regbo.setMobile(mobile);
		regbo.setEmail(email);
		regbo.setUsername(username);
		regbo.setPassword(password);
		
		ConnectionManager con=new ConnectionManager();
		try {
			RegisterDAO.save(con.getConnection(),regbo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		response.sendRedirect(request.getContextPath()+"/login.jsp");
	}

}
