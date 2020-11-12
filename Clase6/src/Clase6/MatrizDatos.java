package Clase6;

import java.util.Scanner;

public class MatrizDatos {
    static private Scanner teclado;
    private String[][] datos;
    int filas , columnas;
    public void cargar() {
        teclado=new Scanner(System.in);
        //System.out.print("Cuantas fila tiene la matriz:");
        filas= 2;
        System.out.print("Cuantas personas desea almacenar:");
        columnas= teclado.nextInt();
        datos=new String[filas][columnas];
        for (int f=0;f<filas;f++){
            for(int c=0;c<columnas;c++) {
                if (f==0)
                    System.out.println("Ingrese el nombre de la persona: ");
                else
                    System.out.println("Ingrese la edad de la persona:");
                    //System.out.println("Ingrese Nombre de la persona:");
                    //datos[0][c]=teclado.next();
                datos[f][c]=teclado.next();
                    //System.out.println("Ingrese la edad de la persona:");
                    //datos[1][c]=String.valueOf(teclado.nextInt());
            }
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
    public boolean buscarPersona(String nombreB){
        boolean encontrado = false;
        for(int c=0;c<columnas;c++) {
            if(datos[0][c].equals(nombreB))
                encontrado=true;
        }
        return encontrado;
    }

    public static void main(String[] args) {
        MatrizDatos ma=new MatrizDatos();
        ma.cargar();
        ma.imprimir();
        teclado.nextLine();
        System.out.println("Digite el nombre de la persona a buscar:");
        String nombrePersona = teclado.nextLine();
        boolean buscar = ma.buscarPersona(nombrePersona);
        if (buscar)
            System.out.println("El nombre "+nombrePersona+" se encuentra en la matriz");
        else
            System.out.println("El nombre no se encuentra en la matriz");

    }
}
