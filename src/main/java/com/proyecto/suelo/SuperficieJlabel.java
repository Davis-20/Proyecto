/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.suelo;

import javax.swing.JLabel;

/**
 * Clase JLabel la cual nos servira para asignarle un JLabel a c/u de los suelos
 * @author davis
 */
//estamos creando un label, asignandole un texto y la posicion en fila, columna
public class SuperficieJLabel extends JLabel{
    private int numeroFilas;
    private int numeroColumnas;
    /**
     * Constructor JLabel
     * @param numeroFilas filas
     * @param numeroColumnas columas
     * @param texto textocualquiera
     */
    public SuperficieJLabel(int numeroFilas, int numeroColumnas, String texto) {
        super(texto);  //va a ser el texto que le pasemos por parametro al jlabel
        this.numeroColumnas = numeroColumnas;
        this.numeroFilas = numeroFilas;
        
    }
    /**
     * Devuelve el numero de filas
     * @return filas
     */
    public int getNumeroFilas() {
        return numeroFilas;
    }
    /**
     * Define el numero de filas
     * @param numeroFilas int filas
     */
    public void setNumeroFilas(int numeroFilas) {
        this.numeroFilas = numeroFilas;
    }
    /**
     * Devuelve el numero de columnas
     * @return columnas
     */
    public int getNumeroColumnas() {
        return numeroColumnas;
    }
    /**
     * Define el numero de columnas
     * @param numeroColumnas int columas
     */
    public void setNumeroColumnas(int numeroColumnas) {
        this.numeroColumnas = numeroColumnas;
    }
    
    
}
