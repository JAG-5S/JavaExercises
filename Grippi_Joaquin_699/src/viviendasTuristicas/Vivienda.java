package viviendasTuristicas;

import java.time.LocalDate;

public abstract class Vivienda {
	public final LocalDate  FECHA_CONSTRUCCION = LocalDate.now();
	public final String DIRECCION = "Calle Joaquin";
	public final int PRECIO_NOCHE = 10;
	public final boolean DISPONIBLE = true;
	//Public static

	protected String identificador;
	protected LocalDate fechaConstruccion;
	protected String direccion;
	protected int precioPorNoche;
	protected boolean disponible;
	protected int contador = 0;
	
	public Vivienda() {
		this.identificador = generarIdentificador();
		this.fechaConstruccion = FECHA_CONSTRUCCION;
		this.direccion = DIRECCION;
		this.precioPorNoche = PRECIO_NOCHE;
		this.disponible = DISPONIBLE;
	}
	
	public Vivienda(LocalDate fechaConstruccion, String direccion, int precioPorNoche, 
			boolean disponible) {
		this.identificador = generarIdentificador();
		this.fechaConstruccion = fechaConstruccion;
		this.direccion = direccion;
		this.precioPorNoche = precioPorNoche;
		this.disponible = disponible;
		
		contador ++;
	}
	
	public String generarIdentificador() {
		int anyoDeConstruccion = LocalDate.now().getYear();
		if(this.contador < 10) {
			return anyoDeConstruccion + "-00" + contador;
		}else if (this.contador > 10 && this.contador < 100) {
			return anyoDeConstruccion + "-0" + contador;
		}else {
			return anyoDeConstruccion + "-" + contador;
		}
	}
	
	public void numeroDeViviendasTuristicas() {
		System.out.println("El numero de viviendas turisticas es: " + contador);
	}
	
	@Override
	public String toString() {
		return "Vivienda [identificador=" + identificador + ", fechaConstruccion=" + fechaConstruccion + ", direccion="
				+ direccion + ", precioPorNoche=" + precioPorNoche + ", disponible=" + disponible + ", contador="
				+ contador + "]";
	}


	public int calcularPrecio(int numeroDias) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
