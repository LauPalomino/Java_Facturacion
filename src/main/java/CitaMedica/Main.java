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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Paciente paciente = new Paciente(10694983, "Laura Palomino");
        Medico medico = new Medico(10695073, "Liam Quevedo", "Médico cirujano");
        Consulta consulta1 = new Consulta(15986, "19/07/2021 8:36pm", paciente, medico);
        
        Medicamentos acetaminofen= new Medicamentos(126, "Acetaminofen", "Analgesico");
        Medicamentos loratadina = new Medicamentos(58, "Loratadina", "Antihistaminico");
        
        consulta1.agregarMedicamentos(acetaminofen);
        consulta1.agregarMedicamentos(loratadina);
        
        consulta1.imprimirConsulta();
    }
    
}
