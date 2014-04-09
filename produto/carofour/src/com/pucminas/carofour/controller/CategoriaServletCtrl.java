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
 * @version 0.2
 */

@WebServlet("/categorias")
public class CategoriaServletCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CategoriaServletCtrl() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("produtos", Categoria.listarCategorias().get(1).getProdutos());
		request.setAttribute("categorias", Categoria.listarCategorias());
		RequestDispatcher dispatcher = request.getRequestDispatcher("produtos.jsp"); 
		dispatcher.forward(request, response);
	}
}

