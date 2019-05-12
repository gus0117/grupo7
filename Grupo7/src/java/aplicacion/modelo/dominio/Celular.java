package aplicacion.modelo.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que implementa la clase DispositivoCientifico
 */
public class Celular {
    /**
     * Objeto de la clase que contiene varias operaciones matematicas
     */
    private DispositivoCientifico dc;

    /**
     * Constructor por defecto que inicializa el dispositivoCientifico
     */
    public Celular() {
        dc = new DispositivoCientifico();
    }
    
    /**
     * Metodo que genera una tabla del 1 a 100 por un valor entero positivo.
     * @param valor numero entero positivo para generar la tabla
     * @return devuelve una lista que representa una tabla de multiplicar
     * con el formato A x B = C
     */
    public List<String> obtenerTablaFormateada(int valor){
        List<String> tablaFormateada = new ArrayList<String>();
        for(int i = 1; i <= 100; i++){
            tablaFormateada.add(valor + " x " + i + " = " + (dc.calcularMultiplicacion(valor, i)));
        }
        return tablaFormateada;
    }  
    
    /**
     * Genera un lista de los divisores de un numero
     * @param valor numero del cual obtener los divisores
     * @return devuelve una lista cargada de los divisores
     */
    public List<Integer> obtenerDivisores(int valor){
        List<Integer> divisores = new ArrayList<Integer>();
        for(int i = 1; i <= valor; i++){
            if(dc.calcularResto(valor, i) == 0){
                divisores.add(i);
            }
        }
        return divisores;
    }
    
    /**
     * Genera una lista de los numeros pares dentro de un rango
     * @param cotaInf cota inferior del rango
     * @param cotaSup sota superior del rango
     * @return devuelve una lista con los números enteros dentro del rango
     */
    public List<Integer> mostrarPares(int cotaInf, int cotaSup) {
        List<Integer> pares = new ArrayList<Integer>();
        for (int i = cotaInf; i <= cotaSup; i++) {
            if (dc.calcularResto(i, 2) == 0) {
                pares.add(i);
            }
        }
        System.out.println(pares.toString());
        return pares;
    }
    
    /**
     * Compara la cota inferior con la cota superior.
     * @param cotaInf cota inferior.
     * @param cotaSup cota superior.
     * @return devuelve true si la cota inferior es menor a
     * la cota superior, y devuelve false si la cota superior es menor o igual.
     */
    public boolean validarCotas(int cotaInf, int cotaSup){
        return cotaInf < cotaSup;
    }
    //Metodos Accesores
    
    public DispositivoCientifico getDc() {
        return dc;
    }

    public void setDc(DispositivoCientifico dc) {
        this.dc = dc;
    }
    
}
