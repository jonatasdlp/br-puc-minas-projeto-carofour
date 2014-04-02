package com.pucminas.carofour.model;

import java.util.LinkedList;
import java.util.List;

/**
 * @version 1.0
 */

public class Categoria {
	private String nome;
	private String urlImagem;
	private List<Produto> produtos;
	
	public Categoria() {
		produtos = new LinkedList<>();
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getUrlImagem() {
		if(!produtos.isEmpty())
			this.urlImagem = produtos.get(0).getEnderecoImagem();
		else
			this.urlImagem = "assets/images/generica.jpg";
		
		return this.urlImagem;
	}
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public static List<Categoria> listarCategorias() {
		List<Categoria> categorias = new LinkedList<Categoria>();
		
		Categoria categoriaLaticinios = new Categoria();
		categoriaLaticinios.setNome("Laticínios");
		categoriaLaticinios.adicionarProduto(new Produto("Iogurte", "AKUT", "assets/images/3.jpg", 10.00));
		categoriaLaticinios.adicionarProduto(new Produto("Mussarela", "Mieirinha", "assets/images/3.jpg", 10.00));
		categoriaLaticinios.adicionarProduto(new Produto("Requijao", "DeLeiite", "assets/images/3.jpg", 10.00));
		categoriaLaticinios.adicionarProduto(new Produto("Leite", "NaVaqui", "assets/images/3.jpg", 10.00));
		categorias.add(categoriaLaticinios);
		
		Categoria categoriaCarnes = new Categoria();
		categoriaCarnes.setNome("Carnes");
		categoriaCarnes.adicionarProduto(new Produto("Frango", "Frango Fatiado", "assets/images/1.jpg", 10.00));
		categoriaCarnes.adicionarProduto(new Produto("Alcatra", "Alcatra Bovina", "assets/images/1.jpg", 10.00));
		categoriaCarnes.adicionarProduto(new Produto("Toucinho", "Da porcalhada", "assets/images/1.jpg", 10.00));
		categoriaCarnes.adicionarProduto(new Produto("Costela", "A legitima", "assets/images/1.jpg", 10.00));
		categorias.add(categoriaCarnes);

		Categoria categoriaPadaria = new Categoria();
		categoriaPadaria.setNome("Padaria");
		categoriaPadaria.adicionarProduto(new Produto("Pao-de-Queijo", "Mineiro original", "assets/images/6.jpg", 10.00));
		categoriaPadaria.adicionarProduto(new Produto("Pao-de-forno", "Forno de lenha", "assets/images/6.jpg", 10.00));
		categoriaPadaria.adicionarProduto(new Produto("Broa", "Broa de milho", "assets/images/6.jpg", 10.00));
		categoriaPadaria.adicionarProduto(new Produto("Bolo", "Bolo de banana", "assets/images/6.jpg", 10.00));
		categorias.add(categoriaPadaria);
		
		Categoria categoriaHortiFrutiGranjeiros = new Categoria();
		categoriaHortiFrutiGranjeiros.setNome("Horti Fruti Granjeiros");
		categoriaHortiFrutiGranjeiros.adicionarProduto(new Produto("Alface", "A verdinha", "assets/images/7.jpg", 10.00));
		categoriaHortiFrutiGranjeiros.adicionarProduto(new Produto("Espinafre", "Marinheiro Popeye", "assets/images7.jpg", 10.00));
		categoriaHortiFrutiGranjeiros.adicionarProduto(new Produto("Ovos", "Galinha pintadinha", "assets/images/7.jpg", 10.00));
		categoriaHortiFrutiGranjeiros.adicionarProduto(new Produto("Tomate", "O vermelhinho", "assets/images/7.jpg", 10.00));
		categorias.add(categoriaHortiFrutiGranjeiros);
		
		return categorias;
	}
}
