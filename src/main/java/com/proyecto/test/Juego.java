
package com.proyecto.test;

import com.proyecto.animales.*;
import com.proyecto.interfaces.BotonJLabel;
import com.proyecto.interfaces.GranjaJFrame;
import com.proyecto.persona.Granjero;
import com.proyecto.plantas.*;
import com.proyecto.suelo.*;
import javax.swing.JOptionPane;
/**
 * En esta clase se instanciaron los objetos para la creacion del juego
 * @author davis
 */
public class Juego {

    /**
     * Aqui se instancian los objetos e hilos
     */
    public void iniciarJuego(){
        //labels de inf de vida + oro
        BotonJLabel botonVida = new BotonJLabel("Vida");
        BotonJLabel botonOro = new BotonJLabel("Oro");

        
        
        //animales
        Gallina gallina1 = new Gallina(1, 20, "Gallileta");
        Thread a = new Thread(gallina1);
        a.start();
        Animal [] listaAnimales = new Animal[2];
        listaAnimales [0] = gallina1;
        
        //Hilo del la granja + granjero
        Granjero granjero = new Granjero(JOptionPane.showInputDialog("Ingresa tu Nick"),botonVida,botonOro, listaAnimales);
        System.out.println( granjero.getAnimales().getClass());
        GranjaJFrame nuevaGranja = new GranjaJFrame(7,5,granjero);
        nuevaGranja.setVisible(true);
        
        
        
        //Labels con la informacion del granjero
        nuevaGranja.add(botonVida).setBounds(10, 350, 50, 50); //Boton de vida
        nuevaGranja.add(botonOro).setBounds(10, 370, 50, 50); //Boton de vida
        Thread t = new Thread(granjero);
        t.start();
        
        
        
    }
    
    
    
    
    
    
}
