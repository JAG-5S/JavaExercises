package ejercicio3;

import libtarea3.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		LocalTime horario = LocalTime.of(8, 0);
		
		
		
		boolean error = false;
		int hora;
		do {
			try {
				error = false;
				System.out.printf("Ingreasa una hora entre las 00 y las 23: ");
				hora = teclado.nextInt();
				while(hora < 0 || hora > 23) {
					System.out.printf("Debes ingresar una hora entre las 00 y las 23: ");
					hora = teclado.nextInt();
				}
			}catch(InputMismatchException exTipoDiferente){
				System.out.println("Te has equivocado. Dame un entero");
				error = true;
				teclado.nextLine();
				hora = 0;
			}
			
		}while(error == true);
		
		int minuto;
		
		do {
			try {
				error = false;
				System.out.printf("Ingreasa los minutos de la hora(00 a 59): ");
				minuto = teclado.nextInt();
				while(minuto < 0 || minuto > 59) {
					System.out.printf("Debes ingresar los minutos indicados: ");
					minuto = teclado.nextInt();
				}
			}catch(InputMismatchException exTipoDiferente){
				System.out.println("Te has equivocado. Dame un entero");
				error = true;
				teclado.nextLine();
				minuto = 0;
			}
			
		}while(error == true);
		
		
		

	}
	

}
