/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.CelularBean;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedProperty;
/**
 *
 * @author Joel
 */
@ManagedBean
@RequestScoped
public class CelularFormBean {

    /**
     * Referencia a la clase CelularBean
     */
    @ManagedProperty("#{celularBean}")
    private CelularBean celularBean;
    /**
     * Variable para contener el valor entero y positivo de un input
     */
    private int numero;
    
    public CelularFormBean() {
    }
    /**
     * Invoca al metodo obtenerTablaFormateada de CelularBean
     * @return devuelve una lista de string con formato A x B = C
     */
    public List<String> obtenerTablaFormateada(){
        return celularBean.obtenerTablaFormateada(numero);
    }
    
    //Metodos accesores
    public CelularBean getCelularBean() {
        return celularBean;
    }

    public void setCelularBean(CelularBean celularBean) {
        this.celularBean = celularBean;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
}
