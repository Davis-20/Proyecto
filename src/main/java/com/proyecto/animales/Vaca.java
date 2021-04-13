
package com.proyecto.animales;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Clase vaca
 * @author davis
 */
public class Vaca extends Animal implements Herbivoro, Runnable{
    /**
     * Constructor de vaca
     * @param espacio int espacio
     * @param vida int vida
     * @param nombre str nombre
     */
    public Vaca(String nombre) {
        //espacio, vida, nombre
        super(2, 105, nombre);
    }

    /**
     * Metodo del funcionamiento del hilo de la vaca, en el controlamos su vida
     */
    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, this.getNombre()+" creada");
        while(getVida()!=0){
            setVida((getVida()-1));
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Vaca.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        JOptionPane.showMessageDialog(null, this.getNombre()+ " muerta");
    }
    /**
     * Metodo de la interfaz herbivoro
     */
    @Override
    public void esHerbivoro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
