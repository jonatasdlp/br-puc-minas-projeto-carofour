package com.pucminas.carofour.dao;

import com.pucminas.carofour.model.Categoria;

import java.util.List;

/**
 * @version 0.2
 */
public interface CategoriaDAO {
    List<Categoria> listCategorias();
    Categoria find(int id);
    boolean save(Categoria categoria);
    boolean remove(int id);
}
