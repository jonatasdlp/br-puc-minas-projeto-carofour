package com.pucminas.carofour.model;

import com.pucminas.carofour.dao.PedidoDAOImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @version 0.2
 */
public class Pedido {

    private int id;
    private int numero;
    private String tipoPagamento;
    private Cliente cliente;
    private List<ItemPedido> items;

    public Pedido() {
        items = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
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
        if (flag) {
            this.items.add(item);
        }
    }

    public void setItems(List<ItemPedido> items) {
        this.items = items;
    }
    
    public double calcularCustoTotal() {
        double soma = 0;
        for (ItemPedido itemPedido : this.items) {
            soma += (itemPedido.getProduto().getPreco() * itemPedido.getQuantidade());
        }

        return soma;
    }

    public void atualizaItem(int idProduto, int quantidade) {
        for (ItemPedido itemPedido : this.items) {
            if (itemPedido.getProduto().getId() == idProduto) {
                itemPedido.setQuantidade(quantidade);
            }
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

    public boolean gravarDados() {
        if (new PedidoDAOImpl().save(this)) {
            for (ItemPedido item : this.items) {
                if (!item.gravarDados(this)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
