package com.pucminas.carofour.dao;

import com.pucminas.carofour.model.Cliente;
import com.pucminas.carofour.model.ItemPedido;
import com.pucminas.carofour.model.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 2.0
 */
public class PedidoDAOImpl implements PedidoDAO {

    private final DBManager dbManager;

    public PedidoDAOImpl() {
        this.dbManager = DBManager.getInstance();
    }
    
    @Override
    public List<Pedido> listPedidos() {
        Connection connection = null;
        Statement statement = null;
        List<Pedido> pedidos = new ArrayList<>();

        try {
            final String sql = "select * from pedidos";
            connection = this.dbManager.getConnection();
            statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Pedido pedido = new Pedido();
                pedido.setId(resultSet.getInt("id"));
                pedido.setNumero(resultSet.getInt("numero"));
                pedido.setCliente(Cliente.localizarCliente(resultSet.getInt("idCliente")));
                pedido.setItems(ItemPedido.localizarItemsPorPedido(resultSet.getInt("id")));

                pedidos.add(pedido);
            }

            return pedidos;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeResources(connection, statement);
        }

        return pedidos;
    }
    
    @Override
    public List<Pedido> listPedidosByCliente(int idCliente) {
        Connection connection = null;
        PreparedStatement statement = null;
        List<Pedido> pedidos = new ArrayList<>();

        try {
            final String sql = "select * from pedidos where idCliente = ?";
            connection = this.dbManager.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, idCliente);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Pedido pedido = new Pedido();
                pedido.setId(resultSet.getInt("id"));
                pedido.setNumero(resultSet.getInt("numero"));
                pedido.setCliente(Cliente.localizarCliente(resultSet.getInt("idCliente")));
                pedido.setItems(ItemPedido.localizarItemsPorPedido(resultSet.getInt("id")));

                pedidos.add(pedido);
            }

            return pedidos;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeResources(connection, statement);
        }

        return pedidos;
    }

    @Override
    public Pedido find(int id) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            final String sql = "select * from pedidos";
            connection = this.dbManager.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();

            Pedido pedido = new Pedido();
            pedido.setId(resultSet.getInt("id"));
            pedido.setNumero(resultSet.getInt("numero"));
            pedido.setCliente(Cliente.localizarCliente(resultSet.getInt("idCliente")));
            pedido.setItems(ItemPedido.localizarItemsPorPedido(id));

            return pedido;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeResources(connection, statement);
        }

        return null;
    }

    @Override
    public boolean save(Pedido pedido) {
        if (pedido.getId() == 0)
            return create(pedido);
                    
        return update(pedido);
    }
    
    private boolean update(Pedido pedido) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            final String sql = "update pedidos set idCliente = ?, numero = ?, tipoPagamento = ? where id = ?";
            connection = this.dbManager.getConnection();
            statement = connection.prepareStatement(sql);

            statement.setInt(1, pedido.getCliente().getId());
            statement.setInt(2, pedido.getNumero());
            statement.setString(3, pedido.getTipoPagamento());
            statement.setInt(4, pedido.getId());
            
            int qtdadeRegistrosAfetados = statement.executeUpdate();

            return qtdadeRegistrosAfetados > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeResources(connection, statement);
        }
        return false;
    }

    private boolean create(Pedido pedido) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {

            final String sql = "insert into pedidos (idCliente, numero, tipoPagamento) values (?, ?, ?)";
            connection = this.dbManager.getConnection();
            statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            statement.setInt(1, pedido.getCliente().getId());
            statement.setInt(2, pedido.getNumero());
            statement.setString(3, pedido.getTipoPagamento());

            int qtdadeRegistrosAfetados = statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next())
                pedido.setId(rs.getInt(1));

            return qtdadeRegistrosAfetados > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeResources(connection, statement);
        }
        return false;
    }

    @Override
    public boolean remove(int id) {
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
