package com.pucminas.carofour.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pucminas.carofour.model.Categoria;

/**
 * @version 1.0
 */

@WebServlet("/ofertas")
public class OfertaServletCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public OfertaServletCtrl() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("produtos", Categoria.listarCategorias().get(1).getProdutos());
		RequestDispatcher dispatcher = request.getRequestDispatcher("ofertas.jsp"); 
		dispatcher.forward(request, response);
	}

}
