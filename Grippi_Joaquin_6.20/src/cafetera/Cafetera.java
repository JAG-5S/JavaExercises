package cafetera;

public class Cafetera {
	
	public static final double CAPACIDADMAX_PREDETERMINADA = 1000;
	public static final double CAPACIDAD_ACTUAL_PREDETERMINADA = 0;
	
	private double capacidadMaxima;
	private double capacidadActual;
	
	public Cafetera()throws IllegalArgumentException {
		this (CAPACIDADMAX_PREDETERMINADA, CAPACIDAD_ACTUAL_PREDETERMINADA );
		
		this.capacidadMaxima = CAPACIDADMAX_PREDETERMINADA;
		this.capacidadActual = CAPACIDAD_ACTUAL_PREDETERMINADA;
	}
	
	public Cafetera(double capacidadMaxima)throws IllegalArgumentException {
		this(capacidadMaxima, CAPACIDAD_ACTUAL_PREDETERMINADA );
		
		this.capacidadMaxima = capacidadMaxima;
		this.capacidadActual = capacidadMaxima;
	}
	
	public Cafetera(double capacidadMaxima, double capacidadActual)throws IllegalArgumentException {
		if(capacidadMaxima <= 0) {
			throw new IllegalArgumentException ("La capacidad maxima no puede ser 0 ni negativo");
		}else if(capacidadActual > capacidadMaxima) {
			capacidadActual = capacidadMaxima;
			throw new IllegalArgumentException ("La capacidad actual no puede superar a la maxima, cantida sobrante: " + (capacidadActual-capacidadMaxima));
		}
		
		this.capacidadActual = capacidadActual;
		this.capacidadMaxima = capacidadMaxima;
		
	}
	
	public void llenarCafetera(double cantidad)throws IllegalArgumentException{
		if(cantidad <= 0) {
			throw new IllegalArgumentException ("La cantidad no puede ser 0 ni negativo");
		}else if (cantidad + capacidadActual > capacidadMaxima) {
			throw new IllegalArgumentException ("La cantidad sumada a la actual no puede ser superior a la maxima, Faltan para llenar la cafetera: " + (capacidadActual-capacidadMaxima));
		}
		
		this.capacidadActual += cantidad;
	}
	
	public void servirTaza(double cantidad)throws IllegalArgumentException {
		if (cantidad <= 0) {
			throw new IllegalArgumentException ("La cantidad no puede ser 0 ni negativo");
		}else if(this.capacidadActual < cantidad) {
			this.capacidadActual = 0;
			throw new IllegalArgumentException ("No hay suficiente Cafe para servir");
		}
		
		this.capacidadActual -= cantidad;
	}
	
	public void vaciarCafetera() {
		this.capacidadActual = 0;
	}
	
	public void setCapacidadActual(double capacidad) {
		this.capacidadActual = capacidad;
	}
	public void setCapacidadMaxima(double capacidad) {
		
	}
	
}
