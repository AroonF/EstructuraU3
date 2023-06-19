/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.trabajo.clases.u3.modelo;

/**
 *
 * @author aroon
 */
public class Contacto <T,S>{
    private T nombre;
    private S telefono;

    public Contacto(T nombre, S telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public T getNombre() {
        return nombre;
    }

    public void setNombre(T nombre) {
        this.nombre = nombre;
    }

    public S getTelefono() {
        return telefono;
    }

    public void setTelefono(S telefono) {
        this.telefono = telefono;
    }
    

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
}
