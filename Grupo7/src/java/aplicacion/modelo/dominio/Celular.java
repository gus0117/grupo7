/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joel
 */
public class Celular {
    /**
     * Referencia a la clase que contiene varias operaciones matematicas
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
    //Metodos Accesores
    
    public DispositivoCientifico getDc() {
        return dc;
    }

    public void setDc(DispositivoCientifico dc) {
        this.dc = dc;
    }
    
}
