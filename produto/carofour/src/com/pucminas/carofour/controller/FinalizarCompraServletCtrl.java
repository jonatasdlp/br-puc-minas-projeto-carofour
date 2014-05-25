package com.pucminas.carofour.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pucminas.carofour.model.Cliente;
import com.pucminas.carofour.model.Pedido;

/**
 * @version 0.2
 */

@WebServlet("/finalizar")
public class FinalizarCompraServletCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FinalizarCompraServletCtrl() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Pedido pedido = (Pedido)session.getAttribute("pedido");
		
		if (pedido == null) {
			String contextPath = request.getContextPath();
			response.sendRedirect(response.encodeRedirectURL(contextPath + "/compras") );
		} else {
			request.setAttribute("subtotal", pedido.calcularCustoTotal());
			RequestDispatcher dispatcher = request.getRequestDispatcher("/fechamentoCompra.jsp"); 
	    	dispatcher.forward(request, response);
		} 
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Pedido pedido = (Pedido)session.getAttribute("pedido");
		Cliente cliente = new Cliente();
		
		// TODO validações (server-side)
		cliente.setNomeCompleto(request.getParameter("nome"));
		cliente.setDataNascimento(request.getParameter("nascimento"));
		cliente.setSexo(request.getParameter("sexo").toCharArray()[0]);
		cliente.setEndereco(request.getParameter("endereco"));
		cliente.setTelefone(request.getParameter("telefone"));
		cliente.setEmail(request.getParameter("email"));
		cliente.setSenha(request.getParameter("senha"));
		
		pedido.setCliente(cliente);
		pedido.gerarNumeroPedido();
		request.setAttribute("numero", pedido.getNumero());
		request.setAttribute("items", pedido.getItems());
		request.setAttribute("cliente", pedido.getCliente());
		RequestDispatcher dispatcher = request.getRequestDispatcher("finalizaCompra.jsp");
		dispatcher.forward(request, response);
		
	}

}
