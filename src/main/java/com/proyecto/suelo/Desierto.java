
package com.proyecto.suelo;


public class Desierto extends Suelo{

    public Desierto(String nombre) {
        super(nombre);
    }

    @Override
    public String descripcion() {
        return "Al ser tierra arida no se puede hacer nada en este tipo de suelo"+ this;
    }
    
}
