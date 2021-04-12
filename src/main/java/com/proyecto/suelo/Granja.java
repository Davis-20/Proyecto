
package com.proyecto.suelo;

import com.proyecto.manejadores.CreadorSuelo;
/**
 * Clase Granja
 * @author davis
 */

//es la encargada de devolver el array de suelos
public class Granja {
    private Suelo[][] suelo;
    /**
     * Constructor Granaja
     * @param filas No.filas
     * @param columnas  No.coluumnas
     */
    public Granja(int filas, int columnas){
        this.suelo = CreadorSuelo.CreadorSueloicial(filas, columnas);
    }
    /**
     * Devuelve un array de suelos
     * @return array de suelos
     */
    public Suelo[][] getSuelo() {
        return suelo;
    }
    /**
     * Define un array de suelos
     * @param suelo array suelos
     */
    public void setSuelo(Suelo[][] suelo) {
        this.suelo = suelo;
    }
    
    
    
    
}
