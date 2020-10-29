package Principal;

import java.util.Scanner;

/**
 * Clase para el manejo de datos de una persona
 * y validación de la edad
 * @author  jose.jaramillo
 * @since   28/10/2020
 * @version 2
 */
public class datosPersona2 {
    //Definir las variables globales de la clase
    //Variables son privadas
    //Solo puede acceder la clase propia a ellas
    private String tipoIdentificacion;
    private int numeroIdentificacion;
    private String nombreCompleto;
    private int edad;

    /**
     * Metodo para capturar los datos de una persona
     */
    public void capturarDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el tipo de identificacion de la persona: ");
        setTipoIdentificacion(teclado.next());
        System.out.println("Digite el numero de identificacion de la persona: ");
        setNumeroIdentificacion(teclado.nextInt());
        teclado.nextLine();
        System.out.println("Digite el nombre completo de la persona: ");
        setNombreCompleto(teclado.nextLine());
        System.out.println("Digite la edad de la persona: ");
        setEdad(teclado.nextInt());

    }

    /**
     * Metodo para validar si una persona es menor o mayor de edad
     * @param edad //Edad para validar
     * @return mayor
     */
    public boolean mayorEdad(int edad){
        boolean mayor= false;
        if (edad>= 18)
            mayor= true;
        return mayor;
    }


    //Getters & Setters de las variables
    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
