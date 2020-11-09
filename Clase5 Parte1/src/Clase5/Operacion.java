package Clase5;

import java.util.Scanner;

/**
 * Clase para la operacion de suma y resta de valores
 * @author 	jose.jaramillo
 * @since	11/09/2020
 * @version	1
 */
public class Operacion {
		//Variables
		protected Scanner teclado;
	    protected int valor1;
	    protected int valor2;
	    protected int resultado;

	    /**
	     * Constructor de la clase
	     */
	    public Operacion() {
	        teclado=new Scanner(System.in);
	    }
	    
	    /**
	     * Permite registrar el primer valor
	     */
	    public void cargar1() {
	        System.out.print("Ingrese el primer valor:");
	        valor1=teclado.nextInt();        
	    }
	    
	    /**
	     * Permite registrar el segundo valor
	     */
	    public void cargar2() {
	        System.out.print("Ingrese el segundo valor:");
	        valor2=teclado.nextInt();
	    }
	    
	    /**
	     * Metodo para mostrar resultado
	     */
	    public void mostrarResultado() {
	        System.out.println(resultado);
	    }

		public int getValor1() {
			return valor1;
		}

		public void setValor1(int valor1) {
			this.valor1 = valor1;
		}
	    
		
	    

}
