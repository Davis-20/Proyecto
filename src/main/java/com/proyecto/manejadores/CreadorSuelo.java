/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.manejadores;

import com.proyecto.suelo.Grama;
import com.proyecto.suelo.Suelo;
import com.proyecto.suelo.SuperficieJLabel;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author davis
 */
public class CreadorSuelo {
    
    public static Suelo[][] CreadorSueloicial(){ //retorna una matriz de tipo suelo que va a contener los diferentes tipos de suelo //ojo es un metodo  no un consstructor
        Suelo superficieSuelo;
        Suelo[][] suelo = new Suelo[5][5];
        for(int i = 0; i < 5 ; i++){
            for (int j = 0; j < 5; j++) {
                SuperficieJLabel nuevoJLabel = new SuperficieJLabel(i, j, "Fila: " + i + " Columna: " + j );  
                nuevoJLabel.addMouseListener(new java.awt.event.MouseAdapter(){
                    
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt){
                        SuperficieJLabel label = (SuperficieJLabel)evt.getComponent();
                        label.setForeground(Color.green);
                        //System.out.println("Fila: "+label.getNumeroFilas() + " Columna: "+ laber.getNumeroColumnas());
                        JOptionPane.showMessageDialog(null, "fila: "+ label.getNumeroFilas()+" Columna:"+ label.getNumeroColumnas());
                        

                    }
                
                });
                Grama grama = new Grama("Grama", 5, true);
                superficieSuelo = new Suelo(grama, nuevoJLabel);
                suelo[i][j] = superficieSuelo;
            }
        }
        return suelo;
    
    } 
    
}
