package Clase4;

//import java.util.Random;
import java.util.Scanner;

/**
 * Clase 4
 * Clase de pruebas
 * @author 	jose.jaramillo
 * @since	11/05/2020
 * @version	1
 */
public class Prueba {

	public static void main(String[] args) {
	        Scanner teclado=new Scanner(System.in);
	        //int x=1,
	        int suma=0,valor,promedio;
	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Ingrese un valor:");
	            valor=teclado.nextInt();
	            suma=suma+valor;
			}
	        /*
	        while (x<=10) {
	            System.out.print("Ingrese un valor:");
	            valor=teclado.nextInt();
	            suma=suma+valor;
	            x++;
	        }
	        */
	        promedio=suma/10;
	        System.out.print("La suma de los 10 valores es:");
	        System.out.println(suma);
	        System.out.print("El promedio es:");
	        System.out.print(promedio);
		
	        
	        
		/*
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite el numero de control: ");
		int numeroC = teclado.nextInt();
		int x = 1;
		while (x<=numeroC) {
			System.out.print(x);
			System.out.print("-");
			x++;
		}
		*/
		
		
		/*
		double valorO = (Math.random()*6);
		System.out.println("El valor generado original es: "+valorO);
		double valor = Math.round(valorO);
		System.out.println("El valor generado es: "+valor);
		int valor2 = (int) valor;
		System.out.println("El valor2 generado es: "+valor2);
		*/
		/*
		for (int i = 1; i <= 20; i++) {
			double valorO = (Math.random()*6+1);
			//System.out.println("El valor generado original es: "+valorO);
			int valor = (int) valorO;
			System.out.println("El valor generado es: "+valor);
		}*/
		/*
		for (int i = 0; i < 20; i++) {
			int M = -2, N = 2;
			int valorEntero = (int) Math.floor(Math.random()*(N-M+1)+M);
			System.out.println("El valor es: "+valorEntero);
		}*/
		/*
		for (int i = 0; i < 10; i++) {
			Random r = new Random();
			int M = -2, N = 2;
			int valor = r.nextInt(N-M+1)+N;
			System.out.println("El valor es: "+valor);
		}
		*/
		
		/*for (int i = 0; i < 6; i++) {
			Random r = new Random();
			//int valorDado = r.nextInt(6)+1;  // Entre 0 y 5, más 1.
			int valorDado = r.nextInt(2);  // Entre 0 y 5, más 1.
			System.out.println("El valor generado es: "+valorDado);
		}*/
	}
}

		
