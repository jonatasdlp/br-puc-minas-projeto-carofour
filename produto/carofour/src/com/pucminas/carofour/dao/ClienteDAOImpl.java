package com.pucminas.carofour.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.pucminas.carofour.model.Cliente;

/**
 * @version 0.2
 */
public class ClienteDAOImpl implements ClienteDAO {

    private final DBManager dbManager;

    public ClienteDAOImpl() {
        this.dbManager = DBManager.getInstance();
    }

    @Override
    public List<Cliente> listClientes() {
        Connection connection = null;
        Statement statement = null;
        List<Cliente> clientes = new ArrayList<>();

        try {
            final String sql = "select id, nome, email, dataNascimento, sexo, "
                    + "endereco, telefone from clientes";
            connection = this.dbManager.getConnection();
            statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(resultSet.getInt("id"));
                cliente.setNomeCompleto(resultSet.getString("nome"));
                cliente.setEmail(resultSet.getString("email"));
                cliente.setDataNascimento(resultSet.getString("dataNascimento"));
                cliente.setSexo(resultSet.getString("sexo").toCharArray()[0]);
                cliente.setEndereco(resultSet.getString("endereco"));
                cliente.setTelefone(resultSet.getString("telefone"));

                clientes.add(cliente);
            }

            return clientes;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeResources(connection, statement);
        }

        return clientes;
    }

    @Override
    public Cliente find(int id) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            final String sql = "select * from clientes where id = ?";
            connection = this.dbManager.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();

            Cliente cliente = new Cliente();
            cliente.setId(resultSet.getInt("id"));
            cliente.setNomeCompleto(resultSet.getString("nome"));
            cliente.setEmail(resultSet.getString("email"));
            cliente.setDataNascimento(resultSet.getString("dataNascimento"));
            cliente.setSexo(resultSet.getString("sexo").toCharArray()[0]);
            cliente.setEndereco(resultSet.getString("endereco"));
            cliente.setTelefone(resultSet.getString("telefone"));
            cliente.setSenha(resultSet.getString("senha"));

            return cliente;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeResources(connection, statement);
        }

        return null;
    }

    @Override
    public boolean save(Cliente cliente) {
        if (cliente.getId() == 0) {
            return create(cliente);
        }

        return update(cliente);
    }

    private boolean update(Cliente cliente) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {

            final String sql = "update clientes set nome = ?, email = ?, dataNascimento = ?, "
                    + "sexo = ?, endereco = ?, telefone = ?, senha = ?  where id = ?";
            connection = this.dbManager.getConnection();
            statement = connection.prepareStatement(sql);
 
            SimpleDateFormat startFormat = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date dateFormated = new java.sql.Date(startFormat.parse(cliente.getDataNascimento()).getTime());         

            statement.setString(1, cliente.getNomeCompleto());
            statement.setString(2, cliente.getEmail());
            statement.setDate(3, dateFormated);
            statement.setString(4, cliente.getSexo());
            statement.setString(5, cliente.getEndereco());
            statement.setString(6, cliente.getTelefone());
            statement.setString(7, cliente.getSenha());
            statement.setLong(8, cliente.getId());

            int qtdadeRegistrosAfetados = statement.executeUpdate();

            return qtdadeRegistrosAfetados > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeResources(connection, statement);
        }
        return false;
    }

    private boolean create(Cliente cliente) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {

            final String sql = "insert into clientes (nome, email, dataNascimento, "
                    + "sexo, endereco, telefone, senha) values (?, ?, ?, ?, ?, ?, ?)";
            connection = this.dbManager.getConnection();
            statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            SimpleDateFormat startFormat = new SimpleDateFormat("dd/MM/yyyy");           
            java.sql.Date dateFormated =  new java.sql.Date(startFormat.parse(cliente.getDataNascimento()).getTime());

            statement.setString(1, cliente.getNomeCompleto());
            statement.setString(2, cliente.getEmail());
            statement.setDate(3, dateFormated);
            statement.setString(4, cliente.getSexo());
            statement.setString(5, cliente.getEndereco());
            statement.setString(6, cliente.getTelefone());
            statement.setString(7, cliente.getSenha());

            int qtdadeRegistrosAfetados = statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next())
                cliente.setId(rs.getInt(1));
            
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
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            final String sql = "delete from clientes where id = ?";
            connection = this.dbManager.getConnection();
            statement = connection.prepareStatement(sql);

            statement.setInt(1, id);

            int qtdadeRegistrosAfetados = statement.executeUpdate();

            return qtdadeRegistrosAfetados > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeResources(connection, statement);
        }
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
