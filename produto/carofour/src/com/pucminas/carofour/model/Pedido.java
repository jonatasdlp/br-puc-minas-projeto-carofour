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
	
	public double calcularCustoTotal(List<ItemPedido> items) {
		double soma = 0;
		for (ItemPedido itemPedido : items)
			soma =+ (itemPedido.getProduto().getPreco() * itemPedido.getQuantidade()); 
		
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
	
}
