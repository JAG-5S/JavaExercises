package ejercicio2;



import libtarea3.*;
import java.time.DateTimeException;
import java.time.LocalDate;

public class Ejercicio2 {

	public static void main(String[] args) {
		 
		 //1
		 //1.1
		 System.out.printf("Numero de Dados Totales: %d%n", Dado.getNumeroDadosCreados() );
		 //1.2
		 System.out.printf("Numero de Dados Totales: %d%n", Dado.getNumeroLanzamientosGlobal() );
		 //1.3
		 System.out.printf("Numero de Dados Totales: %d%n", Dado.getNumeroVecesCaraGlobal(0) );
		 
		 //2
		 int caras;
		 
		 for(int i = 0; i<10;i++) {
			caras=((int) (Math.random()*9));
			System.out.print("");
			try {
				Dado dadoPrime = new Dado(caras);
				
			}catch (IllegalArgumentException ex2){
				System.out.print("");
			}
		 }
		 
		 
		 

	}

}
