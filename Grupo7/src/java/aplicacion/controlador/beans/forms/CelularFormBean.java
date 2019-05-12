package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.CelularBean;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

/**
 * ManagedBean que gestiona la página de los diferentes calculos del celular
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
    
    /**
     * Variable para contener el valor de la cota inferior de
     * un rango de numeros mayor o igual a 0 (cero).
     */
    private int cotaInferior;
    
    /**
     * Variable para contener el valor de la cota superior de
     * un rango de numeros mayor o igual a 0 (cero).
     */
    private int cataSuperior;
    
    /**
     * Constructor por defecto
     */
    public CelularFormBean() {
    }
    
    /**
     * Invoca al metodo obtenerTablaFormateada de CelularBean
     * @return devuelve una lista de string con formato A x B = C
     */
    public List<String> obtenerTablaFormateada(){
        return celularBean.obtenerTablaFormateada(numero);
    }
    
    /**
     * Invoca al metodo obtenerDivisores de CelularBean
     * @return devuelve una lista cargada con los divisores de un numero
     */
    public List<Integer> obtenerDivisores(){
        return celularBean.obtenerDivisores(numero);
    }
    
    /**
     * Invoca al metodo mostrarPares de CalularBean
     * @return devuelve una lista con los valores pares del rango
     */
    public List<Integer> mostrarPares(){
        return celularBean.mostrarPares(cotaInferior, cataSuperior);
    }
    
    /**
     * Metodo para mostrar mensajes
     */
    public void mostrarMensaje() {
        FacesContext context = FacesContext.getCurrentInstance();
         
        context.addMessage(null, new FacesMessage("Exito!",  "Se ha generado la tabla") );
    }
    
    public void validarCotas(){
        if(celularBean.validarCotas(cotaInferior, cataSuperior) != true){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                    "Error",
                    "La cota inferior debe ser menor a la cota superior"));
        }
        else{
            mostrarMensaje();
        }
    }
    // METODOS DE ACCESO
    
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

    /**
     * @return the cotaInferior
     */
    public int getCotaInferior() {
        return cotaInferior;
    }

    /**
     * @param cotaInferior the cotaInferior to set
     */
    public void setCotaInferior(int cotaInferior) {
        this.cotaInferior = cotaInferior;
    }

    /**
     * @return the cataSuperior
     */
    public int getCataSuperior() {
        return cataSuperior;
    }

    /**
     * @param cataSuperior the cataSuperior to set
     */
    public void setCataSuperior(int cataSuperior) {
        this.cataSuperior = cataSuperior;
    }
}
