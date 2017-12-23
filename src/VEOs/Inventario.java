/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VEOs;

/**
 *
 * @author Cristian
 */
public class Inventario {
    
    public int id;
    public String descripcion;
    public String cantidad;
    public int precio;

    public Inventario(int id, String descripcion, String cantidad, int precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Inventario{" + "id=" + id + ", descripcion=" + descripcion + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }  
}
