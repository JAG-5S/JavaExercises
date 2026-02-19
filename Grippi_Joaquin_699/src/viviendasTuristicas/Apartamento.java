package viviendasTuristicas;

import java.time.LocalDate;

public class Apartamento extends Vivienda {
	public final int NUMERO_HABITACIONES = 2;
	public final int DISTANCIA_CENTRO = 1500;
	//Pulic staic

	private int numeroHabitaciones;
	private int distanciaCentro;
	private LocalDate fechaUltimaReforma;
	
	public Apartamento() {
		this.numeroHabitaciones = 2;
		this.distanciaCentro = 1500;
		this.fechaUltimaReforma = LocalDate.of(2300, 12, 5);
	}
	
	public Apartamento(LocalDate fechaConstruccion, String direccion, int precioPorNoche, 
			boolean disponible, int numeroHabitaciones, int distanciaCentro, LocalDate fechaUltimaReforma) throws IllegalArgumentException  {
		super(fechaConstruccion, direccion, precioPorNoche, disponible);
		if(fechaConstruccion.isAfter(fechaUltimaReforma)) {
			throw new IllegalArgumentException("La fecha de la ultima reforma no puede ser anterior a la de creacion");
		}
	
		this.numeroHabitaciones = numeroHabitaciones;
		this.distanciaCentro = distanciaCentro;
		this.fechaUltimaReforma = fechaUltimaReforma;
		
		
	}
	
	@Override
	public int calcularPrecio(int numeroDias) {
		int precio = this.precioPorNoche * numeroDias;
		if(this.distanciaCentro < 2000) {
			precio += (precio/100)*15;
			return precio;
		}
		return precio;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Apartamento [numeroHabitaciones=" + numeroHabitaciones + ", distanciaCentro=" + distanciaCentro
				+ ", fechaUltimaReforma=" + fechaUltimaReforma + "]";
	}

	

}
