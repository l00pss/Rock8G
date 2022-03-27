package dataAccess.abstracts;

import java.sql.Connection;
import java.sql.SQLException;

public interface GConnection {
    Connection getConnection() throws SQLException;
    void close() throws SQLException;
}
