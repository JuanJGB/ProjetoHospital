/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.juan.singleton;

import br.com.juan.objetos.Atestado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SAtestado {
    List<Atestado> atestados = new ArrayList();

    public List<Atestado> getAtestados() {
        return atestados;
    }
    
    
    private SAtestado() {
    }
    
    public static SAtestado getInstance() {
        return SAtestadoHolder.INSTANCE;
    }
    
    private static class SAtestadoHolder {

        private static final SAtestado INSTANCE = new SAtestado();
    }
}
