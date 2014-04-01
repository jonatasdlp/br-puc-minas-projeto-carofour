package com.pucminas.carofour.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @version 1.0
 */

@WebServlet("/index")
public class HomeServletCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public HomeServletCtrl() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date dateNow = new Date();
		request.setAttribute("horaLocal", dateNow);
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp"); 
	    dispatcher.forward(request, response); 
	}
}
