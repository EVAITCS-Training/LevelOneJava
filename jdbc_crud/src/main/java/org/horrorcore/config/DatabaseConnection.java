package org.horrorcore.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // We'll set this up as a Singleton

    private static DatabaseConnection INSTANCE;
    private Connection connection;

    private DatabaseConnection() {
        try {
            this.connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/subhub",
                    "matt",
                    "Gudmord92!"
            );
        } catch (SQLException exception) {
            System.err.println(exception.getMessage());
        }
    }

    public static DatabaseConnection getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DatabaseConnection();
        }
        return INSTANCE;
    }

    public Connection getConnection() {
        return connection;
    }

}
