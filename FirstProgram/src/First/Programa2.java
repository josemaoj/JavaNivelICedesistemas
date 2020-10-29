package First;

import java.util.Scanner;

/**
 * Clase para segundo programa de java
 * variables globales
 * uso de la libreria Scanner.
 * Crear una clase que permita capturar la información
 * por pantalla del nombre completo de la persona y
 * la edad y luego mostrarla por pantalla
 * @author  jose.jaramillo
 * @since   10/26/2020
 * @version 1
 */
public class Programa2 {
    //Variables Globales
    //Scanner teclado; //Creando un objeto llamado teclado del tipo Scanner
    //Crear el objeto e instanciarlo de un tipo scanner
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //teclado.nextLine();
        System.out.println("Digite el nombre de la persona: ");
        String nombrePersona = teclado.nextLine();
        System.out.println("Digite la edad de la persona: ");
        int edad = teclado.nextInt();
        System.out.println("Bienvenido(a). "+nombrePersona);
        System.out.println("Usted tiene "+edad+" años.");
    }

}
