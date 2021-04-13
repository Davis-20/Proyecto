
package com.proyecto.persona;


import com.proyecto.animales.Animal;
import com.proyecto.interfaces.BotonJLabel;
import com.proyecto.plantas.Planta;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Clase granjero en ella definimos los metodo y parametros del mismo
 * @author davis
 */

public class Granjero implements Runnable{
    private int oro;
    private int vida;
    private String nombre;
    private BotonJLabel botonJLabel;
    private BotonJLabel botonJLabel1;
    private Animal [] animales;
    private Planta[] plantas;
    private String[] alimentos;
    private int tiempo;
    /**
     * Constructor granjero
     * @param nombre Str nombre
     * @param botonJLabel Es elJlabel
     * @param botonJLabel1 Es elJlabel
     */
    public Granjero(String nombre, BotonJLabel botonJLabel, BotonJLabel botonJLabel1) {
        this.oro = 500; //definimos el oro inicial
        this.vida = 100; //definimos la vida inicial
        this.nombre = nombre;
        this.botonJLabel = botonJLabel;
        this.botonJLabel1 = botonJLabel1;
        this.alimentos = new String[0];
        this.plantas = new Planta[0];
        this.tiempo = 0;

        
    }
    /**
     * Devuelve el oro
     * @return oro int
     */
    public int getOro() {
        return oro;
    }
    /**
     * Define el oro
     * @param oro int oro
     */
    public void setOro(int oro) {
        this.oro = oro;
    }
    /**
     * Devuelve la vida
     * @return int vida
     */
    public int getVida() {
        return vida;
    }
    /**
     * Define la vida
     * @param vida int vida
     */
    public void setVida(int vida) {
        this.vida = vida;
    }
    /**
     * Devuelve nombre
     * @return El nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Define el nombre
     * @param nombre  Es el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    /**
     * Devuelve parametros del granjero
     * @return Parametros
     */
    @Override
    public String toString() {
        return "Granjero{" + "oro=" + oro + ", vida=" + vida + ", nombre=" + nombre + '}';
    }
    /**
     * Es el hilo del granjero
     */
    @Override
    public void run(){
        while(getVida()!=0){
            int vidaNueva = getVida() - 1 ; //Vida
            int tiempoNuevo = getTiempo() +1; //Tiempo
            setTiempo(tiempoNuevo);
            setVida(vidaNueva);
            getBotonJLabel().setText("Vida: \n\n"+getVida()); //imprimimos la vida del granjero
            //getBotonJLabel1().setText("Oro: \n\n"+getOro()); //Esto es opcional, es solo para ver si actualizaba el oro, pero esolo puedo hacer sin necesidd de hilos
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Granjero.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        JOptionPane.showMessageDialog(null,"Moriste");
    
    }
    /**
     * Devuelve el Jlabel de la vida
     * @return JLanel
     */
    public BotonJLabel getBotonJLabel() {
        return botonJLabel;
    }
    /**
     * Define el JLabel
     * @param botonJLabel Es el JLabel  
     */
    public void setBotonJLabel(BotonJLabel botonJLabel) {
        this.botonJLabel = botonJLabel;
    }
    /**
     * Es el JLabel del oro
     * @return Oro
     */
    public BotonJLabel getBotonJLabel1() {
        return botonJLabel1;
    }
    /**
     * Es el JLabel del oro
     * @param botonJLabel1  Es el oro
     */
    public void setBotonJLabel1(BotonJLabel botonJLabel1) {
        this.botonJLabel1 = botonJLabel1;
    }
    /**
     * Devuelve el array animales
     * @return Array
     */
    public Animal[] getAnimales() {
        return animales;
    }
    /**
     * Define el array animales
     * @param animales  Define array
     */
    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }
    /**
     * Devuelve el array plantas
     * @return Devuleve array plantas
     */
    public Planta[] getPlantas() {
        return plantas;
    }
    /**
     * Define el array plantas
     * @param plantas Define array
     */
    public void setPlantas(Planta[] plantas) {
        this.plantas = plantas;
    }
    /**
     * Devuelve array alimentos
     * @return array atr
     */
    public String[] getAlimentos() {
        return alimentos;
    }
    /**
     * Define array alimentos
     * @param alimentos str array
     */
    public void setAlimentos(String[] alimentos) {
        this.alimentos = alimentos;
    }
    /**
     * Retorna el tiempo
     * @return int tiempo
     */
    public int getTiempo() {
        return tiempo;
    }
    /**
     * Define el tiempo
     * @param tiempo  int tiempo
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    


}
