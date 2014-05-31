/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pucminas.carofour.controller;

import com.pucminas.carofour.model.ItemPedido;
import com.pucminas.carofour.model.Pedido;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @version 2.0
 */
@WebServlet("/atualizarProduto")
public class AtualizarProdutoServletCtrl extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Pedido pedido = (Pedido) session.getAttribute("pedido");
        String produto = request.getParameter("produto");
        String quantidade = request.getParameter("quantidade");

        if (pedido == null) {
            request.setAttribute("items", new ArrayList<ItemPedido>());
            request.setAttribute("subtotal", 0);
        } else {
            if ((produto != null) && (quantidade != null)) {
                pedido.atualizaItem(Integer.parseInt(produto), Integer.parseInt(quantidade));
            }

            request.setAttribute("items", pedido.getItems());
            request.setAttribute("subtotal", pedido.calcularCustoTotal());
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("partials/_compras.jsp");
        dispatcher.forward(request, response);
    }

}
