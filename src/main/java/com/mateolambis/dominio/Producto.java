package com.mateolambis.dominio;

public class Producto {
    private int codigoML;
    private String nombreML;
    private int cantidadML;
    private int precioML;
    private String tipoML;

    public Producto(int codigoML, String nombreML, int cantidadML, int precioML, String tipoML) {
        this.codigoML = codigoML;
        this.nombreML = nombreML;
        this.cantidadML = cantidadML;
        this.precioML = precioML;
        this.tipoML = tipoML;
    }

    public int getCodigoML() {
        return codigoML;
    }

    public String getNombreML() {
        return nombreML;
    }

    public int getCantidadML() {
        return cantidadML;
    }

    public int getPrecioML() {
        return precioML;
    }

    public String getTipoML() {
        return tipoML;
    }

    public void setCantidadML(int cantidadML) {
        this.cantidadML = cantidadML;
    }

    public void setPrecioML(int precioML) {
        this.precioML = precioML;
    }
}
