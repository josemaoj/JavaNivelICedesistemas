package Clase6;
import java.util.Scanner;
/**
 * Clase para el manejo de vectores
 * @author  jose.jaramillo
 * @since   11/10/2020
 * @version 1
 */
public class Vector {
    //Defición de las variables
    String datos[]; //vector
    int edades[]; //vector
    static Scanner teclado = new Scanner(System.in);
    int cant;

    /**
     * Constructor de la clase
     */
    public Vector() {
        System.out.println("Digite la cantidad de personas a almacenar:");
        cant=teclado.nextInt();
        datos=new String[cant];
        edades=new int[cant];
    }

    /**
     * Metodo para cargar información en el vector
     */
    public void cargar()
    {
        for(int f=0;f<datos.length;f++) {
            System.out.println("Ingrese datos persona:");
            //teclado.nextLine();
            System.out.println("Digite el Primer Nombre:");
            String nombreCompleto = teclado.next();
            System.out.println("Digite el Segundo Nombre:");
            nombreCompleto = nombreCompleto+" "+teclado.next();
            System.out.println("Digite el Primer Apellido:");
            nombreCompleto = nombreCompleto+" "+teclado.next();
            System.out.println("Digite el Segundo Apellido:");
            nombreCompleto = nombreCompleto+" "+teclado.next();
            datos[f]=nombreCompleto;
            System.out.println("Digite la edad: ");
            edades[f]=teclado.nextInt();
        }
    }

    /**
     * Metodo para imprimir la información almacenada en un vector
     */
    public void imprimir() {
        for(int f=0;f<datos.length;f++) {
            System.out.println("Nombre de la persona: "+datos[f]);
            System.out.println("Edad de la persona: "+edades[f]);
        }
    }

    /**
     * Metodo para buscar un valor por Posición
     */
    public void buscarP() {
        System.out.println("");
        System.out.println("Digite la posición que desea buscar: ");
        int pos = teclado.nextInt();
        if(pos>=this.datos.length) {
            System.out.println("La posición no es correcta.");
            buscarP();
        }
        else
            System.out.println("En la posición: "+pos+", se encuentra "+datos[pos]);
    }

    /**
     * Metodo para buscar un valor en el vector
     * @return encontrado
     */
    public boolean buscarValor() {
        boolean encontrado = false;
        teclado.nextLine();
        System.out.println("Digite el nombre a Buscar: ");
        String nombreB = teclado.nextLine();
        for (int i = 0; i < datos.length; i++) {

            if(datos[i].equals(nombreB))
                encontrado = true;
        }
        if (encontrado)
            System.out.println("El valor se encuentra en el vector");
        else
            System.out.println("El valor no se encuentra en el vector");
        System.out.println("");
        return encontrado;
    }

    public static void main(String[] args) {
        Vector v = new Vector();
        v.cargar();
        v.imprimir();
        v.buscarP();
        v.buscarValor();
    }

}
