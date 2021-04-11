/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.suelo;

import javax.swing.JLabel;

/**
 *
 * @author davis
 */
//estamos creando un label, asignandole un texto y la posicion en fila, columna
public class SuperficieJLabel extends JLabel{
    private int numeroFilas;
    private int numeroColumnas;

    public SuperficieJLabel(int numeroFilas, int numeroColumnas, String texto) {
        super(texto);  //va a ser el texto que le pasemos por parametro al jlabel
        this.numeroColumnas = numeroColumnas;
        this.numeroFilas = numeroFilas;
        
    }

    public int getNumeroFilas() {
        return numeroFilas;
    }

    public void setNumeroFilas(int numeroFilas) {
        this.numeroFilas = numeroFilas;
    }

    public int getNumeroColumnas() {
        return numeroColumnas;
    }

    public void setNumeroColumnas(int numeroColumnas) {
        this.numeroColumnas = numeroColumnas;
    }
    
    
}
