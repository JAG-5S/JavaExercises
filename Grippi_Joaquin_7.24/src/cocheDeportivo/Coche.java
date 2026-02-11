package cocheDeportivo;

import java.time.LocalDate;

public class Coche {
	
	protected String matricula;
	protected String nombrePropietario;
	private LocalDate fechaMatriculacion;
	protected int cilindrada;
	protected int potencia;

	/**
	 * @param matricula
	 * @param nombrePropietario
	 * @param fechaMatriculacion
	 * @param cilindrada
	 * @param potencia
	 */
	public Coche(String matricula, String nombrePropietario, LocalDate fechaMatriculacion, int cilindrada,
			int potencia) {
		if (nombrePropietario != null) {
			
		}
		if (cilindrada < 0 || potencia < 0) {
			
		}
		
		
		this.matricula = matricula;
		this.nombrePropietario = nombrePropietario;
		this.fechaMatriculacion = fechaMatriculacion;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
	}
	
	public Coche() {
		this (matricula, nombrePropietario, fechaMatriculacion, );
		
	}

	

}
