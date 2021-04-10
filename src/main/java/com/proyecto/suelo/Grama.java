/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.suelo;

/**
 *
 * @author davis
 */
public class Grama extends TipoSuelo{
    private int diasEnCrecer;
    private boolean esParcela;
    
    public Grama(String nombre, int diasEnCrecer, boolean esParcela){
        super(nombre);
        this.diasEnCrecer = diasEnCrecer;
        this.esParcela = esParcela;
    }

    public int getDiasEnCrecer() {
        return diasEnCrecer;
    }

    public void setDiasEnCrecer(int diasEnCrecer) {
        this.diasEnCrecer = diasEnCrecer;
    }

    public boolean isEsParcela() {
        return esParcela;
    }

    public void setEsParcela(boolean esParcela) {
        this.esParcela = esParcela;
    }
    
}
