package com.pucminas.carofour.controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.pucminas.carofour.model.ItemPedido;
import com.pucminas.carofour.model.Pedido;

/**
 * @version 1.0
 */

@WebServlet("/compras")
public class CompraServletCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CompraServletCtrl() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Pedido pedido = (Pedido)session.getAttribute("pedido");
		
		if (pedido == null)
			request.setAttribute("items", new ArrayList<ItemPedido>());
		else
			request.setAttribute("items", pedido.getItems());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/compras.jsp"); 
	    dispatcher.forward(request, response); 
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Pedido pedido = (Pedido)session.getAttribute("pedido");
		String produto = request.getParameter("produto");
		String quantidade = request.getParameter("quantidade");
		System.out.println(produto+ "***" + quantidade);
		if (pedido == null)
			request.setAttribute("items", new ArrayList<ItemPedido>());
		else {
			if((produto != null) && (quantidade != null))
				pedido.atualizaItem(produto, Integer.parseInt(quantidade));
					
			request.setAttribute("items", pedido.getItems());
		}
				
		RequestDispatcher dispatcher = request.getRequestDispatcher("/compras.jsp"); 
	    dispatcher.forward(request, response);
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Pedido pedido = (Pedido)session.getAttribute("pedido");		
		String produto = request.getParameter("produto");

		if (pedido == null)
			request.setAttribute("items", new ArrayList<ItemPedido>());
		else {
			if( produto != null)
				pedido.removerItem(produto);
			else
				pedido.removerItems();
			request.setAttribute("items", pedido.getItems());
		}
				
		RequestDispatcher dispatcher = request.getRequestDispatcher("/compras.jsp"); 
	    dispatcher.forward(request, response);
	}

}
