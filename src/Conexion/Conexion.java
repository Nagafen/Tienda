/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Cristian
 */
public class Conexion {
    
    public static void Connect(){
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:src/BaseDeDatos/Prueba.sql";
            conn = DriverManager.getConnection(url);
            System.out.println("Conexion establecida con exito");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Connect();
    }
}
