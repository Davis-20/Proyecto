
package com.proyecto.test;

import com.proyecto.animales.*;
import com.proyecto.persona.Granjero;

public class Juego {
    
    
    
    
    
    
    public void iniciarJuego(){
        Animal gallina1= new Gallina(0.5,30,"Gallina1");
        Animal vaca1 = new Vaca(1,100,"Vaca1");
        Granjero granjero1 = new Granjero("Davis");
        imprimeAnimal(gallina1);
        imprimeAnimal(vaca1);
        imprimeGranjero(granjero1);
    }
    
    public static void imprimeAnimal(Animal animal){
        System.out.println(animal);
    }
    public static void imprimePlanta(Animal animal){
        System.out.println(animal);
    }
    
    public static void imprimeGranjero(Granjero granjero){
        System.out.println(granjero);
    }
    
}
