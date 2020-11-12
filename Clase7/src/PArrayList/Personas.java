package PArrayList;

import java.util.Scanner;

/**
 * Datos de las personas
 * @author 	jose.jaramillo
 * @since	11/12/2020
 * @version	1 
 */
public class Personas {
	//Atributos de la clase
	String tipoIdentificacion;
	int    numeroIdentificacion;
	String nombreCompleto;
	int    edad;
	int    genero; //0. Femenino 1. Masculino
	
	/**
	 * Constructor de la clase
	 */
	public Personas() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Captura de datos de la persona");
		System.out.println("Digite el tipo de Identificación: ");
		this.tipoIdentificacion = teclado.next();
		System.out.println("Digite el numero de identificación: ");
		this.numeroIdentificacion = teclado.nextInt();
		System.out.println("Digite Primer Nombre:");
		this.nombreCompleto = teclado.next();
		System.out.println("Digite Segundo Nombre:");
		this.nombreCompleto = this.nombreCompleto +" "+teclado.next();
		System.out.println("Digite Primer Apellido:");
		this.nombreCompleto = this.nombreCompleto +" "+teclado.next();
		System.out.println("Digite Segundo Apellido:");
		this.nombreCompleto = this.nombreCompleto +" "+teclado.next();
		System.out.println("Digite la edad de la persona: ");
		this.edad = teclado.nextInt();
		System.out.println("Digite el genero de la persona: ");
		this.genero = teclado.nextInt();
	}
	
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
	public int getGenero() {
		return genero;
	}
	public void setGenero(int genero) {
		this.genero = genero;
	}
	
	
	
}
