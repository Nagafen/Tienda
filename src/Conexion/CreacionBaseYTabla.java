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
import java.util.concurrent.locks.StampedLock;

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
    
    public static void CrearTablaInventario(){
        String url = "jdbc:sqlite:src/BaseDeDatos/tienda.db";
        
        String sql = "create table if not exists Inventario (\n"
                + "id integer primary key AUTOINCREMENT,\n"
                + "descripcion varchar (70) not null,\n"
                + "catidad varchar (3) not null,\n"
                + "precio integer not null)";
        
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void CrearTablaUsuarios(){
        String url ="jdbc:sqlite:src/BaseDeDatos/tienda.db";
        
        String sql = "create table if not exists Usuarios (\n"
                + "nombre varchar (20) not null,\n"
                + "contraseña varchar (20) not null,\n"
                + "correo varchar (40) not null)";
        
        try (Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()) {
            
            stmt.execute(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public static void main(String[] args) {
        CrearBase("tienda");
        CrearTablaInventario();
        CrearTablaUsuarios();
    }

}
