package ejercicio10;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nota = 0, notaDiez=0;
		System.out.println("Para dejar de introducir notas introduzca -1");
		while(nota != -1 ) {
			System.out.print("Introduce una nota: ");
			nota = teclado.nextInt();
				if (nota == 10) {
					notaDiez++;
				} else if (nota < -1 || nota > 10) {
					System.out.println("Las notas deben ser entre 0 y diez");
				}
		}
		if (notaDiez > 0) {
			System.out.println("Si hubo notas de 10");
		}else {
			System.out.println("No hubo notas de 10");
		}
	}

}
