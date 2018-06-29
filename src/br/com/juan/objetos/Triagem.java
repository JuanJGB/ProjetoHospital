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
public class Triagem {

    private Enfermeira enfermeira;
    private Paciente paciente;
    private String pressao, sintoma;
    private float peso, altura, IMC, temperatura;
    private boolean febre;
    private List<String> alergias;

    public Triagem(Enfermeira enfermeira, Paciente paciente, String pressao, String sintoma, float peso, float altura, float IMC, float temperatura, boolean febre) {
        this.enfermeira = enfermeira;
        this.paciente = paciente;
        this.pressao = pressao;
        this.sintoma = sintoma;
        this.peso = peso;
        this.altura = altura;
        this.IMC = CalculoIMC(altura, peso);
        this.temperatura = temperatura;
        this.febre = febre;
        this.alergias = new ArrayList<>();
    }
  

    public List<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<String> alergias) {
        this.alergias = alergias;
    }

    public static Float CalculoIMC(float altura, float peso) {
        Float IMC = peso / (altura * altura);

        return IMC;
    }

    public static Boolean diagnosticarFebre(float temperatura) {
        Boolean febre = temperatura >= 37;
        return febre;
    }

    @Override
    public String toString() {
        
        String todasAlergias = "";
        for (String alergia : alergias) {
            todasAlergias += alergias.indexOf(alergia) + " . " + alergia + "\n";
        }   
        return "Triagem: " + "\nEnfermeira: " + enfermeira + "\nPaciente:" + paciente + "\nPressao:" + pressao + "\nSintoma=" + sintoma + "\nPeso=" + peso + "\nAltura=" + altura + "\nIMC=" + IMC + "\nTemperatura=" + temperatura + "\nFebre=" + febre+"\nAlergias: "+todasAlergias;
    }

    public Enfermeira getEnfermeira() {
        return enfermeira;
    }

    public void setEnfermeira(Enfermeira enfermeira) {
        this.enfermeira = enfermeira;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getPressao() {
        return pressao;
    }

    public void setPressao(String pressao) {
        this.pressao = pressao;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getIMC() {
        return IMC;
    }

    public void setIMC(float IMC) {
        this.IMC = IMC;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isFebre() {
        return febre;
    }

    public void setFebre(boolean febre) {
        this.febre = febre;
    }

}
