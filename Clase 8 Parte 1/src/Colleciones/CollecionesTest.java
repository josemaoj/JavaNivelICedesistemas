
package Colleciones;

import java.util.*;

public class CollecionesTest {

	public static void main(String[] args) {
		//Crear un objeto de tipo ArrayList
		ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
		//Adicionar elementos al arraylist
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    //imprimir el arraylist
	    System.out.println(cars);
	    //Traer un elemento en la posición definida
	    System.out.println(cars.get(1));
	    //Modificar un elemento en una posición especifica
	    cars.set(0, "Renault");
  	    //imprimir el arraylist
	    System.out.println(cars);
	    //remover un elemento de la lista
	    cars.remove(0);
  	    //imprimir el arraylist
	    System.out.println(cars);
	    if(cars.contains("Ford"))
	    	System.out.println("Elemento encontrado");
	    else
	    	System.out.println("Elemento no encontrado");
	    System.out.println("El valor esta en la posición: "+cars.indexOf("Ford"));
	    System.out.println("La cantidad de elementos en el arraylist es: "+cars.size());
	    /*
	    for (int i = 0; i < cars.size(); i++) {
	        System.out.println(cars.get(i)+" - ");
	      }
	    */
	  //Modificar un elemento en una posición especifica
	    cars.set(0, "Renault");
	    cars.add("Chevrolet");
	    
	    for (String i : cars) {
	        System.out.println(i +" - ");
	      }
	    
	    System.out.println("-----------------------------");
	    Collections.sort(cars);  // Sort cars
	    
	    for (String i : cars) {
	      System.out.println(i);
	    }


	}
	
}
