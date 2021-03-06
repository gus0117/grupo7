package aplicacion.controlador.beans;

import aplicacion.modelo.dominio.Celular;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Bean administrador que gestiona un objeto tipo Celular
 */
@ManagedBean
@SessionScoped
public class CelularBean {
    
    /**
     * Referencia a la clase Celular
     */
    private Celular celular;
    
    /**
     * Constructor por defecto
     */
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
    
    /**
     * Invoca al metodo mostrarPares de la clase Celular
     * para obtener una lista con los valor pares dentro del rango
     * @param cotaInf cota inferior del rango
     * @param cotaSup cota superior del rango
     * @return devuelve una lista con los numeros pares dentro del rango
     */
    public List<Integer> mostrarPares(int cotaInf, int cotaSup){
        return celular.mostrarPares(cotaInf, cotaSup);
    }
    
    /**
     * Calcula el coseno de un angulo en grados
     * @param num numero en grados
     * @return devulve el valor del coseno
     */
    public double calcularCoseno(float num){
        return celular.calcularCoseno(num);
    }
    
    /**
     * Invoca al metodo celular.validarCotas.
     * Valida si la cota inferior es menor a la cota superior
     * @param cotaInf cota inferior.
     * @param cotaSup cota superior.
     * @return si la cota inferior es menor devuelve true, sino devuelve false.
     */
    public boolean validarCotas(int cotaInf, int cotaSup){
        return celular.validarCotas(cotaInf, cotaSup);
    }
    
    //Metodos Accesores
    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }
    
}
