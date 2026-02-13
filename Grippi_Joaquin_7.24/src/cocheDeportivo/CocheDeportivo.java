package cocheDeportivo;

import java.time.LocalDate;

public class CocheDeportivo extends Coche {
	private String traccion; // "total" o "delantera" 
	
	public CocheDeportivo(String matricula, String nombrePropietario, LocalDate fechaMatriculacion, int cilindrada,
			int potencia, String traccion) {
		super(matricula, nombrePropietario, fechaMatriculacion, cilindrada, potencia); 
		setTraccion(traccion); 
		this.traccion = traccion;
		} 
	
	public String getTraccion() {
		return traccion; 
		} 
	
	public void setTraccion(String traccion) {
		if (!traccion.equalsIgnoreCase("total") && !traccion.equalsIgnoreCase("delantera")) {
			throw new IllegalArgumentException( "La tracción debe ser 'total' o 'delantera'." ); 
			} 
		this.traccion = traccion.toLowerCase(); 
		} 
	
	@Override 
	public String toString() {
		return super.toString() + ", Tracción: " + traccion; 
		}
	
}
	

