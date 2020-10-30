package Pruebas;

import java.util.Scanner;

public class PruebaCases {

    public void menuPrincipal(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Menu para carga de ejercicios");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Salir");
        System.out.println("Digite la opción del menú que desea:");
        int opc = teclado.nextInt();
        switch(opc)
        {
            case 1 :
                System.out.println("Entre al ejercicio 1");
                menuPrincipal();
            case 2 :
                System.out.println("Entre al ejercicio 2");
                menuPrincipal();
            case 3 :
                System.out.println("Entre al ejercicio 3");
                menuPrincipal();
            case 4 :
                System.out.println("Saliendo del Menú");
                System.exit(0);
            default :
                System.out.println("Entre a una opción no valida");
                menuPrincipal();
        }

    }

    public static void main(String[] args) {
        PruebaCases p = new PruebaCases();
        p.menuPrincipal();
    }

}
