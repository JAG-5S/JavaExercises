package mobilario;

public class Asiento extends Mueble {

	public static final int MIN_PLAZAS = 1;
	public static final int MAX_PLAZAS = 9;

	private final int numeroPlazas;
	private final String tapiceria;
	private final String color;

	// Constructor único
	public Asiento(int precio, String descripcion, int numeroPlazas, String tapiceria, String color) throws IllegalArgumentException {
		super(precio, descripcion);
	
		if (numeroPlazas < MIN_PLAZAS || numeroPlazas > MAX_PLAZAS) {
			throw new IllegalArgumentException("El numero de plazas no esta en el rango permitido "+numeroPlazas+ "El número de plazas debe estar entre " + MIN_PLAZAS + " y " + MAX_PLAZAS );
	    }
	    this.numeroPlazas = numeroPlazas;
	    this.tapiceria = tapiceria;
	    this.color = color;
	    }

	    public int getNumeroPlazas() {
	        return numeroPlazas;
	    }

	    public String getTapiceria() {
	        return tapiceria;
	    }

	    public String getColor() {
	        return color;
	    }
	    
	    
		@Override
		public String toString() {
			return super.toString() + "Asiento [numeroPlazas=" + numeroPlazas + ", tapiceria=" + tapiceria + ", color=" + color + "]";
		}

	    
	    
	    
	}


	
	
	


