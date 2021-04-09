
package com.proyecto.suelo;


public abstract class Suelo {
    private TipoSuelo tipoSuelo;
    private SuperficieJlabel superficieJlabel;

    public Suelo(TipoSuelo tipoSuelo, SuperficieJlabel superficieJlabel) {
        this.tipoSuelo = tipoSuelo;
        this.superficieJlabel = superficieJlabel;
    }

    public TipoSuelo getTipoSuelo() {
        return tipoSuelo;
    }

    public void setTipoSuelo(TipoSuelo tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }

    public SuperficieJlabel getSuperficieJlabel() {
        return superficieJlabel;
    }

    public void setSuperficieJlabel(SuperficieJlabel superficieJlabel) {
        this.superficieJlabel = superficieJlabel;
    }
    
    
}
