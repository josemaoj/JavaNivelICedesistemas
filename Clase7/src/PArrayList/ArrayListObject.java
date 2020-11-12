package PArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListObject {

	public static void imprimir(ArrayList<String> nombres) {
		for (int i = 0; i < nombres.size(); i++) {
			System.out.println("El nombre es: "+nombres.get(i)+" - ");
		}
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		ArrayList<String>nombresAL= new ArrayList<>();
		Scanner capturar = new Scanner(System.in);
		System.out.println("Digite la cantidad de personas a almacenar: ");
		int cant = capturar.nextInt();
		for (int i = 0; i < cant; i++) {
			System.out.println("Digite el nombre a almacenar");
			String nombre = capturar.next();
			nombresAL.add(nombre);
		}
		imprimir(nombresAL);
		nombresAL.add(1,"Mauricio");
		imprimir(nombresAL);
		System.out.println("Digite el nombre que desea eliminar: ");
		nombresAL.remove(capturar.next());
		imprimir(nombresAL);
		System.out.println("La cantidad de elementos de la lista son:"+ nombresAL.size());
		System.out.println("Digite el nombre a buscar en la lista: ");
		String nombreB = capturar.next();
		if(nombresAL.contains(nombreB))
			System.out.println(nombreB+", se encuentra en la lista");
		else
			System.out.println("El nombre no se encuentra en la lista");
		//if(nombresAL.equals(null))
		//	System.out.println("Es null");
		//nombresAL.clear();
		if(nombresAL.isEmpty())
			System.out.println("Ya no tienes elementos en la lista");
	}
	
}

