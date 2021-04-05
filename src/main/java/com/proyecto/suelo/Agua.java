
package com.proyecto.suelo;


public class Agua extends Suelo{

    public Agua(String nombre) {
        super(nombre);
    }

    @Override
    public String descripcion() {
        return "Permite la pesca "+this.getNombre();
    }
    
}
