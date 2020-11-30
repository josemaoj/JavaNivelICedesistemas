package model;

/**
 * Clase que pertenece al Model.
 * Y permite generar y administrar los atributos del cliente
 * @author 	jose.jaramillo
 * @since   30/11/2020
 * @version 1
 */
public class Cliente {
	//Variables
	private int id;
	private String nombre;
	private String apellido;
	
	/**
	 * Constructor de la clase
	 */
	public Cliente() {
	}

	//Getter & Setter
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
}
