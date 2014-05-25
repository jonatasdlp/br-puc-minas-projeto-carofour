/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pucminas.carofour.dao;

import com.pucminas.carofour.model.Categoria;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonatas
 */
public class CategoriaDAOImpl implements CategoriaDAO {

    private final DBManager dbManager;

    public CategoriaDAOImpl() {
        this.dbManager = DBManager.getInstance();
    }

    @Override
    public List<Categoria> listCategorias() {
        Connection connection = null;
        Statement statement = null;
        List<Categoria> categorias = new ArrayList<Categoria>();

        try {
            final String sql = "select id, nome, urlImagem from categorias";
            connection = this.dbManager.getConnection();
            statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Categoria categoria = new Categoria();
                categoria.setId(resultSet.getInt("id"));
                categoria.setNome(resultSet.getString("nome"));
                categoria.setUrlImagem(resultSet.getString("urlImagem"));

                categorias.add(categoria);
            }
            
            return categorias;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeResources(connection, statement);
        }
        
        return categorias;
    }

    @Override
    public boolean save(Categoria categoria) {
        return false;
    }

    @Override
    public boolean remove(Long id) {
        return false;
    }

    private void closeResources(Connection connection, Statement statement) {
        try {
            if (statement != null)
                statement.close();
            if (connection != null)
                connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
