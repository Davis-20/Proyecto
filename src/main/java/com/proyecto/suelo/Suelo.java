
package com.proyecto.suelo;

/**
 * Esta clase recibe un tipo de suelo y un label
 */
public class Suelo {
    private TipoSuelo tipoSuelo;
    private SuperficieJLabel superficieJLabel;
 
    /**
     * Este constructor recibe un objeto tipo suelo, y un objeto label
     * @param tipoSuelo tiposuelo
     * @param superficieJLabel JLabel
     */
    public  Suelo(TipoSuelo tipoSuelo, SuperficieJLabel superficieJLabel) {
        this.tipoSuelo = tipoSuelo;
        this.superficieJLabel = superficieJLabel;
        
    }
    
    /**
     * Metodo que devuelve el tipo de suelo
     * @return tipoSuelo 
     */
    public TipoSuelo getTipoSuelo() {
        return tipoSuelo;
    }
    
    /**
     * Metodo que define el tipo de suelo
     * @param tipoSuelo tipoSuelo
     */
    public void setTipoSuelo(TipoSuelo tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }
    /**
     * Metodo que devuelve el label
     * @return JLabel
     */
    public SuperficieJLabel getSuperficieJLabel() {
        return superficieJLabel;
    }
    /**
     * Metodo que define el label
     * @param superficieJLabel superficieJLabel
     */
    public void setSuperficieJlabel(SuperficieJLabel superficieJLabel) {
        this.superficieJLabel = superficieJLabel;
    }
    
     
    
    
    
}
