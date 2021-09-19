/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Factura {
    //ATRIBUTOS
    private int codigoFactura;
    private String fechaHora;
    private Cliente cliente;
    private ArrayList<Producto> listaProductos = new ArrayList<Producto>();

    public Factura(int codigoFactura, String fechaHora, Cliente cliente) {
        this.codigoFactura = codigoFactura;
        this.fechaHora = fechaHora;
        this.cliente = cliente;
    }
    
    public void agregarProducto(Producto productoIn){
        this.listaProductos.add(productoIn);
    }
    
    public void imprimirFactura(){
        System.out.println("Codigo de factura: "+ this.codigoFactura);
        System.out.println("Fecha y hora: " + this.fechaHora);
        System.out.println("Cliente: "+ this.cliente.getCcCliente() + " " + this.cliente.getNombreCliente());
        System.out.println("----------------------------------------------");
        
        System.out.println("PRODUCTOS: ");
        
        int acumulador = 0;
        for(int i=0; i<this.listaProductos.size();i++){
            System.out.print(this.listaProductos.get(i).getCodigoProducto()+ " ");
            System.out.print(this.listaProductos.get(i).getNombreProducto()+ " ");
            System.out.print(this.listaProductos.get(i).getValorProducto()+ " \n");
            acumulador += this.listaProductos.get(i).getValorProducto();
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Valor total: "+ acumulador);
    }
}
