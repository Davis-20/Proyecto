
package com.proyecto.animales;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Clase gallina en ella definimos los metodos y parametros de la misma
 * @author davis
 */
public class Gallina extends Animal implements Runnable, Omnivoro{
    /**
     * Constructor de la gallina
     * @param nombre  str nombre
     */
    public Gallina(String nombre) {
        //espacio, vida, nombre
        super(0.5, 105, nombre);
    }
    /**
     * Metodo del funcionamiento del hilo de la gallina, en el controlamos su vida
     */
    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, this.getNombre()+" creada");
        while(getVida()!=0){
            setVida((getVida()-1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Gallina.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        JOptionPane.showMessageDialog(null, this.getNombre()+ " muerta");
    }
    /**
     * Metodo de la interfaz omnivoro
     */
    @Override
    public void comeOmnivoro() {
        System.out.println("Es omnivoro");
    }
    
    

    


    
}
