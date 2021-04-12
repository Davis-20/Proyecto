/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.suelo;

/**
 * Clase TipoSuelo
 * @author davis
 */
public class Grama extends TipoSuelo{
    private int diasEnCrecer;
    private boolean esParcela;
    /**
     * constructor Grama
     * @param nombre nombre
     * @param diasEnCrecer diasencrecer
     * @param esParcela boolan
     */
    public Grama(String nombre, int diasEnCrecer, boolean esParcela){
        super(nombre);
        this.diasEnCrecer = diasEnCrecer;
        this.esParcela = esParcela;
    }
    /**
     * Devuelve dias en crecer
     * @return dias
     */
    public int getDiasEnCrecer() {
        return diasEnCrecer;
    }
    /**
     * Define los dias en crecer
     * @param diasEnCrecer dias
     */
    public void setDiasEnCrecer(int diasEnCrecer) {
        this.diasEnCrecer = diasEnCrecer;
    }
    /**
     * Devuelve un boolean
     * @return  boolean
     */
    public boolean isEsParcela() {
        return esParcela;
    }
    /**
     * Define si es parcela o no
     * @param esParcela  boolean
     */
    public void setEsParcela(boolean esParcela) {
        this.esParcela = esParcela;
    }
    
}
