/*
 * Objetivo: mostrar el desarrollo de las clases creadas
 * Fecha: 
 * Autor: 
 */
package viviendasTuristicas;

import java.time.LocalDate;
import java.util.Scanner;

public class PrincipalViviendaTuristica {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// 1. Crea un apartamento con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos
		System.out.println (" 1 ============");	
		Apartamento apartamento1 = new Apartamento();
		
		System.out.println (apartamento1.toString());

		
		//2. Calcula el precio para una estancia de 3 días.
		// Evidencia: el precio de la estancia.
		System.out.println (" 2 ============");
		System.out.println("Introduce el precio por noche: ");
		int precioNoche1 = teclado.nextInt();
		System.out.println ("El precio de una estancia de 3 dias es" + apartamento1.calcularPrecio(3));		

		
		//3. Crea un apartamento con precio por noche (valor solicitado al usuario) y distancia al centro (solicitado al usuario). Resto de valores por defecto.
		// Evidencia. El valor de cada uno de los atributos
		System.out.println (" 3 ============");	
		Apartamento apartamento2 = new Apartamento(LocalDate.of(2000, 05, 15), "Calle Pepe", precioNoche1, true, 2, 3000, LocalDate.of(2000, 05, 28) );
		System.out.println (apartamento2.toString());		

		
		//4. Calcula el precio para una estancia de 5 días.
		// Evidencia: el precio de la estancia.
		System.out.println (" 4 ============");	
		System.out.println ("El precio de una estancia de 5 dias es" + apartamento2.calcularPrecio(5));	
		
		//5. Crea una casa rural con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 5 ============");	

		
		//6. Crea una casa rural con precio por noche (valor solicitado al usuario) y el resto por defecto.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 6 ============");	

		
		// 7. Calcula el precio de una estancia de 10 días.
		// Evidencia: el precio de la estancia.
		System.out.println (" 7 ============");	

		
		// 8. Modifica la fecha de construcción a 1/1/2023.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 8 ============");	

		

		// 9. Indica si la casa es pet friendly.
		// Evidencia. Indica si es "pet friendly".
		System.out.println (" 9 ============");	

		
		// 10. Crea un hotel con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 10 ============");

		
		// 11. Crea un hotel con todos los valores solicitados al usuario. (el objeto debe ser creado por un método)
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 11 ============");	

		
		//12. Calcula el precio de una estancia de 1 día.
		// Evidencia: el precio de la estancia.
		System.out.println (" 12 ============");	

		
		// 13. Modifica el valor de Spa a sí.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 13 ============");	

		
		// 14. Calcula el precio de una estancia de 1 día.
		// Evidencia: el precio de la estancia.
		System.out.println (" 14 ============");	

		
	
		// 15. Calcula el número de viviendas creadas.
		// Evidencia. El número de viviendas creadas.
		System.out.println (" 15 ============");	
		
		
	}

}
