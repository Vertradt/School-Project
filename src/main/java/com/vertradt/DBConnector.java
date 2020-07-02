package com.vertradt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnector {
    private static final String POSTGRES_URL = "jdbc:postgresql://localhost/postgres";
    private static final String LOGIN = "postgres";
    private static final String PASSWORD = "pawel";

    //jak sie da to w jedenj linijce inicjalizcja {....f}; nie wiem czy się da :)
    private final Properties props = getUserDbCredentials();

    Connection getDbConnection() {
        try {
            return DriverManager.getConnection(POSTGRES_URL, props);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private Properties getUserDbCredentials() {
        Properties props = new Properties();
        props.setProperty("user", LOGIN);
        props.setProperty("password", PASSWORD);
        return props;
    }


}
