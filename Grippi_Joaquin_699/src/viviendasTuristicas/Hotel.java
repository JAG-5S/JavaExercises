package viviendasTuristicas;

import java.time.LocalDate;

public class Hotel extends Vivienda {

	private int numeroStrellas;
	private int numeroHabitaciones;
	private boolean disponeDeSpa;
	
	public Hotel(LocalDate fechaConstruccion, String direccion, int precioPorNoche, 
			boolean disponible, int numeroStrellas, int numeroHabitaciones, boolean disponeDeSpa) {
		super(fechaConstruccion, direccion, precioPorNoche, disponible);
		
		this.numeroHabitaciones = numeroHabitaciones;
		this.numeroStrellas = numeroStrellas;
		this.disponeDeSpa = disponeDeSpa;
		
	}
	
	@Override
	public int calcularPrecio(int numeroDias) {
		int precio = this.precioPorNoche * numeroDias;
		if(this.numeroStrellas >= 3) {
			precio += (precio/100)*5;
		}
		if(this.disponeDeSpa) {
			precio += 30;
		}
		return precio;
	}
	
	public void esLujoso() {
		if (this.numeroStrellas >= 5 && this.disponeDeSpa) {
			System.out.println("Es lujoso");
		}else {
			System.out.print("No es lujoso");
		}
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "Hotel [numeroStrellas=" + numeroStrellas + ", numeroHabitaciones=" + numeroHabitaciones
				+ ", disponeDeSpa=" + disponeDeSpa + "]";
	}

	
}
