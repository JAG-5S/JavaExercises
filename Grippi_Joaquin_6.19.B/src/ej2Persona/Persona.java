package ej2Persona;

public class Persona {

	String dni;
	String nombre;
	String apellido;
	int edad;
	
	public Persona(String dni, String nombre, String apellido, int edad){ 
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		
	}
	
	public static void mostrarDatos(Persona persona1) {
		System.out.println("DNI: " + persona1.dni + "\nNombre: "+persona1.nombre+"\nApellido: "+persona1.apellido+"\nEdad: "+persona1.edad);
		
	}
	
}
