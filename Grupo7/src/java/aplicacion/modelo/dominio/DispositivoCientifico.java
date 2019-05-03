
package aplicacion.modelo.dominio;
/**
 * Clase que contiene metodos para operaciones matematicas
 * Metodos Disponibles:
 * -calcularSuma
 * -calcularResta
 * -calcularMultiplicacion
 * -calcularDivision
 * -calcularFactorial
 * -obtenerMayorOMenor
 * -calcularResto
 * -verificarParidad
 * -calcularPotencia
 * -calcularCoseno
 */
public class DispositivoCientifico {
    private String marca;
    private String modelo;
    private String sistemaOperativo;
    private String version;
    
    /**
     * Devuelve la suma entre dos numeros enteros
     * @param a primer termino de la suma
     * @param b segundo termino de la suma
     * @return retorna un numero entero
     */
    public int calcularSuma(int a, int b){
        return a + b;
    }
    /**
     * Devuelve la resta entre dos numeros enteros
     * @param a primer termino de la resta
     * @param b segundo termino de la resta
     * @return  retorna un numero entero
     */
    public int calcularResta(int a, int b){
        return a - b;
    }
    /**
     * Calcular la multiplicacion entre dos numeros enteros
     * @param a primer factor
     * @param b segundo factor
     * @return devuelve un numero entero
     */
    public int calcularMultiplicacion(int a, int b){
        return a * b;
    }
    /**
     * Calcula la division entre dos numeros enteros.
     * Devuelve una excepcion si el divisor es cero
     * @param a dividendo
     * @param b divisor != 0
     * @return retorna un entero
     */
    public int calcularDivision(int a, int b){
        if(b == 0){
            throw new ArithmeticException("No se puede dividir por cero");
        }
        else{
            return a / b;
        }
    }
    /**
     * Calcula el factorial de un numero entero positivo haciendo uso de la estructura iterativa "for".
     * Se lanzara una excepcion si el parametro es negativo
     * @param a valor entero > 0
     * @return devuelve un resultado del factorial
     */
    public long calcularFactorial(int a){
        if(a < 0){
            throw new ArithmeticException("Solo se aceptan parametros positivos o cero");
        }
        else{
            int fac = 1;
            for(int i = 1; i <= a; i++){
                fac = fac * i;
            }
            return fac;
        }
    }
    /**
     * Compara dos numeros enteros y segun el boolean devolvera el mayor o menor
     * @param a primer numero
     * @param b segundo numero
     * @param esMayor true: obtener mayor. false: obtener menor
     * @return retorna uno de los dos parametros
     */
    public int obtenerMayorOMenor(int a, int b, boolean esMayor){
        if(esMayor){
            if(a > b){
                return a;
            }
            else
            {
                return b;
            }
        }
        else{
            if(a < b){
                return a;
            }
            else{
                return b;
            }
        }
    }
    /**
     * Calcula el resto de una division entre dos numeros enteros.
     * Devuelve una excepcion si el segundo parametro es igual a 0
     * Esta operacion es equivalente a realizar a % b
     * @param a dividendo
     * @param b divisor != 0
     * @return retorna el resto de la division entre a y b
     */
    public int calcularResto(int a, int b){
        if(b == 0){
            throw new ArithmeticException("No se puede dividir por cero");
        }
        else{
            return a%b;
        }
    }
    /**
     * Verifica la paridad de un numero comparando el resto de la division entre el numero y el valor 2.
     * Si el resto es igual a cero el valor a es par, de lo contrario es impar.
     * Se muestra un mensaje por pantalla si es par o impar.
     * @param a valor entero a verificar
     */
    public void verificarParidad(int a){
        if (0 == calcularResto(a,2)){
            System.out.println("Es Par");
        }
        else{
            System.out.println("No es Par");
        }
    }
    /**
     * Calcula la potencia realizando multiplicaciones susecivas.
     * Se multiplica el valor de la "base" por si mismo "expo" veces
     * @param base puede ser un valor real
     * @param expo debe ser un valor entero
     * @return 
     */
    public double calcularPotencia(double base, int expo){
        double pro = 1;
        for(int i = 1; i<=expo; i++){
            pro = pro * base;
        }
        return pro;
    }
    /**
     * Calcula el coseno de un numero haciendo uso de la formula de Maclaurin
     * @param x valor del argumento
     * @param n cantidad de iteraciones de la sumatoria
     * @return un numero real tipo double
     */
    public double calcularCoseno(float x, int n){
        double sum = 1;
        long fact = 1;
        double pot = 1;
        double auxX = x * Math.PI / 180;
        int sig = 1;
        for(int i = 1; i <= n; i++){
            fact = calcularFactorial(2 * i);
            pot = calcularPotencia(auxX, 2 * i);
            sig = (int)calcularPotencia(-1, i);
            sum = sum + sig * pot / fact;
        }
        return sum;
    }
}
