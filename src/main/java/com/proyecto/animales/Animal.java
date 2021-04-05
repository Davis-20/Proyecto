
package com.proyecto.animales;

public abstract class Animal {
    private int espacio;
    private int vida;
    private String nombre;

    public Animal(int espacio, int vida, String nombre) {
        this.espacio = espacio;
        this.vida = vida;
        this.nombre = nombre;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
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
