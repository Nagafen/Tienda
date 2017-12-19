/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Cristian
 */
public class PruebitaInsert {
    
    private Connection conexion(){
    
        String url = "jdbc:sqlite:src/BaseDeDatos/prueba.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public void insert(String id, String nombre, String apellido){
        String sql = "insert into Persona values (?,?,?)";
        
        try (Connection conn = this.conexion();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id);
            pstmt.setString(2, nombre);
            pstmt.setString(3, apellido);
            pstmt.executeUpdate();
            System.out.println("Insercion Exitosa");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        PruebitaInsert app = new PruebitaInsert();     
        app.insert("dd", "ff", "tipo");
    }
}
