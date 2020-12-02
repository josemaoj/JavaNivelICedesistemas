package idao;

import java.util.List;
import model.Cliente;

public interface IClienteDao {
	//declaración de métodos para acceder a la datos
		public List<Cliente> obtenerClientes();
		public Cliente obtenerCliente(int id);
		public void actualizarCliente(Cliente cliente);
		public void eliminarCliente(Cliente cliente);
}
