package com.pucminas.carofour.dao;

import java.util.List;

import com.pucminas.carofour.model.Cliente;

/**
 * @version 0.2
 */

public interface ClienteDAO {
	List<Cliente> listCategorias();
    Cliente find(int id);
    boolean create(Cliente cliente);
    boolean update(Cliente cliente);
    boolean remove(int id);
}
