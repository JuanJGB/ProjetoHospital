/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.juan.singleton;

import br.com.juan.objetos.Paciente;
import br.com.juan.objetos.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SPaciente {
    
    List<Paciente> pacientes = new ArrayList();
    List<Pessoa> responsavel = new ArrayList();

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public List<Pessoa> getResponsavel() {
        return responsavel;
    }
    
    
    
    
    private SPaciente() {
    }
    
    public static SPaciente getInstance() {
        return SPacienteHolder.INSTANCE;
    }
    
    private static class SPacienteHolder {

        private static final SPaciente INSTANCE = new SPaciente();
    }
}
