/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.juan.singleton;

import br.com.juan.objetos.Consulta;
import br.com.juan.objetos.Medico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SConsulta {
    List<Consulta> consultas =new ArrayList();
    List<String> medicamentos = new ArrayList();

    public List<String> getMedicamentos() {
        return medicamentos;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }
    
    private SConsulta() {
    }
    
    public static SConsulta getInstance() {
        return SConsultaHolder.INSTANCE;
    }
    
    private static class SConsultaHolder {

        private static final SConsulta INSTANCE = new SConsulta();
    }
}
