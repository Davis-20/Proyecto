
package com.proyecto.animales;

public abstract class Animal{
    private double espacio;
    private int vida;
    private String nombre;

    public Animal(double espacio, int vida, String nombre) {
        this.espacio = espacio;
        this.vida = vida;
        this.nombre = nombre;
    }

    public double getEspacio() {
        return espacio;
    }

    public void setEspacio(double espacio) {
        this.espacio = espacio;
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
        return "Animal{" + "espacio=" + espacio + ", vida=" + vida + ", nombre=" + nombre + '}';
    }

    
    
    
    
    
    
}
