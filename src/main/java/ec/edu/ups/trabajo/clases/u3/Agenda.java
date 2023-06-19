/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.trabajo.clases.u3;

import ec.edu.ups.trabajo.clases.u3.modelo.Contacto;
import java.util.LinkedList;

/**
 *
 * @author aroon
 */
public class Agenda<T,S> {
    private LinkedList<Contacto<T, S>> contactos;

    public Agenda() {
        contactos = new LinkedList<>();
    }

    public void agregar(Contacto<T, S> contacto) {
        contactos.add(contacto);
    }

    public Contacto<T, S> buscar(T nombre) {
        for (Contacto<T, S> contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                return contacto;
            }
        }
        return null;
    }

    public void borrar(T nombre) {
        Contacto<T, S> contact = buscar(nombre);
        if (contactos != null) {
            contactos.remove(contact);

        }
    }

}

