package Principal;

import java.util.Scanner;

/**
 * Clase principal para probar las clases secundarias
 * @author  jose.jaramillo
 * @version 1
 * @since   28/10/2020
 */
public class Principal {
    static Scanner capturar = new Scanner(System.in);
    /**
     * Main class (Orquestador de la clase) para las pruebas
     * @param args
     */
    public static void main(String[] args) {
        //pruebasOperadores po = new pruebasOperadores();
        //po.pruebasOperacion();
        //datosPersona dp = new datosPersona();
        //dp.capturarDatos();
        //dp.mayorEdad(dp.edad);

        //System.out.println("Digite la edad que quiere validar.");
        //int pEdad = capturar.nextInt();
        //dp.mayorEdad(pEdad);
        /*
        datosPersona2 dp2 = new datosPersona2();
        dp2.capturarDatos();
        boolean validarEdad = dp2.mayorEdad(dp2.getEdad());
        if (validarEdad==true)
            System.out.println("Esta persona es mayor de edad");
        else {
            System.out.println("Esta persona es menor de edad");
        }

         */
        /*
        datosPersona3 dp31 = new datosPersona3();
        datosPersona3 dp32 = new datosPersona3();
        datosPersona3 dp33 = new datosPersona3();

         */
        //datosPersona3 dp3 = new datosPersona3();
        System.out.println("Digite la edad a validar: ");
        datosPersona3 dp3 = new datosPersona3(capturar.nextInt());
    }
}
