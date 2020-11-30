package mvc;

import controller.ClienteController;
import model.Cliente;
import view.ClienteView;

public class MvcClienteTest {

	public static void main(String[] args) {
		// objeto vista, y modelo creado con el método estático
		Cliente modelo = llenarDatosCliente();
		ClienteView vista = new ClienteView();

		// se crea un objeto controlador y se le pasa el modelo y la vista
		ClienteController controlador = new ClienteController(modelo, vista);

		// se muestra los datos del cliente
		controlador.actualizarVista();

		// se actualiza un cliente y se muestra de nuevo los datos
		controlador.setNombre("Luis");
		controlador.actualizarVista();
	}

	// método estático que retorna el cliente con sus datos
	private static Cliente llenarDatosCliente() {
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNombre("Elivar");
		cliente.setApellido("Largo");
		return cliente;
	}

}
