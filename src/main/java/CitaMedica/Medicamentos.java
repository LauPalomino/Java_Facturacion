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
public class Medicamentos {

    /**
     * @return the codigoMedicamento
     */
    public long getCodigoMedicamento() {
        return codigoMedicamento;
    }

    /**
     * @return the nombreMedicamento
     */
    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    /**
     * @return the especialidadMedicamento
     */
    public String getEspecialidadMedicamento() {
        return especialidadMedicamento;
    }
    //Atributos
    private long codigoMedicamento;
    private String nombreMedicamento;
    private String especialidadMedicamento;
    
    //Metodo constructor

    public Medicamentos(long codigoMedicamento, String nombreMedicamento, String especialidadMedicamento) {
        this.codigoMedicamento = codigoMedicamento;
        this.nombreMedicamento = nombreMedicamento;
        this.especialidadMedicamento = especialidadMedicamento;
    }
    
}
