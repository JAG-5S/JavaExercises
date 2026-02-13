package humanoCiudadano;

public class Humano {


	protected String nombre;
	protected String apellido;
	
	public Humano() {
		this.nombre = "Juan";
		this.apellido ="Garcia";
	}
	public Humano(String nombre, String apellido)throws IllegalArgumentException {
		if(nombre == null || apellido == null) {
			throw new IllegalArgumentException ("Parametros invalidos");
		}
		
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	/**
	 * @return the nombre
	 */
	protected String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	protected String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	
	public String getNombreCompleto() {
		return "[" + this.nombre + ", " + this.apellido + "]";
	}
	
	
	
}
