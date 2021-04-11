/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.suelo;

import java.awt.Color;

/**
 *
 * @author davis
 */
public class Suelo {
    private TipoSuelo tipoSuelo;
    private SuperficieJLabel superficieJLabel;
 

    public  Suelo(TipoSuelo tipoSuelo, SuperficieJLabel superficieJLabel) {
        this.tipoSuelo = tipoSuelo;
        this.superficieJLabel = superficieJLabel;
        
    }

    public TipoSuelo getTipoSuelo() {
        return tipoSuelo;
    }

    public void setTipoSuelo(TipoSuelo tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }

    public SuperficieJLabel getSuperficieJLabel() {
        return superficieJLabel;
    }

    public void setSuperficieJlabel(SuperficieJLabel superficieJLabel) {
        this.superficieJLabel = superficieJLabel;
    }
    
     
    
    
    
}
