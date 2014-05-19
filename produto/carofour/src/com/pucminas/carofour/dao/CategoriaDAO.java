/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pucminas.carofour.dao;

import com.pucminas.carofour.model.Categoria;
import com.pucminas.carofour.model.Produto;
import java.util.List;

/**
 * @author jonatas
 */

public interface CategoriaDAO {
    List<Categoria> listCategorias();
    Categoria find(Long id);
    boolean save(Categoria categoria);
    boolean remove(Long id);
}
