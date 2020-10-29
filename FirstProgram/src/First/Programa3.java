package First;

import java.util.Scanner;

/**
 * Clase para segundo programa de java
 * variables globales
 * uso de la libreria Scanner. Y usando un metodo
 * llamado capturaDatos
 * Crear una clase que permita capturar la información
 * por pantalla del nombre completo de la persona y
 * la edad y luego mostrarla por pantalla
 * @author  jose.jaramillo
 * @since   10/26/2020
 * @version 2
 */
public class Programa3 {
    //Variables Globales
    //Scanner teclado; //Creando un objeto llamado teclado del tipo Scanner
    //Crear el objeto e instanciarlo de un tipo scanner
    Scanner teclado = new Scanner(System.in);
    String sNombrePersona;
    int iEdad;

    /**
     * Metodo para capturar los datos de una persona
     */
    public void capturaDatos(){
        System.out.println("Digite el nombre de la persona: ");
        sNombrePersona= teclado.nextLine();
        System.out.println("Digite la edad de la persona: ");
        iEdad = teclado.nextInt();
    }

    /**
     * Metodo para imprimir los datos de la persona
     */
    public void imprimirDatos(){
        System.out.println("Bienvenido(a). "+sNombrePersona);
        System.out.println("Usted tiene "+iEdad+" años.");
    }

    /**
     * Main class. Orquestador de la clase.
     * @param args
     */
    public static void main(String[] args) {
        Programa3 p3 = new Programa3(); //Crea e instancia un objeto del tipo Programa 3
        p3.capturaDatos(); //Usa el objeto creado para llamar los metodos disponibles. El metodo capturarDatos
        p3.imprimirDatos();
    }

}
