/**
 * Aqui defino la clase "Padre" de los suelos de ella heredaran cada uno de los suelos
 */
package com.proyecto.suelo;
/**
 * Clase TipoSuelo
 * @author davis
 */
public class TipoSuelo {
    private String nombre;
    /**
     * Constructor TipoSuelo
     * @param nombre recibe un nombre
     */
    public TipoSuelo(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Devuelve nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Define nombre
     * @param nombre Str nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
