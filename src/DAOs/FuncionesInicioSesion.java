/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Conexion.TX;
import VEOs.Usuarios;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cristian
 */



public class FuncionesInicioSesion {    
    public void insertar(String nombre, String clave, String correo) throws URISyntaxException, SQLException, IllegalArgumentException, IllegalAccessException{
        Usuarios per = new Usuarios(nombre, clave, correo);
        TX tx = new TX();
        tx.Insertar(per);
    }
    
    private Connection conexion() {
        // SQLite connection string
        String url = "jdbc:sqlite:src/BaseDeDatos/tienda.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public Usuarios seleccionarUno(String nombre) {
        String sql = "SELECT nombre,contraseña FROM Usuarios WHERE nombre = ?";
        Usuarios usu = null;
        String nombreF = null;
        String contra = null;
        try (Connection conn = this.conexion();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombre);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs != null) {
                    while (rs.next()) {
                        nombreF = rs.getString("nombre");
                        contra = rs.getString("contraseña");
                        usu = new Usuarios(nombreF, contra, null);
                    }
                }else{
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return usu;
    }
}
