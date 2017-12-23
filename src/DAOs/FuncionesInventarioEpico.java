/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Conexion.TX;
import VEOs.Inventario;
import VEOs.Usuarios;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author Cristian
 */
public class FuncionesInventarioEpico {

    public void insertar(int id, String descripcion, String cantidad, int precio) throws URISyntaxException, SQLException, IllegalArgumentException, IllegalAccessException {
        Inventario in = new Inventario(id, descripcion, cantidad, precio);
        TX tx = new TX();
        tx.Insertar2(in);
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

    public LinkedList<Inventario> selectAll() {
        String sql = "SELECT id,descripcion,catidad,precio FROM Inventario";
        Inventario in = null;
        LinkedList<Inventario> lol = new LinkedList<>();
        try (Connection conn = this.conexion();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                in = new Inventario(rs.getInt("id"), rs.getString("descripcion"), rs.getString("catidad"), rs.getInt("precio"));
                lol.add(in);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lol;
    }

    public Inventario seleccionarUno(int id) {
        String sql = "SELECT id,descripcion,catidad,precio FROM Inventario WHERE id = ?";
        Inventario in = null;
        int idF = 0;
        String descripcion = null;
        String catidad = null;
        int precio = 0;

        try (Connection conn = this.conexion();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs != null) {
                    while (rs.next()) {
                        idF = rs.getInt("id");
                        descripcion = rs.getString("descripcion");
                        catidad = rs.getString("catidad");
                        precio = rs.getInt("precio");
                        in = new Inventario(idF, descripcion, catidad, precio);
                    }
                } else {
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return in;
    }
    
    public boolean Actualizar(Inventario i){
        boolean respuesta = false;
        
        String sql = "UPDATE Inventario SET descripcion = ?, catidad = ?, precio = ? where id = ?";
        
        try (Connection conn = this.conexion();
                PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, i.getDescripcion());
            stmt.setString(2, i.getCantidad());
            stmt.setInt(3, i.getPrecio());
            stmt.setInt(4, i.getId());
            
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return respuesta;
    }

}
