
package com.proyecto.test;
import com.proyecto.interfaces.GranjaJFrame;
import com.proyecto.persona.Granjero;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        Granjero granjero = new Granjero(JOptionPane.showInputDialog("Ingresa tu Nick"));
        GranjaJFrame nuevaGranja = new GranjaJFrame(7,5,granjero);
        nuevaGranja.setVisible(true);
        Thread t = new Thread(granjero);
        t.start();
    }
}
