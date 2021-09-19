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
public class Medico {

    /**
     * @return the ccMedico
     */
    public long getCcMedico() {
        return ccMedico;
    }

    /**
     * @return the nombreMedico
     */
    public String getNombreMedico() {
        return nombreMedico;
    }

    /**
     * @return the especialidadMedico
     */
    public String getEspecialidadMedico() {
        return especialidadMedico;
    }
    //Atributos
    private long ccMedico;
    private String nombreMedico;
    private String especialidadMedico;
    
    //Metodo constructor

    public Medico(long ccMedico, String nombreMedico, String especialidadMedico) {
        this.ccMedico = ccMedico;
        this.nombreMedico = nombreMedico;
        this.especialidadMedico = especialidadMedico;
    }
    
}
