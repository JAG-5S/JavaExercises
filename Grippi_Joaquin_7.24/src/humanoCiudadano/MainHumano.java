package humanoCiudadano;

import java.util.Scanner;

public class MainHumano {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Humano humano1 = new Humano("Perez", "Narigon");
		
		Ciudadano ciudadano1 = new Ciudadano(humano1.nombre, humano1.apellido,"02341FD");
		
		Ciudadano ciudadano2 = new Ciudadano(humano1.nombre, humano1.apellido,"000001FD");

		System.out.println(humano1);
		
		System.out.println(ciudadano1);
		
		System.out.println(ciudadano2);
		
		Humano humano2 = new Humano();
		System.out.println(humano2);
		
		String nombre = teclado.nextLine();
		humano2.setNombre(nombre);
		String apellido = teclado.nextLine();
		humano2.setApellido(apellido);
		
		System.out.println(humano2);
	}

}
