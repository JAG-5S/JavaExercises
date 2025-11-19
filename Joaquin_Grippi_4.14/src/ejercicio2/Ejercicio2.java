package ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int edad;
		System.out.print("Introduce tu edad: ");
		edad = teclado.nextInt();
		
		boolean esMayor = esMayorEdad(edad);
		
		System.out.print("Es mayor de edad: " + esMayor);
		
	}
	
	public static boolean esMayorEdad(int a) {
		boolean mayoria;
		if (a >= 18) {
			mayoria = true;
		} else {
			mayoria = false;
		}
		
		return mayoria;
		
	}

}
