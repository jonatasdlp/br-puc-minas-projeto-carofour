package com.pucminas.carofour.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @version 0.2
 */

public class Pedido {
	private int id;
	private int numero;
	private Cliente cliente;
	private List<ItemPedido> items;
	private int tipoPagamento;

	public Pedido() {
		items = new ArrayList<ItemPedido>();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(int tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
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
		boolean flag = true;
		for (ItemPedido itemPedido : this.items) {
			if (itemPedido.equals(item)) {
				itemPedido.setQuantidade(itemPedido.getQuantidade() + 1);
				flag = false;
			}
		}
		if (flag)
			this.items.add(item);
	}
	
	public void atualizaItem(int idProduto, int quantidade) {
		for (ItemPedido itemPedido : this.items) {
			if (itemPedido.getProduto().getId() == idProduto)
				itemPedido.setQuantidade(quantidade);
		}
	}
	
	public void removerItem(int idProduto) {
		for (ItemPedido item : this.items) {
			if (item.getProduto().getId() == idProduto) {
				this.items.remove(item);
				break;
			}
		}
	}
	
	public void removerItems() {
		this.items = new ArrayList<ItemPedido>();
	}
	
	public void gerarNumeroPedido() {
		Random randomGenerator = new Random();
		this.numero = randomGenerator.nextInt(99999);
	}
}
