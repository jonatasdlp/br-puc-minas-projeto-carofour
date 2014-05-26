package com.pucminas.carofour.dao;

import com.pucminas.carofour.model.Categoria;
<<<<<<< HEAD
=======

>>>>>>> 46942207bcacad85d8154d7b559eb554f959d567
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
