package Seleccion;

/**
 * Clase para obtener la información y los metodos para un futbolista
 * 
 * @author jose.jaramillo
 * @since 25/11/2020
 * @version 1
 */
public class Futbolista extends SeleccionFutbol {

	private int camiseta;
	private String posicion;

	// Constructor, getter y setter

	@Override
	public void entrenamiento() {
		System.out.println("Realiza un entrenamiento (Clase Futbolista)");
	}

	/**
	 * Constructor de la clase
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param camiseta
	 * @param posicion
	 */
	public Futbolista(int id, String nombre, String apellidos, int edad, int camiseta, String posicion) {
		super(id, nombre, apellidos, edad);
		this.camiseta = camiseta;
		this.posicion = posicion;
	}



	@Override
	public void partidoFutbol() {
		System.out.println("Juega un partido de Futbol (Clase Futbolista)");
	}

	public void entrevista() {
		System.out.println("Da una entrevista");
	}

	public int getCamiseta() {
		return camiseta;
	}

	public void setCamiseta(int camiseta) {
		this.camiseta = camiseta;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

}
