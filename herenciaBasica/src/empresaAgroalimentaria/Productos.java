package empresaAgroalimentaria;

import java.time.LocalDate;

public abstract class Productos {
	
	protected int codigoProducto;
	protected String nombre;
	protected LocalDate fechaCaducidad;
	protected int numeroLote;
	
	protected Productos (int codigoProducto, String nombre, LocalDate fechaCaducidad, int numeroLote ) {
		
		this.codigoProducto = codigoProducto;
		this.nombre = nombre;
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
		
	}
	
	
	//GETERS Y SETTERS 
	protected int getCodigoProducto() {
		return codigoProducto;
	}
	protected void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}
	protected void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	protected int getNumeroLote() {
		return numeroLote;
	}
	protected void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}
	
	public String toString() {
		return "Productos [codigoProducto=" + codigoProducto + ", nombre=" + nombre + ", fechaCaducidad="
				+ fechaCaducidad + ", numeroLote=" + numeroLote + "]";
	}
	
	
	public class ProductoRefrigerado extends Productos{
		
		private String codigoOrgAlimentaria;
		private int minTempConservacion;
		private LocalDate fechaConsumoRecomendado;
		
		public ProductoRefrigerado(int codigoProducto, String nombre, LocalDate fechaCaducidad, int numeroLote, String codigoOrgAlimentaria, int minTempConservacion, LocalDate fechaConsumoRecomendado) {
			super(codigoProducto, nombre, fechaCaducidad, numeroLote);
			this.codigoOrgAlimentaria = codigoOrgAlimentaria;
			this.minTempConservacion = minTempConservacion;
			this.fechaConsumoRecomendado = fechaConsumoRecomendado;
		}
		
		
	}
	
	public class ProductoCongelado extends Productos{
		private int tempCongelacionRecomendada;
		private int tiempoCaducidadCongelador;
		
		public ProductoCongelado(int codigoProducto, String nombre, LocalDate fechaCaducidad, int numeroLote, int tempCongelacionRecomendada, int TiempoCaducidadCongelador) {
			super(codigoProducto, nombre, fechaCaducidad, numeroLote);
			this.tempCongelacionRecomendada = tempCongelacionRecomendada;
			this.tiempoCaducidadCongelador = tiempoCaducidadCongelador;
		}
	}
	
	
	
	
}

