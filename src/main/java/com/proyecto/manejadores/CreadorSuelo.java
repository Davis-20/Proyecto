/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.manejadores;

import com.proyecto.suelo.*;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



/**
 *
 * @author davis
 */

public class CreadorSuelo {
private static int contGrama = 0;
private static int contAgua =0;
private static int contDesierto =0;
    
    public static Suelo[][] CreadorSueloicial(int filas, int columnas){ //retorna una matriz de tipo suelo que va a contener los diferentes tipos de suelo //ojo es un metodo  no un consstructor

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
//                if (i <5 && j<5){ //Genero los diferentes tipo de suelo, Agua, Desierto, Grama para un area 5*5
//
//                    TipoSuelo[][] suelos = new TipoSuelo[5][5];
//                    for (int k = 0; k < 5; k++) {
//                        for (int l = 0; l < 5; l++) {
//                            boolean seCreo = false;
//                            //Grama 40 Agua 35  Desierto 25
//                            
//                            while (seCreo==false) {                                
//                                int n = (int) (Math.random() * (3 - 0)) + 0;
//                                TipoSuelo [] suelosP = new TipoSuelo[3];
//                                suelosP[0] = new Grama("Grama", 5, true);
//                                suelosP[1] = new Agua("Agua");
//                                suelosP[2] = new Desierto("Desierto");
//
//                                if(suelosP[n].getNombre().equals("Grama") && contGrama<10){
//                                    suelos[k][l] = new Grama("Grama", 3, true);
//                                    superficieSuelo  = new Suelo(suelos[k][l], nuevoJLabel);
//                                    suelo[i][j] = superficieSuelo;
//                                    contGrama++;
//                                    seCreo = true;
//                                }
//                            }
//                            
//                            
////                            suelos[k][l] = new Grama("Grama", 3, true);
////                            superficieSuelo  = new Suelo(suelos[k][l], nuevoJLabel);
////                            suelo[i][j] = superficieSuelo;
////                            String nombre = suelo[i][j].getTipoSuelo().getNombre();
//
//                        }
//                    }
//                }
//                
//                else{ //se generara suelo vacio a partir del 5*5
//                    SueloVacio sueloVacio = new SueloVacio("Vacio");
//                    superficieSuelo = new Suelo(sueloVacio, nuevoJLabel);
//                    suelo[i][j] = superficieSuelo;
//                    //System.out.println(sueloVacio.getNombre());
//                
//                }
                
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
                        
                    //superficieSuelo = new Suelo(suelos[n], nuevoJLabel);
                    //suelo[i][j] = superficieSuelo;
                    //System.out.println(suelos[n].getNombre());
                }
                else{ //se generara suelo vacio a partir del 5*5
                    SueloVacio sueloVacio = new SueloVacio("Vacio");
                    superficieSuelo = new Suelo(sueloVacio, nuevoJLabel);
                    suelo[i][j] = superficieSuelo;
                    //System.out.println(sueloVacio.getNombre());
                
                }
            }
        }
        return suelo;
    
    } 

}
