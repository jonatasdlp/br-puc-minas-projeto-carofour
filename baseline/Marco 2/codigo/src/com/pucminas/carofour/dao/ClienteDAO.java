package com.pucminas.carofour.dao;

import java.util.List;

import com.pucminas.carofour.model.Cliente;

/**
 * @version 0.2
 */
public interface ClienteDAO {
    List<Cliente> listClientes();
    Cliente find(int id);
    boolean save(Cliente cliente);
    boolean remove(int id);
}
