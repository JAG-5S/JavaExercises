package humanoCiudadano;

public class Humano {


	protected String nombre;
	protected String apellido;
	
	protected Humano() {
		this ()
		this.nombre = "Juan";
		this.apellido ="Garcia";
	}
	protected Humano(String nombre, String apellido)throws IllegalArgumentException {
		if(nombre == null || apellido == null) {
			throw new IllegalArgumentException ("Parametros invalidos");
		}
		
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombreCompleto() {
		return "[" + this.nombre + ", " + this.apellido + "]";
	}
	
	
}
