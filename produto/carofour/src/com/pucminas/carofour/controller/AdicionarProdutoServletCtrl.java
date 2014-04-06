package com.pucminas.carofour.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pucminas.carofour.model.Categoria;
import com.pucminas.carofour.model.ItemPedido;
import com.pucminas.carofour.model.Produto;

/**
 * @version 1.0
 */

@WebServlet("/adicionarProduto")
public class ProdutoServletCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProdutoServletCtrl() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		List<ItemPedido> items = (List<ItemPedido>)session.getAttribute("items");	
		session.setMaxInactiveInterval(180);	
		int categoriaParam = Integer.parseInt(request.getParameter("categoria"));
		String produtoParam = request.getParameter("produto");
		
		if(items == null)
			items = new ArrayList<ItemPedido>();
		
		for (Produto produto : Categoria.listarCategorias().get(categoriaParam).getProdutos()) {
			if(produtoParam.toString().equals(produto.getNome().toString())){
				ItemPedido item = new ItemPedido(produto, 1);
				items.add(item);
			}
		}
		
		session.setAttribute("items", items);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ofertas.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
