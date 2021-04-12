
package com.proyecto.plantas;

/**
 * Clase padre planta
 * @author davis
 */
public class Planta  {
    private double precio;
    private int vida;
    private String nombre;
    /**
     * Constructor de la planta
     * @param precio precio
     * @param vida vida
     * @param nombre  nombre
     */
    public Planta(double precio, int vida, String nombre) {
        this.precio = precio;
        this.vida = vida;
        this.nombre = nombre;
    }
    /**
     * Devuelve precio
     * @return precio int
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Define precio
     * @param precio precio 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * Devuleve vida
     * @return vida int
     */

    public int getVida() {
        return vida;
    }
    /**
     * Define vida
     * @param vida vida int 
     */
    public void setVida(int vida) {
        this.vida = vida;
    }
    /**
     * Devuelve nombre
     * @return str nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Define nombre
     * @param nombre nombre str 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Devuelve los paramatros de la planta
     * @return parametros
     */
    @Override
    public String toString() {
        return "Planta{" + "precio=" + precio + ", vida=" + vida + ", nombre=" + nombre + '}';
    }

  
    
}
