
package com.proyecto.suelo;


public class Grama extends Suelo{

    public Grama(String nombre) {
        super(nombre);
    }

    @Override
    public String descripcion() {
        return "Permite la siembra y permite ser parte de parcelas para la crianza de animales"+ this;
    }
    
}
