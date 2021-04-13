
package com.proyecto.plantas;

/**
 * Clase padre planta
 * @author davis
 */
public class Planta  {
    private double precio;
    private int vida;
    private String nombre;
    private String productoProducido;
    
    /**
     * constructor de la planta
     * @param precio int precio
     * @param vida int vida
     * @param nombre str nombre
     * @param productoProducido str producto 
     */
    public Planta(double precio, int vida, String nombre, String productoProducido) {
        this.precio = precio;
        this.vida = vida;
        this.nombre = nombre;
        this.productoProducido = productoProducido;
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
    /**
     * Devuleve producto producido
     * @return str producto
     */
    public String getProductoProducido() {
        return productoProducido;
    }
    /**
     * Define el producto producido
     * @param productoProducido str producto producido
     */
    public void setProductoProducido(String productoProducido) {
        this.productoProducido = productoProducido;
    }

  
    
}
