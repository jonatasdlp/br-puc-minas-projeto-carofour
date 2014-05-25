package com.pucminas.carofour.controller;

import java.io.IOException;
import com.pucminas.carofour.model.ItemPedido;
import com.pucminas.carofour.model.Pedido;
import com.pucminas.carofour.model.Produto;

/**
 * @version 0.2
 */

@WebServlet("/adicionarProdutos")
public class AdicionarProdutoServletCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdicionarProdutoServletCtrl() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(250);
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
