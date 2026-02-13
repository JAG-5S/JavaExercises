package instituto;

public class Personal {

	protected String dni;
	protected int edad; // he incluido el atributo edad para el metodo anyosJubilacion()
	protected String nombre;
	protected String apellido;
	protected String genero;
	protected double salario;
	protected String telefono;
	protected String email;
	
	protected Personal(String dni,int edad, String nombre, String apellido, String genero, double salario
			, String telefono, String email)throws IllegalArgumentException{
		if(nombre == null||apellido == null) {
			throw new IllegalArgumentException("El nombre o el apellido no pueden faltar");
		}
		if(edad < 18) {
			throw new IllegalArgumentException("El personal no puede ser menor de 18");
		}
		
		validacionDni(dni);
		validacionEmail(email);
		setGenero(genero);
		setNumeroTelefono(telefono);
		
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido; 
		this.salario = salario;
	}
	
	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellido() {
		return apellido;
	}
	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}
	protected double getSalario() {
		return salario;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}

	protected String getDni() {
		return dni;
	}

	protected String getGenero() {
		return genero;
	}

	protected String getTelefono() {
		return telefono;
	}
	
	//VALIDA EL DNI
	protected void validacionDni(String dni)throws IllegalArgumentException{
		if (!dni.matches("\\d{8} [A-Z]{1}")) {
			throw new IllegalArgumentException("El dni no cumple con el formato"); 
			}
		this.dni = dni;
	}
	//VALIDA EL EMAIL
	protected void validacionEmail(String email)throws IllegalArgumentException {
		if (!email.matches(".+@.+")) {
			throw new IllegalArgumentException("El dni no cumple con el formato"); 
			}
		this.email = email;
		
	}
	//VALIDA EL GENERO
	protected void setGenero(String genero)throws IllegalArgumentException {
		if (!genero.equalsIgnoreCase("masculino") && !genero.equalsIgnoreCase("femenino")) {
			throw new IllegalArgumentException( "El valor introducido no es válido. Solo se aceptan las opciones permitidas por el sistema.(masculino o femenino)" ); 
			} 
		this.genero = genero.toLowerCase(); 
		} 
	//VALIDA EL NUM DE TELEFONO
	protected void setNumeroTelefono(String telefono) {
		if (!telefono.matches("\\d{9}")) {
			throw new IllegalArgumentException("un numero de telefono debe ser español, 9 digitos."); 
			}
		this.telefono = telefono;
	}
	//AUMENTO DE SALARIO
	protected void aumentoSalario(double porcentajeAumento)throws IllegalArgumentException {
		if (porcentajeAumento <= 0) {
			throw new IllegalArgumentException("El Aumento no puede ser ni cero ni negativo");
		}
		this.salario += ((salario/100)* porcentajeAumento );

	}
	//CALCULADOR DE AÑOS RESTANTES PARA JUBILACION
	protected void anyosJubilacion (int edad){ // he modifica el tipo devuelto del metodo, no le veo sentido que sea tipo int, ya que es una consulta del tiempo restante a la jubilacion
		System.out.println("El tiempo restante para la jubilacion es de " + (edad - 66) + " años.");
	}
	//TOSTRING
	public String toString() {
		return "Personal [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero
				+ ", salario=" + salario + ", telefono=" + telefono + ", email=" + email + "]";
	}
	
}
