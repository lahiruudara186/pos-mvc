/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author udara
 */
public class DBConnection {

    private static DBConnection dBConnection;
    private Connection connection;

    private DBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/SuperMarket",
                    "root",
                    "Lahiru@448");
        } catch (Exception e) {
        }

    }

    public static DBConnection getInstance() {
        if (dBConnection == null) {
            dBConnection = new DBConnection();
        }

        return dBConnection;
    }

    public Connection getConnection() {
        return connection; 
    }
}
