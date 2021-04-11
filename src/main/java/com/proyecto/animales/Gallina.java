
package com.proyecto.animales;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Gallina extends Animal implements Runnable{

    public Gallina(double espacio, int vida, String nombre) {
        super(espacio, vida, nombre);
    }

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
