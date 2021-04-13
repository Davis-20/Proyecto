/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.manejadores;

import com.proyecto.suelo.*;
import java.awt.Color;
import javax.swing.JOptionPane;



/**
 * Clase CreadorSuelo
 * @author davis
 */

public class CreadorSuelo {
private static int contGrama = 0;
private static int contAgua =0;
private static int contDesierto =0;
    /**
     * retorna una matriz de tipo suelo que va a contener los diferentes tipos de suelo //ojo es un metodo  no un consstructor
     * @param filas int filas
     * @param columnas int columnas
     * @return array 2 dimensiones de tipo suelo
     */
    public static Suelo[][] CreadorSueloicial(int filas, int columnas){ 

        Suelo superficieSuelo;
        Suelo[][] suelo = new Suelo[filas][columnas];
        for(int i = 0; i < filas ; i++){ //fila
            for (int j = 0; j < columnas; j++) { //columna
                SuperficieJLabel nuevoJLabel = new SuperficieJLabel(i, j,"F: " + i + " C: " + j );  
                //nuevoJLabel.setIcon(new ImageIcon("src/image.png")); //Queria agregar icono jaja
                
               
                nuevoJLabel.addMouseListener(new java.awt.event.MouseAdapter(){
                    
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt){
                        SuperficieJLabel label = (SuperficieJLabel)evt.getComponent();
                        //label.setForeground(Color.green); //cambia color texto
                        //System.out.println("Fila: "+label.getNumeroFilas() + " Columna: "+ laber.getNumeroColumnas());
                        //suelo[label.getNumeroFilas()][label.getNumeroColumnas()].getTipoSuelo().getNombre() nos devuelve el nombre del tipo de suelo en la fila y columna indicada
                        //suelo[label.getNumeroFilas()][label.getNumeroColumnas()].getTipoSuelo() obtendre el tipo de suelo y con eso puedo llamar a sus metodos
                        JOptionPane.showMessageDialog(null,"Nombre: "+ suelo[label.getNumeroFilas()][label.getNumeroColumnas()].getTipoSuelo().getNombre()   +  " fila: "+ label.getNumeroFilas()+" Columna: "+ label.getNumeroColumnas());
                        
                        

                    }
                
                });
                
               //3 tipos de suelo
                TipoSuelo [] suelos = new TipoSuelo[3];
                suelos[0] = new Grama("Grama", 5, true);
                suelos[1] = new Agua("Agua");
                suelos[2] = new Desierto("Desierto");
               
              //  el suelo vacio sera por aparte

                if (i <5 && j<5){ //Genero los diferentes tipo de suelo, Agua, Desierto, Grama para un area 5*5
                   
                 //   Grama 40 Agua 35  Desierto 25
                     
                    while(true){
                        int n = (int) (Math.random() * (100 - 0)) + 0;
                        if(n<40 && contGrama<10){ //Grama
                            superficieSuelo = new Suelo(suelos[0], nuevoJLabel);
                            nuevoJLabel.setBackground(Color.green);
                            nuevoJLabel.setOpaque(true);
                            nuevoJLabel.setText("Grama");
                            suelo[i][j] = superficieSuelo;
                            contGrama++;
                            System.out.println("Se creo grama "+ contGrama);
                            break;
                        }
                        else if (n>=40 && n<=75 && contAgua<8) { //Agua
                            superficieSuelo = new Suelo(suelos[1], nuevoJLabel);
                            nuevoJLabel.setBackground(Color.cyan);
                            nuevoJLabel.setOpaque(true);
                            nuevoJLabel.setText("Agua");
                            suelo[i][j] = superficieSuelo;
                            contAgua++;
                            System.out.println("Se creo Agua "+ contAgua);
                            break;
                        }
                        else if(n>75 && n<=100 && contDesierto<7){ //Desierto
                            superficieSuelo = new Suelo(suelos[2], nuevoJLabel);
                            nuevoJLabel.setBackground(Color.orange);
                            nuevoJLabel.setOpaque(true);
                            nuevoJLabel.setText("Desierto");
                            suelo[i][j] = superficieSuelo;
                            contDesierto++;
                            System.out.println("Se creo Desierto "+ contDesierto);
                            break;
                        }
                    }
                }
                else{ //se generara suelo vacio a partir del 5*5
                    SueloVacio sueloVacio = new SueloVacio("Vacio");
                    superficieSuelo = new Suelo(sueloVacio, nuevoJLabel);
                    suelo[i][j] = superficieSuelo;                
                }
            }
        }
        return suelo;
    
    } 
    //aqui agregaria los metodos para pescar, sembrar, criar

}
