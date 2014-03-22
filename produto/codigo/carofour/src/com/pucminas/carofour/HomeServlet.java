package com.pucminas.carofour;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public HomeServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date dateNow = new Date();
		request.setAttribute("horaLocal", dateNow);
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp"); 
	    dispatcher.forward(request, response); 
	}

}
