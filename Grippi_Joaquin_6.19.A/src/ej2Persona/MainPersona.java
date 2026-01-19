package ej2Persona;
import java.util.Scanner;
public class MainPersona {

	public static void main(String[] args) {
		
			
		Persona pe1 = new Persona();
		Persona pe2 = new Persona();
		
		
		ingresarDatos(pe1);
		mostrarDatos(pe1);
		ingresarDatos(pe2);
		mostrarDatos(pe2);
		
		
		

	}
	
	static void ingresarDatos(Persona persona) {
		System.out.println("Ingresa los datos de la persona: ");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa tu dni: ");
		persona.dni = teclado.nextLine();
		System.out.println("Ingresa tu Nombre: ");
		persona.nombre = teclado.nextLine();
		System.out.println("Ingresa tu apellido: ");
		persona.apellido = teclado.nextLine();
		System.out.println("ingresa tu edad: ");
		persona.edad = teclado.nextInt();
		System.out.println();
	}
	
	static void mostrarDatos(Persona persona) {
		System.out.println("Datos de " + persona.nombre +" "+  persona.apellido);
		System.out.println("EL dni es: " + persona.dni);
		if(persona.edad >= 18) {
			System.out.println("Es mayor de edad: "+ persona.edad);
		}else {
			System.out.println("Es menor de edad: "+ persona.edad);
		}
		System.out.println();

	}
}