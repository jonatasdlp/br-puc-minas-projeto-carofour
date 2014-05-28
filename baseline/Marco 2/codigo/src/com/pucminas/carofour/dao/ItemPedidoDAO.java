package com.pucminas.carofour.dao;

import com.pucminas.carofour.model.ItemPedido;
import com.pucminas.carofour.model.Pedido;
import java.util.List;

public interface ItemPedidoDAO {
    List<ItemPedido> listItemPedido(int idPedido);
    ItemPedido find(int id);
    boolean save(ItemPedido itemPedido, Pedido pedido);
    boolean remove(ItemPedido itemPedido);
}
