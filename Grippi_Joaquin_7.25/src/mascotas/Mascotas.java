package mascotas;

import java.time.LocalDate;

public abstract class Mascotas {

	protected String nombre;
	protected int edad;
	protected String estado;
	protected LocalDate fechaNacimiento;
	
	protected Mascotas(String nombre, int edad, String estado, LocalDate fechaNacimiento) {
	}
	
	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	protected String getEstado() {
		return estado;
	}

	protected void setEstado(String estado) {
		this.estado = estado;
	}

	protected LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	protected void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String toString() {
		return "Mascotas [nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}

	protected void cumpleaños() {
		System.out.print("Su cumpleaños es en el Mes: " + fechaNacimiento.getMonthValue() + ", En el dia: "+ fechaNacimiento.getDayOfMonth());	
	}
	
	protected void morir() {
		//Nose como implementar este Metodo
	}
	
	protected void habla() {
	}
	
	
}
