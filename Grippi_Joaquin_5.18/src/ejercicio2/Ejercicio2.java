package ejercicio2;
import libtarea3.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		
		//1. Intento de creacion de objeto Bombom
		//1.1
		try {
			Bombo bo1error = new Bombo(-2);
		}catch (IllegalArgumentException ex1) {
			System.out.printf("Error al crear el bombom 1: %s%n", ex1.getMessage());
		}
		//1.1.2 
		try {
			Bombo bo2error = new Bombo(91);
		}catch (IllegalArgumentException ex1) {
			System.out.printf("Error al crear el bombom 1: %s%n", ex1.getMessage());
		}
		//1.2 Creando Bombos Validos
		//1.2.1
		Bombo b1 = new Bombo();
		//1.2.2
		Bombo b2 = new Bombo(15);
		//1.2.3
		System.out.printf("\nEl estado actual del Bombo: " + b2.getCapacidad());
		System.out.printf("\nBolas extraidas del Bombo: " + b2.getBolasExtraidas());
		System.out.printf("\nBolas restantes del Bombo: " + b2.getBolasRestantes());
		
		System.out.println("\n");
		//2 Prueba de Extaccion
		
		//2.1
		for (int i = 0; i < 15; i++) {
			
			System.out.printf("\nBolas extraidas del Bombo: " + b2.extraerBola());
		}
		
		System.out.println("\n");
		System.out.printf("\nEl estado actual del Bombo: " + b2.getCapacidad());
		System.out.printf("\nBolas extraidas del Bombo: " + b2.getBolasExtraidas());
		System.out.printf("\nBolas restantes del Bombo: " + b2.getBolasRestantes());
		
		//2.2
		b2.reset();
		
		//2.3
		for (int i = 0; i < 15; i++) {
				int bolaExtraida = b2.extraerBola();
			
				if(bolaExtraida > 11 || bolaExtraida < 14) {
						System.out.print("\nLas Bolas Extraidas son" + bolaExtraida);
				}else {
					
				}
			}
		
		
	}

}
