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
    
    /**
     * Obtiene la tabla de multiplicar de un numero formateada a string
     * @param numero valor del cual obtener la tabla
     * @return lista de string que representa la tabla de multiplicar
     */
    public List<String> obtenerTablaFormateada(int numero){
        return celular.obtenerTablaFormateada(numero);
    }
    
    /**
     * Invoca al metodo obtenerDivisores de la clase Celular
     * para obtener una lista de divisores
     * @param numero numero entero del cual se obtienen los divisores
     * @return devuelve una lista de divisores enteros
     */
    public List<Integer> obtenerDivisores(int numero){
        return celular.obtenerDivisores(numero);
    }
    //Metodos Accesores
    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }
    
}
