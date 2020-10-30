package Pruebas;

import java.util.Scanner;

/**
 * Clase para probar metodos con parametros
 * @author  jose.jaramillo
 * @since   10/28/2020
 * @version 1
 */
public class MetodoParametros {
    /**
     * Metodo para cargar un valor y
     * generarle la tabla de multiplicar
     */
    public void cargarValor() {
        Scanner teclado=new Scanner(System.in);
        int valor;
        do {
            System.out.println("Ingrese valor:");
            valor=teclado.nextInt();
            if(valor==0){
                System.out.println("El valor no puede ser 0");
                System.out.println("Por favor digite de nuevo el valor. ");
                //Aplicamos recursividad
                cargarValor();
            }
            if (valor!=-1) {
                calcular(valor);
            }

            System.out.println(" ");
        } while (valor!=-1);
    }

    /**
     * Metodo para calcular la tabla de
     * multiplicar de un valor
     * @param v
     */
    public void calcular(int v) {
        for(int f=v;f<=v*10;f=f+v) {
            System.out.print(f+"-");
        }
        //f=0
        //f<=0*10
        //f=f+0
    }


}
