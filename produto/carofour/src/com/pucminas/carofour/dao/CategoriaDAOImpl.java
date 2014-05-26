package com.pucminas.carofour.dao;

import com.pucminas.carofour.model.Categoria;
<<<<<<< HEAD
=======

>>>>>>> 46942207bcacad85d8154d7b559eb554f959d567
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @version 0.2
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
        List<Categoria> categorias = new ArrayList<>();

        try {
            final String sql = "select * from categorias";
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
<<<<<<< HEAD
=======
    public Categoria find(int id) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            final String sql = "select * from categorias where id = ?";
            connection = this.dbManager.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            
            Categoria categoria = new Categoria();
            categoria.setId(resultSet.getInt("id"));
            categoria.setNome(resultSet.getString("nome"));
            categoria.setUrlImagem(resultSet.getString("urlImagem"));
            
            return categoria;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeResources(connection, statement);
        }
        
        return null;
    }

    @Override
>>>>>>> 46942207bcacad85d8154d7b559eb554f959d567
    public boolean save(Categoria categoria) {
        return false;
    }

    @Override
    public boolean remove(int id) {
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
