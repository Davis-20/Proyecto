/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.manejadores;
import com.proyecto.suelo.Suelo;
import javax.swing.JPanel;


/**
 *  Clase Manejador Suelo, es la encargada de asignarle un panel a c/u de los suelos
 * @author davis
 */
public class ManejadorSuelo {
    private JPanel sueloPanel;
    private Suelo[][] distribucionSuelo;
    private int filas;
    private int columnas;
    /**
     * Constructor Manejador Suelo
     * @param sueloPanel Panel
     * @param distribucionSuelo arraySuelo
     * @param filas int filas
     * @param columnas int columnas
     */
    public ManejadorSuelo(JPanel sueloPanel, Suelo[][] distribucionSuelo, int filas, int columnas) {  
        this.columnas = columnas;
        this.filas  = filas;
        this.sueloPanel = sueloPanel;
        this.distribucionSuelo = distribucionSuelo;
        crearSuelo();
    }
    /**
     * Metodo encargado de definir un panel para cada suelo
     */
    public void crearSuelo(){ //genera la matriz y la agrrega al panel
        for (int i = 0; i < filas; i++) { //filas
            for (int j = 0; j < columnas; j++) {  //columnas
                Suelo sueloCreado = this.distribucionSuelo[i][j];
                this.sueloPanel.add(sueloCreado.getSuperficieJLabel());
                
            }
        }
    
    
    }
}
