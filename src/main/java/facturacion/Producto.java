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
public class Producto {

    /**
     * @return the codigoProducto
     */
    public long getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @return the valorProducto
     */
    public int getValorProducto() {
        return valorProducto;
    }
    //ATRIBUTOS
    private long codigoProducto;
    private String nombreProducto;
    private int valorProducto;

    public Producto(long codigoProducto, String nombreProducto, int valorProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.valorProducto = valorProducto;
    }
    

}
