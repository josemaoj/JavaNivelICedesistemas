package PArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Empleados {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Personas>Empleados = new ArrayList<>();
		System.out.println("Digite la cantidad de empleados para registrar: ");
		int cant = teclado.nextInt();
		for (int i = 0; i < cant; i++) {
			Personas p = new Personas();
			Empleados.add(p);
		}
		System.out.println("La cantidad de empleados almacenados es: "+Empleados.size());
		for (int i = 0; i < Empleados.size(); i++) {
			System.out.println("El tipo de identificación del empleado es: "+
							    Empleados.get(i).getTipoIdentificacion());
			System.out.println("El numero de identificación del empleado es: "+
		                        Empleados.get(i).getNumeroIdentificacion());
			System.out.println("El nombre completo del empleado es: "+
		                        Empleados.get(i).getNombreCompleto());
		}
	}
}
