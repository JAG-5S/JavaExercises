package ejercicio1;
import java.util.Scanner;
import libtarea3.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		//1
		CuentaBancaria cuentaPrivada = new CuentaBancaria( );

		
		CuentaBancaria cuentaConjunta = new CuentaBancaria();
		
		
		CuentaBancaria cuentaFamiliar = new CuentaBancaria();
		
		//2
		
		
		try {
			double saldoCuenta = -200;
			LocalDate fechaDeCreacion = LocalDate.of(1, 9, 2027);
			CuentaBancaria cuentaErronea = new CuentaBancaria(saldoCuenta, fechaDeCreacion);
		} catch (DateTimeException fechaErronea) {
			System.out.print("Fecha Erronea");
		} 
		
		
		
		
		

	}

}
