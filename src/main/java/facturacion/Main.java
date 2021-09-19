/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

/**
 *
 * @author USUARIO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente = new Cliente(1069498355, "Laura Palomino");
        Factura venta1 = new Factura(132965, "12/07/2021 8:36pm", cliente);
        
        Producto leche = new Producto(1, "Leche", 3000);
        Producto pan = new Producto(2, "Pan", 2000);
        Producto huevo = new Producto(3, "Huevos", 3000);
        
        venta1.agregarProducto(leche);
        venta1.agregarProducto(pan);
        venta1.agregarProducto(huevo);
        
        venta1.imprimirFactura();
    }
    
}
