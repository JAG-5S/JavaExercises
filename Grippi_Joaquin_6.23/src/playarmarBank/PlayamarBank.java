package playarmarBank;

import java.time.LocalDate;

public class PlayamarBank {
	
	public static double DEFAULT_MAX_DESCUBIERTO = 0.0;
	public static double DEFAULT_SALDO = 0.0;
	public static double MAX_DESCUBIERTO = -2000;
	public static double MAX_SALDO = 50000000.0;
	public static double MIN_EMBARGO = 0.0;
	public static int MIN_YEAR = 1900;
	
	
	private double saldoInicial;
	private LocalDate fechaCreacion;
	private double limiteDescubierto;
	private int id;
	
	
	PlayamarBank(double saldoInicial, LocalDate fechaCreacion, double limiteDescubierto) throws IllegalArgumentException{
		if (fechaCreacion == null) {
			throw new IllegalArgumentException ("La fecha esta mal");
		}else if()
		
		
		
		this.saldoInicial = saldoInicial;
		this.fechaCreacion = fechaCreacion; 
		this.limiteDescubierto = limiteDescubierto;
	}
	
}
