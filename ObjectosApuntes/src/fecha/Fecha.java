package fecha;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;

public class Fecha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dia, mes, anyo;
		System.out.println("Ingresa tu fecha de nacimiento: ");
		
		System.out.print("Ingresa el dia: ");
		dia = teclado.nextInt();
		
		System.out.print("Ingresa el mes: ");
		mes = teclado.nextInt();
		
		System.out.print("Ingresa el año: ");
		anyo = teclado.nextInt();
		
		LocalDate fechaDeNacimiento = LocalDate.of(anyo, mes, dia);
		LocalDate actualidad = LocalDate.now();
		
		Period TiempoVivo = Period.between(fechaDeNacimiento, actualidad);
		
		System.out.println(TiempoVivo);
		
		System.out.println("el Dia es: " + fechaDeNacimiento.getDayOfMonth() );
		System.out.println("el Mes es: " + fechaDeNacimiento.getMonth() );
		System.out.println("el Año es: " + fechaDeNacimiento.getYear() );
	}

}
