/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import aplicacion.modelo.dominio.Celular;
/**
 *
 * @author Joel
 */
@ManagedBean
@RequestScoped
public class CelularFormBean {
    private Celular celular;
    /**
     * Creates a new instance of CelularFormBean
     */
    public CelularFormBean() {
        celular = new Celular();
    }
    
    public List<Integer> MostrarResultado(){
      return celular.getInteger();
    }
    
}
