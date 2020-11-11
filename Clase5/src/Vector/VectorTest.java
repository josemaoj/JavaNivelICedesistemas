package Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.cargar();
		v.imprimir();
		v.buscarP();
		boolean encontrar = v.buscarValor();
		if (encontrar) 
			System.out.println("El valor buscado esta en el vector");
		else
			System.out.println("El valor no se encuentra en el vector");
	}
}
