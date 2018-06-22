/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.juan.singleton;

import br.com.juan.objetos.Triagem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class STriagem {
    List<Triagem> triagens = new ArrayList();

    public List<Triagem> getTriagens() {
        return triagens;
    }
    
    private STriagem() {
    }

    @Override
    public String toString() {
        
        
        return "Alergias" + '}';
        
        
        
    }
    
    public static STriagem getInstance() {
        return STriagemHolder.INSTANCE;
    }
    
    private static class STriagemHolder {

        private static final STriagem INSTANCE = new STriagem();
    }
}
