package edu.icet.clothify.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    static DBConnection dbConnection;
    Connection connection;

    private DBConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/pos","root","94510914");
    }
    public static DBConnection getInstance() throws SQLException, ClassNotFoundException {
        if(dbConnection == null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
    public Connection getConnection(){
        return connection;
    }
}
