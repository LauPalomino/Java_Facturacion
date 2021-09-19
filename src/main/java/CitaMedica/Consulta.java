/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CitaMedica;

import facturacion.Producto;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Consulta {
    //Atributos
    private int codigoConsulta;
    private String fechaHora;
    private Paciente paciente;
    private Medico medico;
    private ArrayList<Medicamentos> listaMedicamentos = new ArrayList<Medicamentos>();
    
    
    //Metodo constructor

    public Consulta(int codigoConsulta, String fechaHora, Paciente paciente, Medico medico) {
        this.codigoConsulta = codigoConsulta;
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
    }
    
    //Metodos
    public void agregarMedicamentos(Medicamentos medicamentosIn){
        this.listaMedicamentos.add(medicamentosIn);
    }
    
    public void imprimirConsulta(){
        System.out.println("Codigo de consulta: "+ this.codigoConsulta);
        System.out.println("Fecha y hora: " + this.fechaHora);
        System.out.println("Paciente: "+ this.paciente.getCcPaciente() + " " + this.paciente.getNombrePaciente());
        System.out.println("Medico: "+ this.medico.getCcMedico() + " " + this.medico.getNombreMedico());        
        System.out.println("----------------------------------------------");
        
        System.out.println("MEDICAMENTOS: ");
        
        int acumulador = 0;
        for(int i=0; i<this.listaMedicamentos.size();i++){
            System.out.print(this.listaMedicamentos.get(i).getCodigoMedicamento()+ " ");
            System.out.print(this.listaMedicamentos.get(i).getNombreMedicamento()+ " ");
            System.out.print(this.listaMedicamentos.get(i).getEspecialidadMedicamento()+ " \n");
        }
    }
}
