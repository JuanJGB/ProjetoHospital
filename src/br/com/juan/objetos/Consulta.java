/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.juan.objetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class Consulta {
    private Triagem triagem;
    private Medico medico;
    private Atestado a;
    private List<String> medicamentos;
    private String diagnostico;
    private boolean atestado;
    private int codigoAtestado;

    public Consulta(Triagem triagem, Medico medico, List<String> medicamentos, String diagnostico, boolean atestado, int codigoAtestado) {
        this.triagem = triagem;
        this.medico = medico;
        this.medicamentos = new ArrayList<>();
        this.diagnostico = diagnostico;
        this.atestado = atestado;
        this.codigoAtestado = codigoAtestado;
    }
    public Atestado criarAtestado(){
        
   
        return a;
        
    }

    public int getCodigoAtestado() {
        return codigoAtestado;
    }

    public void setCodigoAtestado(int codigoAtestado) {
        this.codigoAtestado = codigoAtestado;
    }

    public Triagem getTriagem() {
        return triagem;
    }

    public void setTriagem(Triagem triagem) {
        this.triagem = triagem;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public List<String> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<String> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public boolean isAtestado() {
        return atestado;
    }

    public void setAtestado(boolean atestado) {
        this.atestado = atestado;
    }

    @Override
    public String toString() {
        return "Consulta{" + "\nTriagem: " + triagem+ "\nmedico: " + medico.getNome() + "\nmedicamentos: " + medicamentos + "\ndiagnostico: " + diagnostico + ", atestado:  " + atestado + ", codigoAtestado: " + codigoAtestado + '}';
    }
    
    
}
