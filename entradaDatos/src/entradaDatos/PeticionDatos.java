package entradaDatos;

import java.util.Scanner;

public class PeticionDatos {
	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int edadAlumno;
		
		System.out.print("Introduce la edad del Alumno: ");
		edadAlumno = teclado.nextInt();
		
		System.out.println("La edad del Alumno es: " + edadAlumno);
		
		teclado.nextLine(); //Despuesd e pedir valro numerico y antes de pedir cadena de caracteres
		
		String nombreAlumno ;
		System.out.print("introduce el nombre del alumno: ");
		nombreAlumno = teclado.nextLine();
		System.out.println("El nombre del alumno es: " + nombreAlumno);
		
		
		double peso;
		System.out.print("introduce tu peso: ");
		peso = teclado.nextDouble();
		System.out.println("Tu peso es: " + peso);
		
		
	}

}
