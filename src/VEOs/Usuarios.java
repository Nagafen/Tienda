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
public class Usuarios {
    
    public String nombre;
    public String contraseña;
    public String correo;

    public Usuarios(String nombre, String contraseña, String correo) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", contrase\u00f1a=" + contraseña + ", correo=" + correo + '}';
    }

    
    
    
}
