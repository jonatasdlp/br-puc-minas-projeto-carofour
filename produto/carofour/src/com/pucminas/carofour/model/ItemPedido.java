package com.pucminas.carofour.model;

/**
 * @version 1.0
 */

public class ItemPedido extends Produto {
	public ItemPedido(String nome, String descricao, String enderecoImagem, Double preco) {
		super(nome, descricao, enderecoImagem, preco);
	}
	
	private int quantidade;

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
