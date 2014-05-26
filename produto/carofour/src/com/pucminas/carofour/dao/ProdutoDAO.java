package com.pucminas.carofour.dao;

import java.util.List;

import com.pucminas.carofour.model.Produto;

/**
*
* @version 0.2
*/
public interface ProdutoDAO {
	List<Produto> listProdutos();
    List<Produto> listProdutosByCategoria(int idCategoria);
    Produto find(int id);
    boolean save(Produto produto);
    boolean remove(int id);
}
