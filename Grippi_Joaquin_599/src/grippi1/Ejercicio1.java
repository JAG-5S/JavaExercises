package grippi1;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String[] meses = {"Ene","Feb","Mar","Abr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dic"};
		String[] sucursales = {"Malaga", "Sevilla", "Granada"};
		int[][] ventas = new int[3][12];
		
		for(int i=0;i<3;i++) {
			for(int b=0;b<12;b++) {
				ventas[i][b]= 500*(int)(Math.random() * 40);
			}
		}
		
		mostrarInforme(ventas, sucursales, meses);
		int totalAnual = totalAnual(ventas);
		System.out.println("El Total anual es: "+totalAnual);
		mejorMes(ventas, sucursales, meses);
		mejorAño(ventas, sucursales);
	}
	
		//Total anual
	public static int totalAnual(int[][] ingresos) {
		int maxTotal=0;
		for(int i=0;i<3;i++) {
			for(int b=0;b<12;b++) {
				maxTotal += ingresos[i][b];
			}
		}
		return maxTotal;
	}
	
		//Que sucursal Tuvo el mejor mes
	public static void mejorMes(int[][] ingresos, String[] sucursales, String[] meses) {
		int s1=0,s2=0,s3=0;
		for(int i=0;i<3;i++) {
			for(int b=0;b<12;b++) {
				if(i == 0) {
					s1 += ingresos[i][b];
				}else if(i == 1) {
					s2 += ingresos[i][b];
				}else if(i == 2) {
					s1 += ingresos[i][b];
				}
			}
			if(s1 > s2 ) {
				if(s1 > s3) {
					System.out.println("La sucursal con mas ventas del mes de: "+meses[i]+"Es la sucursal de: "+sucursales[0]+" Con un total de: "+s1);
				}
			}else if(s2 > s1) {
				if(s2 > s3) {
					System.out.println("La sucursal con mas ventas del mes de: "+meses[i]+"Es la sucursal de: "+sucursales[1]+" Con un total de: "+s2);
				}
			}else {
				System.out.println("La sucursal con mas ventas del mes de: "+meses[i]+"Es la sucursal de: "+sucursales[2]+" Con un total de: "+s3);
			}
			
		}
		
	}
		//Muestra informacion de la cuenta
	public static void mostrarInforme(int[][] ingresos, String[] sucursales, String[] meses) {
		for(int i=0;i<12;i++) {
			System.out.print(meses[i]+" ");
		}
		System.out.println();
		for(int i=0;i<3;i++) {
			System.out.print(sucursales[i]);
			for(int b=0;b<12;b++) {
				System.out.print(ingresos[i][b]+" ");
			}
			System.out.println();
		}
		
	}
	
	
	
	
		//Que sucursal tuvo el mejor año
	public static void mejorAño(int[][] ingresos, String[] sucursales) {	
		
		int s1=0,s2=0,s3=0;
		for(int i=0;i<3;i++) {
			for(int b=0;b<12;b++) {
				if(i == 0) {
					s1 += ingresos[i][b];
				}else if(i == 1) {
					s2 += ingresos[i][b];
				}else if(i == 2) {
					s1 += ingresos[i][b];
				}
			}
		}
		if(s1 > s2 ) {
			if(s1 > s3) {
				System.out.println("La sucursal con mas ventas acumuladas es: "+sucursales[0]+" Con un total de: "+s1);
			}
		}else if(s2 > s1) {
			if(s2 > s3) {
				System.out.println("La sucursal con mas ventas acumuladas es: "+sucursales[1]+" Con un total de: "+s2);
			}
		}else {
			System.out.println("La sucursal con mas ventas acumuladas es: "+sucursales[2]+" Con un total de: "+s3);
		}
	}
	
	

}
