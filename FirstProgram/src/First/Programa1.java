package First;

/**
 * Clase para primer programa de java
 * @author  jose.jaramillo
 * @since   10/26/2020
 * @version 1
 *
 */
public class Programa1 {

    /**
     * Main class orquestador del programa
     * @param args
     */
    public static void main(String[] args) {
        //Definición de variables locales
        int a = 2, b = 3;
        int suma = 0, resta = 0, mult = 0;
        //Definir las operaciones
        suma = a + b;
        resta = a - b;
        mult = a * b;
        //Mostrar los resultados
        System.out.print("\"el valor de a es "+a);
        System.out.print(", el valor de b es "+b);
        System.out.println("");
        System.out.println("La suma de los valores es: "+suma);
        System.out.println("La resta de los valores es: "+resta);
        System.out.println("La multiplicacion de los valores es: "+mult);
    }

}
