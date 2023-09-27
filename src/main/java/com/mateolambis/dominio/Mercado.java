package com.mateolambis.dominio;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
    public byte capacidadML;
    private String supermercadoML;
    private List<Producto> productosML;

    public Mercado(byte capacidadML) {
        this.capacidadML = capacidadML;
        this.productosML = new ArrayList<>();
    }

    public boolean agregarProducto(Producto p) {
        for (Producto productoExistente : productosML) {
            if (productoExistente.getCodigoML() == p.getCodigoML()) {
                return false; //El producto ya existe en el mercado.
            }
        }
        if (productosML.size() >= capacidadML) {
            return false; // El mercado está lleno.
        }
        productosML.add(p);
        return true; // Si no se encontraron problemas, agregar el producto al mercado.
    }


    public boolean retirarProducto(String nombreML) {
        // Buscar el producto por nombre y eliminarlo si se encuentra.
        for (int i = 0; i < productosML.size(); i++) {
            Producto producto = productosML.get(i);
            if (producto.getNombreML().equals(nombreML)) {
                productosML.remove(i);
                return true;
            }
        }
        return false;
    }

    /*public boolean retirarProducto(String nombreML){
        if (productosML.contains(nombreML)){
            productosML.remove(nombreML);
            return true;
        }else {
            return false;
        }
    }*/

    public Producto buscarProductoNombre(String nombreML){
        for (Producto p: productosML){
            if (p.getNombreML().equals(nombreML)){
                return p;
            }
        }
        return null;
    }

    public Producto buscarProductoCodigo(int codigoML){
        for (Producto p: productosML){
            if (p.getCodigoML() == codigoML){
                return p;
            }
        }
        return null;
    }

    public List<TipoProducto> buscarProductoTipo(String tipoML) {
        List<TipoProducto> productosPorTipo = new ArrayList<>();

        // Buscar productos por tipo
        for (Producto p: productosML) {
            if (p.getTipoML().equals(tipoML)) {
                return productosPorTipo;
            }
        }
        return null;
    }

    public int calcularTotal() {
        int totalML = 0;
        // Sumar el precio de todos los productos en el mercado.
        for (Producto producto : productosML) {
            totalML += producto.getPrecioML();
        }
        return totalML;
    }

    /*public double calcularTotal(double... productos){
        double resultado = productos[0];
        for (int i=1 ; i< productos.length; i++){
            resultado = resultado + productos[1];
        }
        return resultado;
    }*/

    public byte getCapacidad() {
        return capacidadML;
    }

    public String getSupermercado() {
        return supermercadoML;
    }

    public List<Producto> getProductosML() {
        return productosML;
    }
}
