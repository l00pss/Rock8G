package dataAccess.concretes;

import dataAccess.abstracts.GConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresGConnection implements GConnection {
    private String username;
    private String password;
    private String url;

    private Connection connection;

    public PostgresGConnection(String username, String password, String url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    public PostgresGConnection() {
    }


    @Override
    public Connection getConnection() throws SQLException {
        connection = DriverManager.getConnection(url,username,password);
        return connection;
    }

    @Override
    public void close() throws SQLException {
        if(connection!=null) connection.close();
    }
}
