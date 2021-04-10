/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.manejadores;

import com.proyecto.suelo.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import jdk.dynalink.SecureLookupSupplier;


/**
 *
 * @author davis
 */

public class CreadorSuelo {

    
    public static Suelo[][] CreadorSueloicial(){ //retorna una matriz de tipo suelo que va a contener los diferentes tipos de suelo //ojo es un metodo  no un consstructor

        Suelo superficieSuelo;
        Suelo[][] suelo = new Suelo[10][10];
        for(int i = 0; i < 10 ; i++){ //fila
            for (int j = 0; j < 10; j++) { //columna
                SuperficieJLabel nuevoJLabel = new SuperficieJLabel(i, j,"Nombre : "  + " Fila: " + i + " Columna: " + j );  
                nuevoJLabel.addMouseListener(new java.awt.event.MouseAdapter(){
                    
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt){
                        SuperficieJLabel label = (SuperficieJLabel)evt.getComponent();
                        label.setForeground(Color.green);
                        //System.out.println("Fila: "+label.getNumeroFilas() + " Columna: "+ laber.getNumeroColumnas());
                        //suelo[label.getNumeroFilas()][label.getNumeroColumnas()].getTipoSuelo().getNombre() nos devuelve el nombre del tipo de suelo en la fila y columna indicada
                        //suelo[label.getNumeroFilas()][label.getNumeroColumnas()].getTipoSuelo() obtendre el tipo de suelo y con eso puedo llamar a sus metodos
                        JOptionPane.showMessageDialog(null,"Nombre: "+ suelo[label.getNumeroFilas()][label.getNumeroColumnas()].getTipoSuelo().getNombre()   +  " fila: "+ label.getNumeroFilas()+" Columna: "+ label.getNumeroColumnas());
                        
                        

                    }
                
                });
                TipoSuelo [] suelos = new TipoSuelo[3];
                suelos[0] = new Grama("Grama", 5, true);
                suelos[1] = new Agua("Agua");
                suelos[2] = new Desierto("Desierto");
                
                //el suelo vacio sera por aparte
                SueloVacio sueloVacio = new SueloVacio("Vacio");
                
                
                if (i <5 && j<5){ //Genero los diferentes tipo de suelo, Agua, Desierto, Grama para un area 5*5
                    int n = (int) (Math.random() * (3 - 0)) + 0;
                    superficieSuelo = new Suelo(suelos[n], nuevoJLabel);
                    suelo[i][j] = superficieSuelo;
                    //System.out.println(suelos[n].getNombre());
                }
                else{ //se generara suelo vacio a partir del 5*5
                    superficieSuelo = new Suelo(sueloVacio, nuevoJLabel);
                    suelo[i][j] = superficieSuelo;
                    //System.out.println(sueloVacio.getNombre());
                
                }
            }
        }
        return suelo;
    
    } 
   
    
}
