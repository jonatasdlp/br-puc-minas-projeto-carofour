/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pucminas.carofour.dao;

import com.pucminas.carofour.model.ItemPedido;
import com.pucminas.carofour.model.Pedido;
import com.pucminas.carofour.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 2.0
 */
public class ItemPedidoDAOImpl implements ItemPedidoDAO {

    private final DBManager dbManager;

    public ItemPedidoDAOImpl() {
        this.dbManager = DBManager.getInstance();
    }

    @Override
    public List<ItemPedido> listItemPedido(int idPedido) {
        Connection connection = null;
        PreparedStatement statement = null;
        List<ItemPedido> items = new ArrayList<>();

        try {
            final String sql = "select * from itemPedido where idPedido = ?";
            connection = this.dbManager.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, idPedido);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                ItemPedido item = new ItemPedido();
                item.setId(resultSet.getInt("id"));
                item.setQuantidade(resultSet.getInt("quantidade"));
                item.setProduto(Produto.localizarProduto(resultSet.getInt("idProduto")));

                items.add(item);
            }

            return items;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeResources(connection, statement);
        }

        return items;
    }

    @Override
    public ItemPedido find(int id) {
        return null;
    }

    @Override
    public boolean save(ItemPedido itemPedido, Pedido pedido) {
        if (pedido != null ) {
            return create(itemPedido, pedido.getId());
        }

        return update(itemPedido);
    }

    private boolean update(ItemPedido itemPedido) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            final String sql = "update itemPedido set quantidade = ? where id = ?";
            connection = this.dbManager.getConnection();
            statement = connection.prepareStatement(sql);

            statement.setInt(1, itemPedido.getQuantidade());
            statement.setInt(2, itemPedido.getId());

            int qtdadeRegistrosAfetados = statement.executeUpdate();

            return qtdadeRegistrosAfetados > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeResources(connection, statement);
        }
        return false;
    }

    private boolean create(ItemPedido itemPedido, int idPedido) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {

            final String sql = "insert into itemPedido (idPedido, idProduto, quantidade) values (?, ?, ?)";
            connection = this.dbManager.getConnection();
            statement = connection.prepareStatement(sql);

            statement.setInt(1, idPedido);
            statement.setInt(2, itemPedido.getProduto().getId());
            statement.setInt(3, itemPedido.getQuantidade());

            int qtdadeRegistrosAfetados = statement.executeUpdate();

            return qtdadeRegistrosAfetados > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeResources(connection, statement);
        }
        return false;
    }

    @Override
    public boolean remove(ItemPedido itemPedido) {
        return false;
    }

    private void closeResources(Connection connection, Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
