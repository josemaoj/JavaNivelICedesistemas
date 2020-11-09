package Vector;

import java.util.Scanner;

/**
 * Clase para el manejo de vectores
 * @author 	jose.jaramillo
 * @since	11/09/2020
 * @version	1
 */
public class Vector {
	private Scanner teclado = new Scanner(System.in);
	//Define un objeto tipo vector
	//entero llamado sueldos
	private int[] sueldos;
	
	/**
	 * Metodo para cargar datos en el vector
	 */
	public void cargar() {
		System.out.println("Cuantos sueldos desea cargar: ");
		int cant = teclado.nextInt();
		//Instanciar el objeto tipo vector
		//y darle un tamaño
		sueldos=new int[cant];
		//for (int i = 0; i < cant; i++) {
		for (int i = 0; i < sueldos.length; i++) {
			System.out.println("Digite el sueldo:");
			sueldos[i]=teclado.nextInt();
		}	
	}
	
	/**
	 * Metodo para imprimir los valores almacenados en el vector
	 */
	public void imprimir() {
		for (int i = 0; i < sueldos.length; i++) {
			System.out.print(sueldos[i]+"-");
		}
	}
	
	/**
	 * Metodo para buscar un valor en una posición
	 * @return
	 */
	
	public void buscarP() {
		System.out.println("");
		System.out.println("Digite la posición que desea buscar: ");
		int pos = teclado.nextInt();
		if(pos>=this.sueldos.length) {
			System.out.println("La posición no es correcta.");
			buscarP();
		}		
		else 
			System.out.println("En la posición: "+pos+", se encuentra "+sueldos[pos]);
	}
	
	public boolean buscarValor() {
		boolean encontrado = false;
		System.out.println("Digite el valor a buscar: ");
		int valor = teclado.nextInt();
		for (int i = 0; i < sueldos.length; i++) {
			if(valor==sueldos[i])
				encontrado = true;
		}
		return encontrado;
		
	}
	
}
