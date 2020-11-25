package Seleccion;

import java.util.ArrayList;

public class SeleccionTest {

	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
	
	public static void main(String[] args) {
		
		SeleccionFutbol pekerman = new Entrenador(1, "Jose", "Pekerman", 60, 100101);
		SeleccionFutbol james = new Futbolista(2, "James", "Rodriguez", 24, 10, "Mediocampista");
		SeleccionFutbol JuanPerez = new Masajista(3, "Juan", "Perez", 25, "Especialista en Masajes", 7);
		
		integrantes.add(pekerman);
		integrantes.add(james);
		integrantes.add(JuanPerez);
		
		System.out.println("------------------------------------------");
		System.out.println("Concentración");
		System.out.println("------------------------------------------");

		//Concentración
		System.out.println("Todos tienen concentración.");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre() +" "+integrante.getApellidos()+" -> ");
			integrante.concentrarse();
		}

		System.out.println("------------------------------------------");
		System.out.println("Viajar");
		System.out.println("------------------------------------------");
		//viajar
		System.out.println("Todos los integrantes viajan a jugar un partido");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre()+" "+integrante.getApellidos() +" -> ");
			integrante.viajar();
			
		}
		
		System.out.println("------------------------------------------");
		System.out.println("Entrenamiento");
		System.out.println("------------------------------------------");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre()+ " "+integrante.getApellidos()+" -> ");
			integrante.entrenamiento();
		}
		
		System.out.println("------------------------------------------");
		System.out.println("Partido");
		System.out.println("------------------------------------------");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre()+ " "+integrante.getApellidos()+" -> ");
			integrante.partidoFutbol();
		}
		
	}
	
}
