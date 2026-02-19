package mobilario;

public interface Ajustable {
	
	public void obtenerPosicion();
	
	public void subirPosicion()throws IllegalStateException;
	
	public void bajarPosicion()throws IllegalStateException;

}
