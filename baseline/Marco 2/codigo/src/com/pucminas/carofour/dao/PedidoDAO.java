package com.pucminas.carofour.dao;

import com.pucminas.carofour.model.Pedido;
import java.util.List;

public interface PedidoDAO {
    List<Pedido> listPedidos();
    List<Pedido> listPedidosByCliente(int idCliente);
    Pedido find(int id);
    boolean save(Pedido pedido);
    boolean remove(int id);
}
