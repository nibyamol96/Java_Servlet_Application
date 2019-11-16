package com.face.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.LoginBO;
import com.face.dao.LoginDAO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		LoginBO lbo=new LoginBO();
		lbo.setUname(username);
		lbo.setPass(password);
		ConnectionManager con=new ConnectionManager();
			
			 boolean status = false;
			try {
				status = LoginDAO.acess(con.getConnection(),lbo);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		if(status==true) {
			List <String>newList  = new ArrayList<String>();
			newList.add(lbo.getName());
			newList.add(lbo.getAddress());
			newList.add(lbo.getMobile());
			newList.add(lbo.getEmail());
			  request.setAttribute("data", newList);
			                   RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
			                   
			                   if(dispatcher !=null)
			                   {
			                  dispatcher.forward(request,response);
			                   }

			}
		
		else {
			//response.sendRedirect("/WebApplication/login.jsp");
		}
			
				
		
	}


		}


