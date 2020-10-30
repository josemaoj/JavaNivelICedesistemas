package Pruebas;

import java.util.Scanner;

/**
 * Clase para las pruebas de la clase String
 * @author  jose.jaramillo
 * @since   10/28/2020
 * @version 1
 */
public class Cadena {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cad1;
        String cad2;

        System.out.println("Digite la primer cadena: ");
        cad1 = teclado.nextLine();
        System.out.println("Digite la segunda cadena: ");
        cad2 = teclado.nextLine();
        /*
        //Validar si las cadenas son iguales
        if (cad1.equals(cad2)==true)
            System.out.println(cad1+" es exactamente igual a "+cad2);
        else
            System.out.println("Las cadenas son diferentes");

        //Validar si las cadenas son iguales sin importar las mayusculas
        if (cad1.equalsIgnoreCase(cad2)==true)
            System.out.println("Las cadenas son iguales");
        else
            System.out.println("Las cadenas son diferentes");

        //Validar con compareto
        if (cad1.compareTo(cad2)==0)
            System.out.println("Las cadenas son iguales");
        else
            System.out.println("Las cadenas son diferentes");

        char carac1=cad1.charAt(0);
        System.out.println("El primer caracter de "+cad1+" es "+carac1);

        int largo=cad1.length();
        System.out.println("El largo del String "+cad1+" es "+largo);

        String cad3=cad1.substring(0,3);
        System.out.println("Los primeros tres caracteres de "+cad1+" son "+cad3);
*/
        int posi=cad1.indexOf(cad2);
        if (posi==-1) {
            System.out.println(cad2+" no está contenido en "+cad1);
        } else {
            System.out.println(cad2+" está contenido en "+cad1+" a partir de la posición "+posi);
        }

        /*
        System.out.println(cad1+ " convertido a mayúsculas es "+cad1.toUpperCase());
        System.out.println(cad2+ " convertido a minúsculas es "+cad2.toLowerCase());
*/
    }

}
