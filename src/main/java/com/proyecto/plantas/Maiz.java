
package com.proyecto.plantas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Clase Maiz
 * @author davis
 */
public class Maiz extends Planta implements Runnable{

    /**
     * Clase maiz
     * @param nombre  str nombre
     */
    public Maiz(String nombre) {
        //precio, vida, nombre, producto
        super(25, 110, nombre, "Grano");
    }

    /**
     * Hilo del maiz
     */
    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, this.getNombre() +" creada");
        while(getVida()!=0){
            setVida((getVida()-1));
            
             
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Maiz.class.getName()).log(Level.SEVERE, null, ex);
            }
             
            
        }
        JOptionPane.showMessageDialog(null, this.getNombre()+ " muerta");
    }

   
    
}
