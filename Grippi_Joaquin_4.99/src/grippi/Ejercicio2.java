package grippi;

import libtarea3.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		//1--------------
		double limiteAleatorio = ((int)Math.random()*10)-4000;
		//2----------------
		CuentaBancaria grippi1 ;
		CuentaBancaria grippi2 ;
		CuentaBancaria grippi3 ;
		//3--------------
		try {
		grippi1 = new CuentaBancaria(1000, null, limiteAleatorio);
		}catch(IllegalArgumentException g1) {
			System.out.print("El error es: " + g1.getMessage());
			limiteAleatorio = -2000;
		}
		try {
		grippi2 = new CuentaBancaria(1000, null, limiteAleatorio);
		}catch(IllegalArgumentException g2) {
			System.out.print("El error es: " + g2.getMessage());
			limiteAleatorio = -2000;
		}
		

		try {
		grippi3 = new CuentaBancaria(1000, null,  limiteAleatorio);
		}catch(IllegalArgumentException g3) {
			System.out.print("El error es: " + g3.getMessage());
			limiteAleatorio = -2000;
		}
		
		
		//4-------------------
		double a1 = grippi1.getLimiteDescubierto();
		double a2 = grippi2.getLimiteDescubierto();
		double a3 = grippi3.getLimiteDescubierto();
		if (a1 < a2) {
			if (a1 < a3) {
				System.out.printf("Grippi1 tiene el menos limite descubierto con: %d" + a1);
			}else {
				System.out.printf("Grippi3 tiene el menos limite descubierto con: %d" + a3);
			}
			
		}else if (a2 < a3) {
			System.out.printf("Grippi2 tiene el menos limite descubierto con: %d" + a2);
		}else {
			System.out.printf("Grippi3 tiene el menos limite descubierto con: %d" + a3);
		}
		//5---------------------
		for(int i=0;i<=5;i++) {
			grippi1.transferir(300, grippi2);
			System.out.printf("La cuenta grippi1 tiene un saldo de: %d" + grippi1.getSaldo());
			System.out.printf("La cuenta grippi2 tiene un saldo de: %d" + grippi2.getSaldo());
		}
		//6-------------------
		grippi3.embargar(50);
		System.out.printf("La cuenta grippi3 tiene un saldo de: %d" + grippi3.getSaldo());
		//7----------------
		System.out.printf("El saldo Global es: %s%d" + CuentaBancaria.getSaldoGlobal());
		System.out.printf("El numero de cuentas embargadas es: %s%d" + CuentaBancaria.getNumCuentasEmbargadas());
				
		
		
	}

}
