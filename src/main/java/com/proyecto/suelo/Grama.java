
package com.proyecto.suelo;


public class Grama extends TipoSuelo{
    private int tiempoCrecerPlanta;
    private boolean esParcela;

    public Grama(int tiempoCrecerPlanta, boolean esParcela, String nombre) {
        super(nombre);
        this.tiempoCrecerPlanta = tiempoCrecerPlanta;
        this.esParcela = esParcela;
    }

    

    public int getTiempoCrecerPlanta() {
        return tiempoCrecerPlanta;
    }

    public void setTiempoCrecerPlanta(int tiempoCrecerPlanta) {
        this.tiempoCrecerPlanta = tiempoCrecerPlanta;
    }

    public boolean isEsParcela() {
        return esParcela;
    }

    public void setEsParcela(boolean esParcela) {
        this.esParcela = esParcela;
    }
    
}
