package view;

/**
 * Vista para obtener la información del proceso 
 * del cliente
 * @author jose.jaramillo
 * @version	1
 * @since	11/30/2020
 */
public class ClienteView {
	
	public void imprimirDatosCliente(int id,String nombre, String apellido) {
		System.out.println("**** DATOS CLIENTE ****");
		System.out.println("Id: "+id);
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
	}
	
	
}
