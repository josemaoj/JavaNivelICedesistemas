
public class Futbolista extends SeleccionFutbol{

	private int camiseta;
	private String posicion;
	
	//Constructor, getter y setter

	@Override
	public void entrenamiento() {
		System.out.println("Realiza un entrenamiento (Clase Futbolista)");
	}

	@Override
	public void partidoFutbol() {
		System.out.println("Juaga un partido de Futbol (Clase Futbolista)");
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
