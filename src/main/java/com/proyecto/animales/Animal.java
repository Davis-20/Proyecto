
package com.proyecto.animales;
/**
 * clase padre de los animales
 * @author davis
 */
public abstract class Animal{
    private double espacio;
    private int vida;
    private String nombre;
    /**
     * Connstructor de la clase animal
     * @param espacio int espacio
     * @param vida int vida
     * @param nombre  str nombre
     */
    public Animal(double espacio, int vida, String nombre) {
        this.espacio = espacio;
        this.vida = vida;
        this.nombre = nombre;
    }
    /**
     * Metodo que obtiene el espacio ocuapdo por un animal
     * @return int espacio
     */
    public double getEspacio() {
        return espacio;
    }
    /**
     * Metodo que define el espacio ocupado por un animal
     * @param espacio int espacio
     */
    public void setEspacio(double espacio) {
        this.espacio = espacio;
    }
    /**
     * Metodo que regresa la vida del animal
     * @return int vida
     */
    public int getVida() {
        return vida;
    }
    /**
     * Metodo que define la vida del animal
     * @param vida int vida
     */
    public void setVida(int vida) {
        this.vida = vida;
    }
    /**
     * Metodo que regresa el nombre del animal
     * @return str nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo que define el nombre del animal
     * @param nombre str nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo que devuelve los parametros del animal
     * @return parametro del animal
     */
    @Override
    public String toString() {
        return "Animal{" + "espacio=" + espacio + ", vida=" + vida + ", nombre=" + nombre + '}';
    }
    
    
    
    
    
    
}
