
package com.proyecto.plantas;


public abstract class Planta  {
    protected double precio;
    protected int vida;
    protected String nombre;

    public Planta(double precio, int vida, String nombre) {
        this.precio = precio;
        this.vida = vida;
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Planta{" + "precio=" + precio + ", vida=" + vida + ", nombre=" + nombre + '}';
    }

  
    
}
