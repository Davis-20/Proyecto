
package com.proyecto.persona;




public class Granjero {
    private int oro;
    private int vida;
    private String nombre;

    public Granjero(String nombre) {
        this.oro = 500; //definimos el oro inicial
        this.vida = 100; //definimos la vida inicial
        this.nombre = nombre;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
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
        return "Granjero{" + "oro=" + oro + ", vida=" + vida + ", nombre=" + nombre + '}';
    }

   
    


}
