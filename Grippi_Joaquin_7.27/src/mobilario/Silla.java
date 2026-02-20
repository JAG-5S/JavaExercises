package mobilario;

public class Silla extends Asiento implements Ajustable  {

	public static final int MIN_POSICION = 1;
	public static final int MAX_POSICION = 4;
	
	private int posicionRespaldo;


	public Silla(int precio, String descripcion, String tapiceria, String color, int posicionRespaldo)
			throws IllegalStateException {
		super(precio, descripcion, Asiento.MIN_PLAZAS, tapiceria, color);
		if (posicionRespaldo < MIN_POSICION || posicionRespaldo > MAX_POSICION) {
			throw new  IllegalStateException("Posicion de respaldo invalida: " + posicionRespaldo);
		}
		
		
		this.posicionRespaldo = posicionRespaldo;
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "Silla [posicionSilla=" + posicionRespaldo + "]";
	}

	@Override
	public void obtenerPosicion() {
		System.out.print("La Posicion del Respaldo es: " + posicionRespaldo);
		
	}

	@Override
	public void subirPosicion() throws IllegalStateException {
		this.posicionRespaldo ++;
		if (posicionRespaldo > MAX_POSICION) {
			throw new  IllegalStateException("Posicion de respaldo invalida: " + posicionRespaldo);
		}
		
	}

	@Override
	public void bajarPosicion() throws IllegalStateException {
		this.posicionRespaldo --;
		if (posicionRespaldo < MIN_POSICION) {
			throw new  IllegalStateException("Posicion de respaldo invalida: " + posicionRespaldo);
		}
		
	}

	
	
}
