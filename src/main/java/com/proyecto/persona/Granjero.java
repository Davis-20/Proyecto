
package com.proyecto.persona;


import com.proyecto.interfaces.BotonJLabel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;






public class Granjero implements Runnable{
    private int oro;
    private int vida;
    private String nombre;
    private BotonJLabel botonJLabel;
    private BotonJLabel botonJLabel1;

    public Granjero(String nombre, BotonJLabel botonJLabel, BotonJLabel botonJLabel1) {
        this.oro = 500; //definimos el oro inicial
        this.vida = 100; //definimos la vida inicial
        this.nombre = nombre;
        this.botonJLabel = botonJLabel;
        this.botonJLabel1 = botonJLabel1;
        
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
            getBotonJLabel().setText("Vida: \n\n"+getVida());
            getBotonJLabel1().setText("Oro: \n\n"+getOro()); //Esto es opcional, es solo para ver si actualizaba el oro, pero esolo puedo hacer sin necesidd de hilos
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Granjero.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        JOptionPane.showMessageDialog(null,"Moriste");
    
    }

    public BotonJLabel getBotonJLabel() {
        return botonJLabel;
    }

    public void setBotonJLabel(BotonJLabel botonJLabel) {
        this.botonJLabel = botonJLabel;
    }

    public BotonJLabel getBotonJLabel1() {
        return botonJLabel1;
    }

    public void setBotonJLabel1(BotonJLabel botonJLabel1) {
        this.botonJLabel1 = botonJLabel1;
    }
    


}
