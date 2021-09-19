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
public class Cliente {

    /**
     * @return the ccCliente
     */
    public long getCcCliente() {
        return ccCliente;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }
    //ATRIBUTOS
    private long ccCliente;
    private String nombreCliente;

    public Cliente(long ccCliente, String nombreCliente) {
        this.ccCliente = ccCliente;
        this.nombreCliente = nombreCliente;
    }
    
    
}
