package viviendasTuristicas;

import java.time.LocalDate;

public class CasaRural extends Vivienda {

	private int metrosCuadrados;
	private boolean admiteMascotas;
	
	public CasaRural(LocalDate fechaConstruccion, String direccion, int precioPorNoche, 
			boolean disponible, int metrosCuadrados, boolean admiteMascotas)throws IllegalArgumentException {
		super(fechaConstruccion, direccion, precioPorNoche, disponible);
		if(metrosCuadrados <= 0) {
			throw new IllegalArgumentException("El metro cuadrado no puede ser negativo");
		}
		
		this.metrosCuadrados = metrosCuadrados;
		this.admiteMascotas = admiteMascotas;
	}
	
	
	@Override
	public int calcularPrecio(int numeroDias) {
		int precio = this.precioPorNoche * numeroDias;
		if (this.admiteMascotas) {
			precio += 20;
		}
		return precio;
	}
	
	public void esPetFriendly() {
		if(this.metrosCuadrados >= 100 && this.admiteMascotas) {
			System.out.println("Si es petAmigable");
		}else {
			System.out.println("No es petAmigable");
		}
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "CasaRural [metrosCuadrados=" + metrosCuadrados + ", admiteMascotas=" + admiteMascotas + "]";
	}

}
