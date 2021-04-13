
package com.proyecto.plantas;

import com.proyecto.animales.Herbivoro;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Clase Manzano
 * @author davis
 */
public class Manzano extends Planta implements Runnable{
    /**
     * Constructor Manzano
     * @param nombre str nombre
     */
    public Manzano(String nombre) {
        //precio, vida, nombre, producto
         super(25, 125, nombre, "Manzana");
    }

    /**
     * Contenido del hilo para el manzano
     */
    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, this.getNombre() +" creada");
        while(getVida()!=0){
            setVida((getVida()-1));
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Manzano.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        JOptionPane.showMessageDialog(null, this.getNombre()+ " muerta");
    }
    
    
    

    
    
}
