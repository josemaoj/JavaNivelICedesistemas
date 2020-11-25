
/**
 * Clase principal del proyecto Contiene la información generica del personal
 * del equipo de futbol
 * 
 * @author jose.jaramillo
 * @version 1
 * @since 25/11/2020
 */
public abstract class SeleccionFutbol {
	// Definición de variables
	protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;

	// Constructores, getter y setter

	/**
	 * Metodo para viajar de la selección de futbol
	 */
	public void viajar() {
		System.out.println("Viajar (Clase padre)");
	}

	/**
	 * Metodo para llamar a concentración a la selección de futbol
	 */
	public void concentrarse() {
		System.out.println("Concentrarse (Clase padre)");
	}

	/**
	 * Metodo abstracto que se debe implementar en las clases hijas
	 */
	public abstract void entrenamiento();

	/**
	 * Metodo para jugar un partido de futbol
	 */
	public void partidoFutbol() {
		System.out.println("Asistencia al Partido de Futbol (Clase Padre)");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
