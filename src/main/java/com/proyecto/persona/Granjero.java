
package com.proyecto.persona;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;





public class Granjero implements Runnable{
    private int oro;
    private int vida;
    private String nombre;

    public Granjero(String nombre) {
        this.oro = 500; //definimos el oro inicial
        this.vida = 100; //definimos la vida inicial
        this.nombre = nombre;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Granjero{" + "oro=" + oro + ", vida=" + vida + ", nombre=" + nombre + '}';
    }

    @Override
    public void run(){
        while(getVida()!=0){
            int vidaNueva = getVida() - 1 ;
            setVida(vidaNueva);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Granjero.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    
    }
    


}
