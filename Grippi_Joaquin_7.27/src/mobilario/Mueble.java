package mobilario;

public abstract class Mueble {

		public static final double MIN_PRECIO = 0.01;
		public static final double MAX_PRECIO = 10000.00;
	  
	    private static int contadorIdentificadores = 0;

	    private final int identificador;     
	    protected double precio;           
	    private final String descripcion;    

	  
	    public Mueble(double precio, String descripcion) throws IllegalArgumentException {
	        if (precio < MIN_PRECIO || precio > MAX_PRECIO) {
	            throw new IllegalArgumentException("El precio debe estar entre 0.01 y 10000.00 euros.");
	        }
	        if (descripcion == null || descripcion.isBlank()) {
	            throw new IllegalArgumentException("La descripción no puede estar vacía.");
	        }
	        contadorIdentificadores++;
	        this.identificador = contadorIdentificadores;
	        this.precio = precio;
	        this.descripcion = descripcion;
	    }

	    public int getIdentificador() {
	        return identificador;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }
	    
	    public  String getTipo() {
	    	return "mueble";
	    }

	    public void setPrecio(double precio) {
	        if (precio < 0.01 || precio > 10000.00) {
	            throw new IllegalArgumentException("El precio debe estar entre 0.01 y 10000.00 euros.");
	        }
	        this.precio = precio;
	    }

	    @Override
	    public String toString() {
	        return "Tipo: " +  getTipo() + " id: " + this.identificador + " Precio: " + this.precio + " Descripcion: " + this.descripcion ; 
	        		
	    }
	}

	
