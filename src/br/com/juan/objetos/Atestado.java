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
public class Atestado {
    private Date dataInicio;
    private Date dataFimAtestado;
    private Consulta consulta;
    private int QuantidadeDias;

    public Atestado(Date dataInicio, Date dataFimAtestado, Consulta consulta, int QuantidadeDias) {
        this.dataInicio = dataInicio;
        this.dataFimAtestado = dataFimAtestado;
        this.consulta = consulta;
        this.QuantidadeDias = QuantidadeDias;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFimAtestado() {
        return dataFimAtestado;
    }

    public void setDataFimAtestado(Date dataFimAtestado) {
        this.dataFimAtestado = dataFimAtestado;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public int getQuantidadeDias() {
        return QuantidadeDias;
    }

    public void setQuantidadeDias(int QuantidadeDias) {
        this.QuantidadeDias = QuantidadeDias;
    }

    @Override
    public String toString() {
        
        
        
        
        return "Atestado{" + "\n  Data início: " + dataInicio + "\ndata fim: " + dataFimAtestado + "\nconsulta: " + consulta + "\nQuantidade de dias:" + QuantidadeDias;
    }
    
    
    
}
