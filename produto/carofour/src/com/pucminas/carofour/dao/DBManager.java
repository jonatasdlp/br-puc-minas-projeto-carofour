/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pucminas.carofour.dao;

import com.mysql.jdbc.Connection;
import javax.sql.DataSource;
import javax.naming.InitialContext;

/**
 *
 * @author jonatas
 */
public class DBManager {

    private static DBManager dbManager;

    private DBManager() {
    }

    public static DBManager getInstance() {
        if (DBManager.dbManager == null) {
            DBManager.dbManager = new DBManager();
        }
        return DBManager.dbManager;
    }

    /**
     * Metodo utiliza o pool de conexoes do tomcat para retornar uma nova
     * conexao. O metodo encapsula a forma como a conexao e criada.
     *
     * @return conexao com o banco de dados
     * @throws Exception
     */
    public Connection getConnection() throws Exception {
        DataSource dataSource;
        InitialContext initCtx = new InitialContext();
        dataSource = (DataSource) initCtx.lookup("java:/comp/env/jdbc/carofour-ds");
        return (Connection) dataSource.getConnection();
    }
}
