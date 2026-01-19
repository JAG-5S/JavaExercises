/*
 * AUTOR: JOAQUIN GRIPPI.
 * FECHA: 11/12/25
 * DESCRIPCION: EJERCICIOS 5.17 - 1.2 DIA DE CUMPLEAÑOS. 
 * PARA GITHUB: ---->
 * COSAS POR COMPLETAR: FORMATER. 
 */
package ejercicio2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int anyo = 0;
		int anyoActual = LocalDate.now().getYear();
		boolean error = false;
		
		//1 --------------EL AÑO
		System.out.print("Introduce un año entre 1900 y el año actual: ");
		do {
			try {
				error = false;
				anyo = teclado.nextInt();
				while(anyo < 1900 || anyo > anyoActual) {
					System.out.print("El Año debe estar entre 1900 y el actual: ");
					anyo = teclado.nextInt();
				}
				
			}catch (InputMismatchException ex1) {
				error = true;
				System.out.print("La fecha introducida debe ser un entero: ");
				teclado.nextLine();
			}
		}while(error == true);
		//2 --------------------EL MES
		
		int mes = 0;
		System.out.print("Introduce el mes de nacimient (entre 1 y 12): ");
		do {
			try {
				error = false;
				mes = teclado.nextInt();
				while(mes < 1 || mes > 12) {
					System.out.print("El mes debe estar entre 1 y 12: ");
					mes = teclado.nextInt();
				}
				
			}catch (InputMismatchException ex1) {
				error = true;
				System.out.print("La fecha introducida debe ser un entero: ");
				teclado.nextLine();
			}
		}while(error == true);
		//3.1-----------------EL DIA
		//Esta liena de codigo comprueba cuantos dias tiene el mes de ese año
		
		YearMonth yearMonth = YearMonth.of(anyo, mes); 
		int diasDelMes = yearMonth.lengthOfMonth();  // Devuelve los dias 
		System.out.println(diasDelMes); // Compruebo si funciona
		
		//3.2-------------------------EL DIA
		
		int dia = 0;
		System.out.print("Introduce un dia, debe estar entre 1 y " + diasDelMes + ": ");
		do {
			try {
				error = false;
				dia = teclado.nextInt();
				while(dia < 1 || dia > diasDelMes) {
					System.out.print("El dia debe estar entre 1 y " + diasDelMes + ": ");
					dia = teclado.nextInt();
				}
				
			}catch (InputMismatchException ex1) {
				error = true;
				System.out.print("La fecha introducida debe ser un entero: ");
				teclado.nextLine();
			}
		}while(error == true);
		
		// Crear una fecha con los datos obtenidos.
        LocalDate fecha = LocalDate.of(anyo, mes, dia);
        
        // Obtener el día de la semana
        DayOfWeek diaSemana = fecha.getDayOfWeek();
        System.out.println("El día de la semana es: " + diaSemana.getDisplayName(TextStyle.FULL, new Locale("es", "ES"))); 
        
        //4------------LA REPETICION DEL DIA DE CUMPLEAÑOS
        System.out.print("Cuantas veces tu cumpleaños a caido un dia " + diaSemana.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));
        for(int i = anyo; i< anyoActual; i++ ) {
        	try {
        		LocalDate fechas = LocalDate.of(i, mes, dia);
        		DayOfWeek diaIgual = fechas.getDayOfWeek();
        		if (diaIgual == diaSemana) {
        			System.out.println("\nEn la fecha: " + fechas + fechas.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es", "ES")));
        		}
        		}catch (java.time.DateTimeException ex2 ) {
        		System.out.print("\n" + ex2.getMessage());
        	}
        	
        }
		

		
		
	}

}
