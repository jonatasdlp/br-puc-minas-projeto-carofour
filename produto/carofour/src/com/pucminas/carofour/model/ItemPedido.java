package com.pucminas.carofour.model;		

/**
 * @version 1.0
 */

public class ItemPedido {
	private int quantidade;
	private Produto produto;

	public ItemPedido(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double valorTotalProduto() {
		return produto.getPreco() * this.quantidade;
	}
	
}
