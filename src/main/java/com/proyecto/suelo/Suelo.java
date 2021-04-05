
package com.proyecto.suelo;


public abstract class Suelo {
    private String nombre;

    public Suelo(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract String descripcion();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Suelo{" + "nombre=" + nombre + '}';
    }
}
