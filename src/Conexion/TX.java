/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import VEOs.Inventario;
import VEOs.Usuarios;
import java.lang.reflect.Field;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Cristian
 */
public class TX {
    
    private Connection conexiones;
    private Connection conexion(){
    
        String url = "jdbc:sqlite:src/BaseDeDatos/tienda.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public TX() throws URISyntaxException, SQLException{
        conexiones = this.conexion();
    }
    
    public boolean Insertar(Usuarios o) throws SQLException, IllegalArgumentException, IllegalAccessException {
        boolean resultado = false;
        try {
            String concat = "";
            Field[] f = o.getClass().getDeclaredFields();
            for (int i = 0; i < f.length; i++) {
                if(i == f.length-1){
                    concat = concat + "'" + (f[i].get(o)) + "'";
                }else{
                    concat = concat + "'" + (f[i].get(o)) + "'" + ",";
                }
            }
            System.out.println(concat);
            String sql = "insert into" + " " + o.getClass().getSimpleName() + " " + "values" + "(" + concat + ")";
            System.out.println(sql);
            PreparedStatement stmt = this.conexiones.prepareStatement(sql);
            stmt.execute();
            System.out.println("Goodies");
            resultado = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    
    public boolean Insertar2(Inventario o) throws SQLException, IllegalArgumentException, IllegalAccessException {
        boolean resultado = false;
        try {
            String concat = "";
            Field[] f = o.getClass().getDeclaredFields();
            for (int i = 0; i < f.length; i++) {
                if(i == f.length-1){
                    concat = concat + "'" + (f[i].get(o)) + "'";
                }else{
                    concat = concat + "'" + (f[i].get(o)) + "'" + ",";
                }
            }
            System.out.println(concat);
            String sql = "insert into" + " " + o.getClass().getSimpleName() + " " + "values" + "(" + concat + ")";
            System.out.println(sql);
            PreparedStatement stmt = this.conexiones.prepareStatement(sql);
            stmt.execute();
            System.out.println("Goodies");
            resultado = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    
    
}
