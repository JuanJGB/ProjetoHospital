/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.juan.singleton;

import br.com.juan.objetos.Enfermeira;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SEnfermeira {
    List<Enfermeira> enfermeiras = new ArrayList();

    public List<Enfermeira> getEnfermeiras() {
        return enfermeiras;
    }
    
    private SEnfermeira() {
    }
    
    public static SEnfermeira getInstance() {
        return SEnfermeiraHolder.INSTANCE;
    }
    
    private static class SEnfermeiraHolder {

        private static final SEnfermeira INSTANCE = new SEnfermeira();
    }
}
