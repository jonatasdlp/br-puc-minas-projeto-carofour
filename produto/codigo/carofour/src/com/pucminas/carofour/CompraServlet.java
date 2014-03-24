package com.pucminas.carofour;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pucminas.carofour.model.Cliente;

@WebServlet("/compra")
public class CompraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CompraServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("fechamentoCompra.jsp"); 
	    dispatcher.forward(request, response); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cliente cliente = new Cliente();
		cliente.setNomeCompleto(request.getParameter("nome"));
		cliente.setDataNascimento(request.getParameter("nascimento"));
		cliente.setSexo(request.getParameter("sexo").toCharArray()[0]);
		cliente.setEndereco(request.getParameter("endereco"));
		cliente.setTelefone(request.getParameter("telefone"));
		cliente.setEmail(request.getParameter("email"));
		cliente.setSenha(request.getParameter("senha"));
		
		request.setAttribute("cliente", cliente);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("finalizaCompra.jsp"); 
	    dispatcher.forward(request, response);
	}

}
