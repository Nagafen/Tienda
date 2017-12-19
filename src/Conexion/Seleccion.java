/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Cristian
 */
public class Seleccion {
    
     private Connection conexion() {
        // SQLite connection string
        String url = "jdbc:sqlite:src/BaseDeDatos/prueba.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
     
    public void selectAll(){
        String sql = "SELECT id, name, lastname FROM Persona";
        
        try (Connection conn = this.conexion();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getString("id") + " " +
                                   rs.getString("name") + " " +
                                   rs.getString("lastname"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Seleccion app = new Seleccion();
        app.selectAll();
    }
}
