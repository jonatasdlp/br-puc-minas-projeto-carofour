package com.pucminas.carofour.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 */

public class Pedido {
	private int numero;
	private Cliente cliente;
	private List<ItemPedido> items;

	public Pedido() {
		items = new ArrayList<ItemPedido>();
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double calcularCustoTotal() {
		double soma = 0;
		for (ItemPedido itemPedido : this.items)
			soma += (itemPedido.getProduto().getPreco() * itemPedido.getQuantidade()); 
		
		return soma;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItems() {
		return items;
	}

	public void setItem(ItemPedido item) {
		this.items.add(item);
	}
	
	public boolean atualizaItem(Produto produto) {
		boolean atualizaItem = false;
		for (ItemPedido item : this.items) {
			if (item.getProduto().getNome().equals(produto.getNome())) {
				int quantidade = item.getQuantidade() + 1;
				item.setQuantidade(quantidade);
				atualizaItem = true;
			}
		}
		return atualizaItem;
	}

	public void atualizaItem(String nomeProduto, int quantidade) {
		for (ItemPedido item : this.items) {
			if (item.getProduto().getNome().equals(nomeProduto)) {
				int diferenca = quantidade - item.getQuantidade();
				int qtd = item.getQuantidade() + diferenca;
				item.setQuantidade(qtd);
			}
		}
	}
	
	public void removerItem(String nomeProduto) {
		for (ItemPedido item : this.items) {
			if (item.getProduto().getNome().equals(nomeProduto))
				this.items.remove(item);
		}
	}
	
	public void removerItems() {
		this.items = new ArrayList<ItemPedido>();
	}
	
}
