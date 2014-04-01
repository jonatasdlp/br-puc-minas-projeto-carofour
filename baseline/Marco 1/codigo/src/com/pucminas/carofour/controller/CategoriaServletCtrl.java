package com.pucminas.carofour.controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pucminas.carofour.model.Produto;

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
		ArrayList<Produto> produtos = ListarProdutosCategoria(Integer.parseInt(idCategoria));
		String categoria =  DefiniCategoria(Integer.parseInt(idCategoria));
		request.setAttribute("produtos", produtos);
		request.setAttribute("categ", categoria);
		RequestDispatcher dispatcher = request.getRequestDispatcher("produtos.jsp"); 
		dispatcher.forward(request, response);
	}

	private ArrayList<Produto> ListarProdutosCategoria(int idCategoria) {
		
		ArrayList<Produto> produtos = new ArrayList<Produto>();		
		
		switch( idCategoria )
		{
		case 1: //Laticinios
			//Produto pr = new Produto("nome", "desc", "endImagem", 2.2);
		 //produtos.add(new Produto("Iogurte","AKUT","assets/images/3.jpg",10.00));
	     produtos.add(new Produto("Iogurte","AKUT","assets/images/3.jpg",10.00));

			produtos.add(new Produto(
					"Mussarela",
					"Mieirinha",
					"assets/images/3.jpg",
					10.00));
			
			produtos.add(new Produto(
					"Requijao",
					"DeLeiite",
					"assets/images/3.jpg",
					10.00));
			
			produtos.add(new Produto(
					"Leite",
					"NaVaqui",
					"assets/images/3.jpg",
					10.00));
			
			return produtos;
		case 2: // Carnes

			produtos.add(new Produto(
					"Frango",
					"Frango Fatiado",
					"assets/images/1.jpg",
					10.00));

			produtos.add(new Produto(
					"Alcatra",
					"Alcatra Bovina",
					"assets/images/1.jpg",
					10.00));
			
			produtos.add(new Produto(
					"Toucinho",
					"Da porcalhada",
					"assets/images/1.jpg",
					10.00));
			
			produtos.add(new Produto(
					"Costela",
					"A legitima",
					"assets/images/1.jpg",
					10.00));
			return produtos;

		case 3: //Padaria

			produtos.add(new Produto(
					"Pao-de-Queijo",
					"Mineiro original",
					"assets/images/6.jpg",
					10.00));

			produtos.add(new Produto(
					"Pao-de-forno",
					"Forno de lenha",
					"assets/images/6.jpg",
					10.00));
			
			produtos.add(new Produto(
					"Broa",
					"Broa de milho",
					"assets/images/6.jpg",
					10.00));
			
			produtos.add(new Produto(
					"Bolo",
					"Bolo de banana",
					"assets/images/6.jpg",
					10.00));
			return produtos;


		case 4: //Hortifrutigranjeiros
			

			produtos.add(new Produto(
					"Alface",
					"A verdinha",
					"assets/images/7.jpg",
					10.00));

			produtos.add(new Produto(
					"Espinafre",
					"Marinheiro Popeye",
					"assets/images7.jpg",
					10.00));
			
			produtos.add(new Produto(
					"Ovos",
					"Galinha pintadinha",
					"assets/images/7.jpg",
					10.00));
			
			produtos.add(new Produto(
					"Tomate",
					"O vermelhinho",
					"assets/images/7.jpg",
					10.00));
			return produtos;

		default: // Laticinios

			produtos.add(new Produto(
					"Iogurte",
					"AKUT",
					"assets/images/3.jpg",
					10.00));

			produtos.add(new Produto(
					"Mussarela",
					"Mieirinha",
					"assets/images/3.jpg",
					10.00));
			
			produtos.add(new Produto(
					"Requijio",
					"DeLeiite",
					"assets/images/3.jpg",
					10.00));
			
			produtos.add(new Produto(
					"Leite",
					"NaVaqui",
					"assets/images/3.jpg",
					10.00));
			return produtos;
		}

	}

	public String DefiniCategoria(int idCategoria)
	{
		switch( idCategoria )
		{
		case 1:
			return "Laticinios";
		case 2:
			return "Carnes";

		case 3:
			return "padaria";

		case 4:
			return "Hortifrutigranjeiros";

		default:
			return "Laticinios";
		}
	}

}

