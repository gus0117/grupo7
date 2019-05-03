/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.modelo.dominio.Celular;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CelularBean {
    
    private Celular celular;
    
    public CelularBean() {
        celular = new Celular();
    }
    public List<String> obtenerTablaFormateada(int numero){
        return celular.obtenerTablaFormateada(numero);
    }
    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }
    
    
}
