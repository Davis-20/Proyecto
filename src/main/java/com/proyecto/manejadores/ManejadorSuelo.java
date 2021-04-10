/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.manejadores;
import com.proyecto.suelo.Suelo;
import javax.swing.JPanel;


/**
 *
 * @author davis
 */
public class ManejadorSuelo {
    private JPanel sueloPanel;
    private Suelo[][] distribucionSuelo;

    public ManejadorSuelo(JPanel sueloPanel, Suelo[][] distribucionSuelo) {  
        this.sueloPanel = sueloPanel;
        this.distribucionSuelo = distribucionSuelo;
        crearSuelo();
    }
    
    public void crearSuelo(){ //genera la matriz y la agrrega al panel
        for (int i = 0; i < 5; i++) { //filas
            for (int j = 0; j < 5; j++) {  //columnas
                Suelo sueloCreado = this.distribucionSuelo[i][j];
                this.sueloPanel.add(sueloCreado.getSuperficieJLabel());
                
            }
        }
    
    
    }
}
