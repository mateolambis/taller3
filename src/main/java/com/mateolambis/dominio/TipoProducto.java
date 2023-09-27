package com.mateolambis.dominio;

public class TipoProducto {
    public String carneML;
    public String verduraML;
    public String lacteoML;
    public String frutaML;
    public String panML;

    public TipoProducto(String carne, String verdura, String lacteo, String fruta, String pan) {
        this.carneML = carne;
        this.verduraML = verdura;
        this.lacteoML = lacteo;
        this.frutaML = fruta;
        this.panML = pan;
    }

    public String getCarneML() {
        return carneML;
    }

    public String getVerduraML() {
        return verduraML;
    }

    public String getLacteoML() {
        return lacteoML;
    }

    public String getFrutaML() {
        return frutaML;
    }

    public String getPanML() {
        return panML;
    }
}
