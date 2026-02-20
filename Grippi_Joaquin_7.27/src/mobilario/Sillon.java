package mobilario;

public class Sillon extends Asiento {

	public static final int POS_BAJADO = 0;
	public static final int POS_SUBIDO = 1;
	
	private int posicionPies;
	
	
	public Sillon(int precio, String descripcion, String tapiceria, String color)
			throws IllegalArgumentException {
		super(precio, descripcion, Asiento.MIN_PLAZAS, tapiceria, color);
		this.posicionPies = POS_BAJADO;
		
	}
	
	@Override
	public String toString() {
		return super.toString()+ "Sillon [posicionPies=" + posicionPies + "]";
	}

	

	
}
