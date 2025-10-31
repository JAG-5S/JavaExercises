package ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int anyos = 0, anyosC = 0, anyoActual = 2005, contador = 0;
		String siglo ;
		
			
			while(anyosC != 1 ) {
				System.out.print("Introduce un año entre 1801 y 2100: ");
				anyos = teclado.nextInt();
					if (anyos >= 1801 && anyos <= 2100 ) {
						anyosC++;
						System.out.println("EL año si es valido");
					} else if (anyos < 1801 || anyos > 2100) {
						System.out.println("EL año no es valido");
					}
			}
			if (anyos >= 1801 && anyos <= 1901) {
				siglo = "XIX";
			}else if (anyos >= 1902 && anyos <= 2000){
				siglo = "XX";
			}else { siglo = " XXI"; }
			if (anyos < anyoActual) {
				for (int i = anyos; i > anyoActual; i++ ) {
					contador ++;
				}
				System.out.println("El año introducido es anterior al actual. Han pasado " + contador + " años");
				System.out.println("El año pertenece al siglo " + siglo);
			}else {
				for (int i = anyos; i < anyoActual; i-- ) {
					contador ++;
				}
				System.out.println("El año introducido es Posterior al actual. Han pasado " + contador + " años");
				System.out.println("El año pertenece al siglo" + siglo);
			}
			
			
			
		}

	}


