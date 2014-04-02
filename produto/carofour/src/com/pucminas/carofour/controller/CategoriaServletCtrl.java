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

@WebServlet("/produtos")
public class CategoriaServletCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CategoriaServletCtrl() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idCategoria = request.getParameter("categoria");
		request.setAttribute("produtos", definiCategoria(idCategoria).getProdutos());
		RequestDispatcher dispatcher = request.getRequestDispatcher("produtos.jsp"); 
		dispatcher.forward(request, response);
	}
	
	public Categoria definiCategoria(String idCategoria) {
		Categoria categoria = null;
		for (Categoria categoriaSelecionada : Categoria.listarCategorias()) {
			if (idCategoria == categoriaSelecionada.getNome())
				categoria = categoriaSelecionada;
		}
	
		return categoria;
	}
}

