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
			int potencia) throws IllegalArgumentException {
		if (nombrePropietario == null) {
			throw new IllegalArgumentException("El nombre del propietario no puede ser nulo"); 
		}
		
		//Validaciones
		setMatricula(matricula); 
		setCilindrada(cilindrada);
		setPotencia(potencia);
		
		this.nombrePropietario = nombrePropietario;
		this.fechaMatriculacion = fechaMatriculacion;
	}
	
	public Coche() {
		this("0000-XXX", "Antonio Lobato", LocalDate.now(), 2000, 150);
	}

	/**
	 * @return the matricula
	 */
	protected String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	protected void setMatricula(String matricula)throws IllegalArgumentException{
		if (!matricula.matches("\\d{4} [A-Z]{3}")) {
			throw new IllegalArgumentException("La matrícula debe tener el formato 9999 AAA"); 
			}
		this.matricula = matricula;
	}

	/**
	 * @return the nombrePropietario
	 */
	protected String getNombrePropietario() {
		return nombrePropietario;
	}

	/**
	 * @param nombrePropietario the nombrePropietario to set
	 */
	protected void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

	/**
	 * @return the fechaMatriculacion
	 */
	protected LocalDate getFechaMatriculacion() {
		return fechaMatriculacion;
	}

	/**
	 * @param fechaMatriculacion the fechaMatriculacion to set
	 */
	protected void setFechaMatriculacion(LocalDate fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}

	/**
	 * @return the cilindrada
	 */
	protected int getCilindrada() {
		return cilindrada;
	}

	/**
	 * @param cilindrada the cilindrada to set
	 */
	protected void setCilindrada(int cilindrada) throws IllegalArgumentException {
		if (this.cilindrada < 0) {
			throw new IllegalArgumentException("La cilindrada no pueden ser negativas"); 
		}
		this.cilindrada = cilindrada;
	}

	/**
	 * @return the potencia
	 */
	protected int getPotencia() {
		
		return potencia;
	}

	/**
	 * @param potencia the potencia to set
	 */
	protected void setPotencia(int potencia) throws IllegalArgumentException {
		if (this.potencia < 0) {
			throw new IllegalArgumentException("La potencia no pueden ser negativas"); 
		}
		this.potencia = potencia;
	}

	public String toString() {
		return "Coche [matricula=" + matricula + ", nombrePropietario=" + nombrePropietario + ", fechaMatriculacion="
				+ fechaMatriculacion + ", cilindrada=" + cilindrada + ", potencia=" + potencia + "]";
	}
	
	
}
