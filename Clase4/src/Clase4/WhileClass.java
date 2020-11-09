package Clase4;

/**
 * Clase para probar la estructura repetitiva While
 * @author 	jose.jaramillo
 * @since	11/05/2020
 * @version	1
 */
public class WhileClass {

	
	public static void main(String[] args) {
		int x = 1;
		System.out.println("Los numeros del 1 al 100");
		while (x<=100) {
			System.out.print(x);
			System.out.print("-");
			x++; //x=x+1;
		}
		
	}
	
}
