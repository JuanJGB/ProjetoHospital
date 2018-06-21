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
public class Enfermeira extends Pessoa {
    private int cofen;
    private String setor;

    public Enfermeira(int cofen, String setor, String nome, String telefone, String cpf, String rg, String endereco, String estadoCivil, Date dataNascimento, char sexo) {
        super(nome, telefone, cpf, rg, endereco, estadoCivil, dataNascimento, sexo);
        this.cofen = cofen;
        this.setor = setor;
    }

   

    public int getCofen() {
        return cofen;
    }

    public void setCofen(int cofen) {
        this.cofen = cofen;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "\nCofen: " + cofen + "\nSetor: " + setor+super.toString();
    }
    
    
}
