package com.pucminas.carofour.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pucminas.carofour.model.Produto;

/**
*
* @version 0.2
*/
public class ProdutoDAOImpl implements ProdutoDAO {
	
	private final DBManager dbManager;

    public ProdutoDAOImpl() {
        this.dbManager = DBManager.getInstance();
    }
    
	@Override
	public List<Produto> listProdutos() {
		Connection connection = null;
        Statement statement = null;
        List<Produto> produtos = new ArrayList<>();

        try {
            final String sql = "select * from produtos";
            connection = this.dbManager.getConnection();
            statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {
            	Produto produto = new Produto();
            	produto.setId(resultSet.getInt("id"));
            	produto.setNome(resultSet.getString("nome"));
            	produto.setDescricao(resultSet.getString("descricao"));
            	produto.setEnderecoImagem(resultSet.getString("urlImagem"));
            	produto.setPreco(resultSet.getDouble("preco"));

                produtos.add(produto);
            }
            
            return produtos;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeResources(connection, statement);
        }
        
        return produtos;
	}

	@Override
	public List<Produto> listProdutosByCategoria(int idCategoria) {
		Connection connection = null;
        PreparedStatement statement = null;
        List<Produto> produtos = new ArrayList<>();

        try {
            final String sql = "select * from produtos where idCategoria = ?";
            connection = this.dbManager.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, idCategoria);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
            	Produto produto = new Produto();
            	produto.setId(resultSet.getInt("id"));
            	produto.setNome(resultSet.getString("nome"));
            	produto.setDescricao(resultSet.getString("descricao"));
            	produto.setEnderecoImagem(resultSet.getString("urlImagem"));
            	produto.setPreco(resultSet.getDouble("preco"));

                produtos.add(produto);
            }
            
            return produtos;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeResources(connection, statement);
        }
        
        return produtos;
	}

	@Override
	public Produto find(int id) {
		Connection connection = null;
        PreparedStatement statement = null;

        try {
            final String sql = "select * from produtos where id = ?";
            connection = this.dbManager.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            
            Produto produto = new Produto();
        	produto.setId(resultSet.getInt("id"));
        	produto.setNome(resultSet.getString("nome"));
        	produto.setDescricao(resultSet.getString("descricao"));
        	produto.setEnderecoImagem(resultSet.getString("urlImagem"));
        	produto.setPreco(resultSet.getDouble("preco"));
            
            return produto;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeResources(connection, statement);
        }
        
        return null;
	}

	@Override
	public boolean save(Produto produto) {
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
