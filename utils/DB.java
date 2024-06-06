package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private Connection connection;

    public DB(String dbURL, String username, String password) throws SQLException {
        this.connection = DriverManager.getConnection(dbURL, username, password);
    }

   
}
