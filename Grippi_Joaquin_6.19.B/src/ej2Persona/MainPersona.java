package ej2Persona;


public class MainPersona {

	public static void main(String[] args) {
		
		Persona pe1 = new Persona("1234Z","PEPE","PELON",18);
		Persona pe2 = new Persona("1234E", "ELENA","Maria",20);
		
		
		
		Persona.mostrarDatos(pe1);
		System.out.println();
		Persona.mostrarDatos(pe2);
		
		
		

	}
}
