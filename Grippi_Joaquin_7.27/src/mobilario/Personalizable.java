package mobilario;

public interface Personalizable {
	
	public void obtenerModulos();
	
	public void anyadirModulo(Modulo modulo) throws IllegalStateException,  NullPointerException;
	
	public void extraerModulo() throws IllegalStateException;

}
