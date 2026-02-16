package mascotas;

import java.time.LocalDate;

public class Perro extends Mascotas {

	private String raza;
	private boolean pulgas;
	
	public Perro(String nombre, int edad, String estado, LocalDate fechaNacimiento, String raza, boolean pulgas) {
		super(nombre, edad, estado, fechaNacimiento);
		this.raza = raza;
		this.pulgas = pulgas;
	}
	
	protected void habla() {
		System.out.println("Ladra");
	}
	
	@Override
	public String toString() {
		return super.toString() + "Perro [raza=" + raza + ", pulgas=" + pulgas + "]";
	}

	
}
