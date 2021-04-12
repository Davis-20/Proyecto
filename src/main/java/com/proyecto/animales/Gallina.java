
package com.proyecto.animales;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Clase gallina en ella definimos los metodos y parametros de la misma
 * @author davis
 */
public class Gallina extends Animal implements Runnable{
    /**
     * Constructor de la gallina
     * @param espacio int espacio
     * @param vida int vida
     * @param nombre  str nombre
     */
    public Gallina(double espacio, int vida, String nombre) {
        super(espacio, vida, nombre);
    }
    /**
     * Metodo del funcionamiento del hilo de la gallina, en el controlamos su vida
     */
    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, "Gallina creada");
        while(getVida()!=0){
            setVida((getVida()-1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Gallina.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        JOptionPane.showMessageDialog(null, "Gallina muerta");
    }
    
    

    


    
}
