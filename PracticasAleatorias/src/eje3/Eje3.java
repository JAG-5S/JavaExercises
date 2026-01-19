/*
 *  Escribe un programa que dada una cantidad de euros que el usuario introduce por teclado
(múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para alcanzar
dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que indicar el
mínimo de billetes posible. 
 */
package eje3;
import java.util.Scanner;
public class Eje3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cantidad en euros (múltiplo de 5): ");
        int euros = sc.nextInt();

        int[] billetes = {500, 200, 100, 50, 20, 10, 5};

        for (int billete : billetes) {
            int cantidad = euros / billete;
            if (cantidad > 0) {
                System.out.println(cantidad + " billete(s) de " + billete + " €");
                euros = euros % billete;
            }
        }

	}

}
