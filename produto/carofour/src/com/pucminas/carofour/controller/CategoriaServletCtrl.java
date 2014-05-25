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
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	int id = Integer.parseInt(request.getParameter("id"));
    	Categoria categoria = Categoria.localizar(id);
    	
    	if (categoria != null) {
    		request.setAttribute("categoria", categoria);
    		request.setAttribute("produtos", categoria.getProdutos());
    	}
    	
        request.setAttribute("categorias", Categoria.listarCategorias());
        RequestDispatcher dispatcher = request.getRequestDispatcher("produtos.jsp");
        dispatcher.forward(request, response);
    }
}