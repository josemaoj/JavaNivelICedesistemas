package Clase6;

import java.util.Scanner;

public class MatrizDatos {
    private Scanner teclado;
    private String[][] datos;

    public void cargar() {
        teclado=new Scanner(System.in);
        //System.out.print("Cuantas fila tiene la matriz:");
        int filas= 2;
        System.out.print("Cuantas personas desea almacenar:");
        int columnas= teclado.nextInt();
        datos=new String[filas][columnas];
        for(int c=0;c<columnas;c++) {
                System.out.println("Ingrese Nombre de la persona:");
                datos[0][c]=teclado.next();
                System.out.println("Ingrese la edad de la persona:");
                datos[1][c]=String.valueOf(teclado.nextInt());
        }
    }

    public void imprimir() {
        for(int f=0;f<datos.length;f++) {
            for(int c=0;c<datos[f].length;c++) {
                System.out.print(datos[f][c]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrizDatos ma=new MatrizDatos();
        ma.cargar();
        ma.imprimir();

    }
}
