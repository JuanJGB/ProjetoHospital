/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.juan.objetos;

import java.util.Date;

/**
 *
 * @author SATC
 */
public class Paciente extends Pessoa {
    private int id;
    private Pessoa responsavel;
    private int numeroSus;

    public Paciente(int id, Pessoa responsavel, int numeroSus, String nome, String telefone, String cpf, String rg, String endereco, String estadoCivil, Date dataNascimento, char sexo) {
        super(nome, telefone, cpf, rg, endereco, estadoCivil, dataNascimento, sexo);
        this.id = id;
        this.responsavel = responsavel;
        this.numeroSus = numeroSus;
    }

   
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Paciente: " + "\nid:" + id + "\nnumeroSus:" + numeroSus + super.toString();
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }

    public int getNumeroSus() {
        return numeroSus;
    }

    public void setNumeroSus(int numeroSus) {
        this.numeroSus = numeroSus;
    }
    
    
}
        