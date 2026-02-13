package instituto;

public class Profesor extends Personal {

	private String titulacion;
	private String asignatura1;
	private String asignatura2;
	private String tutor;
	private double anyosExperiencia;
	
	public Profesor(String dni,int edad, String nombre, String apellido, String genero, double salario
			, String telefono, String email, String titulacion, String asignatura1
			, String asignatura2, String tutor, double anyosExperiencia)throws IllegalArgumentException {
		super(dni, edad, nombre, apellido, genero, salario, telefono, email);
		if(titulacion == null|| asignatura1 == null|| asignatura2 == null || tutor == null) {
			throw new IllegalArgumentException("Los valores no pueden estar vacios");
		}
		if(anyosExperiencia < 0) {
			throw new IllegalArgumentException("La experiencia no puede ser negativa");
		}
		
		this.titulacion = titulacion;
		this.asignatura1 = asignatura1;
		this.asignatura2 = asignatura2;
		this.tutor = tutor;
		this.anyosExperiencia = anyosExperiencia;
	}
	
	@Override 
	public String toString() {
		return super.toString() + ", Titulacion: " + this.titulacion+ ", Asignatura1: " + this.asignatura1
	+ ", Asignatura2: "+ this.asignatura2+ ", tutor: "+ this.tutor+ ", Email: "+this.email ; 
	}

	@Override 
	public void aumentoSalario(double anyosExperiencia) {
		if (anyosExperiencia <3 && anyosExperiencia >= 1) {
			this.salario += ((salario / 100)*1);
		}else if (anyosExperiencia >= 3 && anyosExperiencia < 5) {
			this.salario += ((salario / 100)*2);
		}else if (anyosExperiencia >= 5) {
			this.salario += ((salario / 100)*3);
		}
	}

}
