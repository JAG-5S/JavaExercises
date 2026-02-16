package mascotas;

import java.time.LocalDate;

public class Gato extends Mascotas {

	private String color;
	private boolean peloLargo;
	
	public Gato(String nombre, int edad, String estado, LocalDate fechaNacimiento, String color, boolean peloLargo) {
		super(nombre, edad, estado, fechaNacimiento);
		this.color = color;
		this.peloLargo = peloLargo;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Gato [color=" + color + ", peloLargo=" + peloLargo + "]";
	}
	@Override
	protected void habla() {
		System.out.println("Mauya");
	}
}
