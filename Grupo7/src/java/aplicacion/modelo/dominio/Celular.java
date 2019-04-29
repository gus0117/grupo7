/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joel
 */
public class Celular {
    private List<Integer> integer;

    public Celular() {
        integer = new ArrayList<>();
   
    }

    public Celular(List<Integer> integer) {
        this.integer = integer;
    }

    public List<Integer> getInteger() {
        return integer;
    }

    public void setInteger(List<Integer> integer) {
        this.integer = integer;
    }
    
    
    
}
