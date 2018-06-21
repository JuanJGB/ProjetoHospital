/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.juan.singleton;

import br.com.juan.objetos.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SPessoa {
    
    List<Pessoa> pessoas = new ArrayList<>();
    
    private SPessoa() {
        
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
    
    public static SPessoa getInstance() {
        return PessoaHolder.INSTANCE;
    }
    
    private static class PessoaHolder {

        private static final SPessoa INSTANCE = new SPessoa();
    }
}
