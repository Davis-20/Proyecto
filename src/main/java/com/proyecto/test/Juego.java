
package com.proyecto.test;

import com.proyecto.animales.*;
import com.proyecto.interfaces.BotonJLabel;
import com.proyecto.interfaces.GranjaJFrame;
import com.proyecto.persona.Granjero;
import com.proyecto.plantas.*;
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
        //Hilo plantas
        Maiz maiz1 = new Maiz("Maicito");
        Manzano manzano1 = new Manzano("MAnzanito");
        Thread p = new Thread(maiz1);
        Thread p1 = new Thread(manzano1);
        p.start();
        p1.start();
        
        //lista de plantas
        Planta [] listaPlantas = new Planta[2];
        listaPlantas[0]= maiz1;
        listaPlantas[1]= manzano1;
        
        //Hilo animales
        Gallina gallina1 = new Gallina("Gallileta");
        Vaca vaca1 = new Vaca("VacaLola");
        Thread a = new Thread(gallina1);
        Thread a1 = new Thread(vaca1);
        a.start();
        a1.start();
        
        //lista de animales
        Animal [] listaAnimales = new Animal[2];
        listaAnimales[0] = gallina1;
        listaAnimales[1] = vaca1;
        
        //granjero + paso de lista de animales, plantas
        Granjero granjero = new Granjero(JOptionPane.showInputDialog("Ingresa tu Nick"),botonVida,botonOro);
        granjero.setAnimales(listaAnimales);
        granjero.setPlantas(listaPlantas);


        //System.out.println(granjero.getAnimales()[0].getNombre());
        
        
        //Instanciamos la nueva granja
        GranjaJFrame nuevaGranja = new GranjaJFrame(7,5,granjero);
        nuevaGranja.setVisible(true);
        
        
        
        //Hilo del granjero con la informacion del granjero
        nuevaGranja.add(botonVida).setBounds(10, 350, 50, 50); //Boton de vida
        nuevaGranja.add(botonOro).setBounds(10, 370, 50, 50); //Boton de oro
        Thread t = new Thread(granjero);
        t.start();
        
        
        
    }
    
    
    
    
    
    
}
