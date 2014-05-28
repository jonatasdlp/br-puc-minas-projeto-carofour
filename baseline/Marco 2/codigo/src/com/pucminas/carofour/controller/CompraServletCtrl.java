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
 * @version 0.2
 */
@WebServlet("/compras")
public class CompraServletCtrl extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public CompraServletCtrl() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Pedido pedido = (Pedido) session.getAttribute("pedido");

        if (pedido == null) {
            request.setAttribute("items", new ArrayList<ItemPedido>());
            request.setAttribute("subtotal", 0);
        } else {
            request.setAttribute("items", pedido.getItems());
            request.setAttribute("subtotal", pedido.calcularCustoTotal());
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("/compras.jsp");
        dispatcher.forward(request, response);
    }
}
