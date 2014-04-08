package com.pucminas.carofour.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.pucminas.carofour.model.ItemPedido;
import com.pucminas.carofour.model.Pedido;
import com.pucminas.carofour.model.Produto;

/**
 * @version 1.0
 */

@WebServlet("/adicionarProdutos")
public class AdicionarProdutoServletCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdicionarProdutoServletCtrl() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(180);
		Pedido pedido = (Pedido)session.getAttribute("pedido");
		ItemPedido itemPedido = null;
		
		if (pedido == null)
			pedido = new Pedido();
			
		String [] produtos = request.getParameterValues("produtos");
	    for (String nome : produtos) {
			if ((nome != "") && (nome != null)) {
				Produto produto = Produto.localizarProduto(nome);
				if (produto != null) {
					if (!pedido.atualizaItem(produto)) {
						itemPedido = new ItemPedido(produto, 1);
						pedido.setItem(itemPedido);
					}
				}
			}
		}

		session.setAttribute("pedido", pedido);
		request.setAttribute("items", pedido.getItems());
		request.setAttribute("subtotal", pedido.calcularCustoTotal());
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/compras.jsp");
		requestDispatcher.forward(request, response);
	}

}
