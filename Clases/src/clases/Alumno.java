package clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class Alumno {
	
	public static final int MAX_ALUMNOS_CENTRO = 360;
	public static final byte MAX_ALUMNOS_GRUPO = 30;
	public static final byte MIN_ALUMNOS_GRUPO = 1;
	private static short numeroAlumnos;
	
	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNaciminiento;
	private float peso;
	private float altura;
	
	
	
	private byte numHermanos;
	

	
	
	
	public Alumno(String dniP, String nombreP, String apellidosP, LocalDate fechaNacimientoP, float pesoP
			, float alturaP, byte numHermanosP ) throws IllegalArgumentException {
		
		if(dniP == null || nombreP == null || apellidosP == null||fechaNacimientoP == null || pesoP <= 0 || alturaP <= 0 || numHermanosP < 0 ) {
			 throw new IllegalArgumentException ("alguno de los parámetros de entrada es null");
		}else if(dniP.isEmpty() || nombreP.isEmpty() || apellidosP.isEmpty()) {
			 throw new IllegalArgumentException ("alguno de los parámetros de entrada esta vacio");
		}else if (dniMatch(dniP)) {
			 throw new IllegalArgumentException ("El DNI esta mal");
		}
		
		
		
		// No es necesario el uso de this. si el atributo se diferencia.
		this.dni = dniP;
		this.nombre = nombreP;
		this.apellidos = apellidosP;
		this.fechaNaciminiento = fechaNacimientoP;
		this.peso = pesoP;
		this.altura = alturaP;
		this.numHermanos = numHermanosP;
		
		
		Alumno.numeroAlumnos++;
	}
	
	public static boolean dniMatch (String dni) {
		
		if (!dni.matches("\\d(8)[A-ZA-z]")){
			return true;
		}else {
			return false;
		}
		
		
	}
}
