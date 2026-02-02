package grippi2;

import java.time.LocalDate;

import libtarea3.*;

public class Ejercicio2 {
	
	

	public static void main(String[] args) {
		

		CuentaBancaria[] cuentas= new CuentaBancaria[10];
		
		for(int i=0;i<10;i++) {
			int anyo = anyoAleatorio();
			LocalDate fechaDeCreacion = LocalDate.of(anyo, 9, 1);
			cuentas[i] = new CuentaBancaria(anyo, fechaDeCreacion) ;
		}
		
		for(int i=0;i<10;i++) {
			System.out.printf("La Cuenta numero "+i+"Tiene un saldo de "+cuentas[i].getSaldo()+" Tiene una fecha de creacion de: " + cuentas[i].getFechaCreacion() );
		}
		
		
		
		for(int i=0;i<10;i++) {
			double num;
			double max = 0;
			num = cuentas[i].getSaldo();
			if (num > max) {
				max = num;
			}
		}
		
		
	}

	public static int anyoAleatorio() {
		int numAle;
		numAle = 100*((int)Math.random()*21);
		return numAle;
	}
	
	
	
}
