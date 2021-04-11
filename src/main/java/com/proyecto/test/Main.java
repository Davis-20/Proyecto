
package com.proyecto.test;
import com.proyecto.interfaces.BotonJLabel;
import com.proyecto.interfaces.GranjaJFrame;
import com.proyecto.persona.Granjero;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        BotonJLabel botonVida = new BotonJLabel("Vida");
        BotonJLabel botonOro = new BotonJLabel("Oro");
        Granjero granjero = new Granjero(JOptionPane.showInputDialog("Ingresa tu Nick"),botonVida,botonOro);
        
        GranjaJFrame nuevaGranja = new GranjaJFrame(7,5,granjero);
        
        nuevaGranja.setVisible(true);
        
        
        
        //boton1.setLocation(0, 0);
        nuevaGranja.add(botonVida).setBounds(10, 350, 50, 50); //Boton de vida
        nuevaGranja.add(botonOro).setBounds(10, 370, 50, 50); //Boton de vida
        Thread t = new Thread(granjero);
        t.start();
    }
}
