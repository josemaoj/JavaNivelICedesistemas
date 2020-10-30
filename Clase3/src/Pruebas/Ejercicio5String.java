package Pruebas;

import java.util.Scanner;

public class Ejercicio5String {
    //Variables globales
    String nombre1;
    String email1;
    String nombre2;
    String email2;
    Scanner teclado = new Scanner(System.in);

    /**
     * Metodo para capturar los datos de las personas
     */
    public void capturarDatos(){
        System.out.println("Captura de los datos de las personas");
        //for (int i=1;i<=5;i++){
            teclado.nextLine();
            System.out.println("Digitar el nombre completo de la persona 1");
            nombre1 = teclado.nextLine();
            System.out.println("Digitar el email de la persona 1");
            email1 = teclado.nextLine();
            teclado.nextLine();
            System.out.println("Digitar el nombre completo de la persona 2");
            nombre2 = teclado.nextLine();
            System.out.println("Digitar el email de la persona 2");
            email2 = teclado.nextLine();

        //}
    }

    /**
     * Metodo para imprimir los datos almacenados
     */
    public void listar(){
        System.out.println("El nombre de la persona 1 es: "+nombre1);
        System.out.println("El email de la persona 1 es :"+email1);
        System.out.println("El nombre de la persona 2 es: "+nombre2);
        System.out.println("El email de la persona 2 es :"+email2);
    }

    /**
     * Metodo para consultar el email de una persona por su nombre
     */
    public void consultarDatos(){
        System.out.println("Digite el nombre de la persona a consultar");
        String pNombre = teclado.nextLine();
        if (nombre1.equalsIgnoreCase(pNombre))
            System.out.println("El email de la persona es: "+email1);
        if (nombre2.equalsIgnoreCase(pNombre))
            System.out.println("El email de la persona es: "+email2);
    }

    public void sinArroba(){
        int posi=email1.indexOf('@');
        if (posi==-1)
            System.out.println(email1+" no contiene @");
        int posi2=email2.indexOf('@');
        if (posi2==-1)
            System.out.println(email2+" no contiene @");

    }

    public static void main(String[] args) {
        Ejercicio5String e5 = new Ejercicio5String();
        e5.capturarDatos();
        e5.listar();
        e5.consultarDatos();
        e5.sinArroba();
    }

}
