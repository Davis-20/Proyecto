
package com.proyecto.test;

import com.proyecto.animales.Animal;
import com.proyecto.animales.Gallina;

public class Juego {
    
    
    
    
    
    
    public void iniciarJuego(){
        Animal gallina= new Gallina(0.5,100,"Gallina1");
        imprime(gallina);
    }
    
    public static void imprime(Animal animal){
        System.out.println(animal);
    }
}
