package daoTest;

import dao.ClienteDaoImpl;
import idao.IClienteDao;
import model.Cliente;

public class DaoTest {
	public static void main(String[] args) {
		// objeto para manipular el dao
		IClienteDao clienteDao = new ClienteDaoImpl();
 
		// imprimir los clientes
		clienteDao.obtenerClientes().forEach(System.out::println);
 
		// obtner un cliente
		Cliente cliente = clienteDao.obtenerCliente(0);
		cliente.setApellido("Pardo");
		//actualizar cliente
		clienteDao.actualizarCliente(cliente);
 
		// imprimir los clientes
		System.out.println("*****");
		clienteDao.obtenerClientes().forEach(System.out::println);
	}
	
}
