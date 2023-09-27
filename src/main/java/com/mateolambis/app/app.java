package com.mateolambis.app;

import com.mateolambis.dominio.Mercado;
import com.mateolambis.dominio.Producto;
import com.mateolambis.dominio.TipoProducto;
public class app {
    public static void main(String[] args) {
        Mercado wilymat = new Mercado((byte) 100);

        Producto producto1 = new Producto(1, "Mango", 7, 7000, "fruta");
        Producto producto2 = new Producto(2, "Leche Condensada", 4, 2500, "lacteo");
        Producto producto3 = new Producto(2, "Leche Condensada", 6, 2000, "lacteo");
        Producto producto4 = new Producto(3, "papa", 10, 5000, "verdura");

        boolean resultado1 = wilymat.agregarProducto(producto1);
            System.out.println("Producto 1 agregado : " + resultado1);
        boolean resultado2 = wilymat.agregarProducto(producto2);
            System.out.println("Producto 2 agregado : " + resultado2);
        boolean resultado3 = wilymat.agregarProducto(producto3);
            System.out.println("Producto 2 agregado : " + resultado3);
        boolean resultado4 = wilymat.agregarProducto(producto4);
        System.out.println("Producto 3 agregado : " + resultado4);
        System.out.println("------------------------------------------");

        Producto encontradoM1 = wilymat.buscarProductoNombre("Mango");
            System.out.println("Se encontro por su nombre un producto: " + (encontradoM1 != null ? encontradoM1.getNombreML(): "No encontrado"));
        Producto encontradoM2 = wilymat.buscarProductoNombre("Leche Condensada");
            System.out.println("Se encontro por su nombre un producto: " + (encontradoM2 != null ? encontradoM2.getNombreML(): "No encontrado"));
        Producto encontradoM3 = wilymat.buscarProductoNombre("Jabon de manos");
        System.out.println("Se encontro por su nombre un producto: " + (encontradoM3 != null ? encontradoM3.getNombreML(): "No encontrado"));
        Producto encontradoM4 = wilymat.buscarProductoNombre("papa");
        System.out.println("Se encontro por su nombre un producto: " + (encontradoM4 != null ? encontradoM4.getNombreML(): "No encontrado"));
        System.out.println("------------------------------------------");

        Producto encontradoC1 = wilymat.buscarProductoCodigo(1);
        System.out.println("Se encontro por su codigo un producto: " + (encontradoC1 != null ? encontradoC1.getNombreML(): "No encontrado"));
        Producto encontradoC2 = wilymat.buscarProductoCodigo(2);
        System.out.println("Se encontro por su codigo un producto: " + (encontradoC2 != null ? encontradoC2.getNombreML(): "No encontrado"));
        Producto encontradoC3 = wilymat.buscarProductoCodigo(2);
        System.out.println("Se encontro por su codigo un producto: " + (encontradoC3 != null ? encontradoC3.getNombreML(): "No encontrado"));
        Producto encontradoC4 = wilymat.buscarProductoCodigo(3);
        System.out.println("Se encontro por su codigo un producto: " + (encontradoC4 != null ? encontradoC4.getNombreML(): "No encontrado"));
        System.out.println("------------------------------------------");


        double totalML = wilymat.calcularTotal();
            System.out.println("Total del inventario: " + totalML);
        System.out.println("------------------------------------------");

        boolean eliminarP = wilymat.retirarProducto("Leche Condensada");
            System.out.println("El producto se a eliminado: " + eliminarP);
    }
}
