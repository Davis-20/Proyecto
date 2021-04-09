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
public class SuperficieJlabel extends JLabel{
    private int numeroColumnas;
    private int numeroFilas;

    public SuperficieJlabel(int numeroColumnas, int numeroFilas) {
        this.numeroColumnas = numeroColumnas;
        this.numeroFilas = numeroFilas;
    }

    public int getNumeroColumnas() {
        return numeroColumnas;
    }

    public void setNumeroColumnas(int numeroColumnas) {
        this.numeroColumnas = numeroColumnas;
    }

    public int getNumeroFilas() {
        return numeroFilas;
    }

    public void setNumeroFilas(int numeroFilas) {
        this.numeroFilas = numeroFilas;
    }
    
    
}
