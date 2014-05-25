package com.pucminas.carofour.dao;

import java.sql.Connection;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 *
 * @version 0.2
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

    public Connection getConnection() throws Exception {
        DataSource dataSource;
        InitialContext initCtx = new InitialContext();
        dataSource = (DataSource) initCtx.lookup("java:/comp/env/jdbc/carofour-ds");
        return (Connection) dataSource.getConnection();
    }
}
