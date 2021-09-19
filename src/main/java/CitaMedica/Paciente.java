/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CitaMedica;

/**
 *
 * @author USUARIO
 */
public class Paciente {

    /**
     * @return the ccPaciente
     */
    public long getCcPaciente() {
        return ccPaciente;
    }

    /**
     * @return the nombrePaciente
     */
    public String getNombrePaciente() {
        return nombrePaciente;
    }
    //Atributos
    private long ccPaciente;
    private String nombrePaciente;
    
    //Metodo constructor

    public Paciente(long ccPaciente, String nombrePaciente) {
        this.ccPaciente = ccPaciente;
        this.nombrePaciente = nombrePaciente;
    }
    
}
