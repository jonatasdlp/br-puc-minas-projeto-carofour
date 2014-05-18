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
 *
 * @author jonatas
 */

public class CategoriaDAOImpl implements CategoriaDAO {

    @Override
    public List<Produto> categorias() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Produto find(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean save(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean remove(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
