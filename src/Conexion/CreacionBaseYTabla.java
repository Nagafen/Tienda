/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Cristian
 */
public class CreacionBaseYTabla {

    public static void CrearBase(String filename) {
        String url = "jdbc:sqlite:src/BaseDeDatos/" + filename;
        try (Connection conn = DriverManager.getConnection(url)){
            if(conn != null){
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("Driver " + meta.getDriverName());
                System.out.println("Nueva base creada");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void CrearTabla(){
        String url = "jdbc:sqlite:src/BaseDeDatos/prueba.db";
        
        String sql = "create table if not exists Persona (\n"
                + "id varchar (5) primary key,\n"
                + "name varchar (30) not null,\n"
                + "lastname varchar (30) not null)";
        
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        CrearBase("prueba");
        CrearTabla();
        System.out.println("Mi verga es larga :=");
    }

}
