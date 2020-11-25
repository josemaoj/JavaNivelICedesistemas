/**
 * Clase para obtener la información de un entrenador
 * y todos sus metodos
 * @author 	jose.jaramillo
 * @since	25/11/2020
 * @version	1
 */
public class Entrenador extends SeleccionFutbol {

	//Definición de variables
	private int idFederacion;
		
	//Constructor, getter y setter
	
	@Override
	public void entrenamiento() {
		System.out.println("Dirige un entrenamiento (Clase Entrenador)");
	}

	@Override
	public void partidoFutbol() {
		System.out.println("Dirige un partido (Clase Entrenador)");
	}
	
	public void planificarEntrenamiento() {
		System.out.println("Planificar un Entrenamiento ");
	}

	public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}
	
	
}
