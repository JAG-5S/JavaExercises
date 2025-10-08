/*
 * Descripcion: Realiza una Lista con los tamaños (PEQUEÑo, GRANDE, MEDIANO, EXTRA_GRADE) Asignales un valor y muestra por pantalla.
 * Autor: Joaquin Grippi
 * Fecha: 25/09/25
 */


package ejercicio4;


public class Ejercicio4 {
	
	public enum Tamaños {PEQUEÑO, MEDIANO, GRANDE, EXTRA_GRANDE};
	
	public static void main(String[] args) {
		
		Tamaños talla1 = Tamaños.PEQUEÑO ;
        Tamaños talla2 = Tamaños.MEDIANO ;
        Tamaños talla3 = Tamaños.GRANDE ;
        Tamaños talla4 = Tamaños.EXTRA_GRANDE ;
        
        System.out.println("El tamaño de la bebida es: " + talla1 );
        System.out.println("El tamaño de la ropa es: " + talla2 );
        System.out.println("El tamaño de mi corazon es: " + talla3 );
        System.out.println("El tamaño de mi perro es: " + talla4 );
		
		
		
		

	}

}
