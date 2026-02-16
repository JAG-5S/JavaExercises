package mascotas;

import java.time.LocalDate;

public abstract class Aves extends Mascotas {


	protected String pico;
	protected boolean vuela;
	
	public Aves(String nombre, int edad, String estado, LocalDate fechaNacimiento, String pico, boolean vuela) {
		super(nombre, edad, estado, fechaNacimiento);
	}
	
	protected void volar() {
		System.out.print("Vuela");
	}
	
	@Override
	public String toString() {
		return super.toString()+ "Aves [pico=" + pico + ", vuela=" + vuela + "]";
	}

	
}
