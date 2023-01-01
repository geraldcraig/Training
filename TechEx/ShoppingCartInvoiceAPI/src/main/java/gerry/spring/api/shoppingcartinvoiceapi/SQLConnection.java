package gerry.spring.api.shoppingcartinvoiceapi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnection {

    static Connection databaseConnector = null;
    static Statement sqlStatement = null;
    static ResultSet executionResultSet = null;

    public static void ReadFromDatabase() throws SQLException {
        System.out.println("----------Oracle JDBC Connectivity----------");

        try {

        } catch (ClassNotFoundException exception) {
            System.out.println("Oracle Driver Class Not Found Exception");
            return;
        }
    }

    public static void main(String[] args) {
        ReadFromDatabase();
    }
}
