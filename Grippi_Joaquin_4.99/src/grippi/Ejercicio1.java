package grippi;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int [] lunes = {21,26,40,32,32,15,27,15,31,3,20,32,2,18,27,2,40,31,24,37,15,24,10,36};
		int [] martes = {5,25,28,5,10,30,14,6,35,33,29,9,32,15,8,37,15,39,19,30,40,14,18,2};
		int [] miercoles = {39,7,17,14,2,12,34,21,3,40,29,31,1,18,14,9,31,1,6,37,11,5,37,30};
		int [] jueves = {1,12,37,6,7,30,31,3,15,35,2,38,6,30,32,31,2,32,6,14,14,21,21,38};
		int [] viernes = {8,23,37,16,0,28,5,13,35,10,22,18,28,6,12,21,12,38,26,15,39,24,37,4};
		int [] sabado = {28,7,27,5,21,27,37,17,39,8,29,30,22,10,6,32,39,18,34,0,25,35,4,29};
		int [] domingo = {2,16,16,36,33,9,34,23,4,26,14,26,10,11,12,31,27,17,20,12,24,32,11,33};
	
		menorConsumo(lunes, martes, miercoles, jueves, viernes, sabado, domingo);
		menorConsumoHora(lunes, martes, miercoles, jueves, viernes, sabado, domingo);	
		consumoTotal(lunes, martes, miercoles, jueves, viernes, sabado, domingo);
	}

	
	public static void menorConsumo(int a[], int b[], int c[], int d[], int e[], int f[], int g[]) {
		int m12 = 0, m34 = 0,m56 = 0; 
		int menor1 = 0, menor2 = 0, menorF = 0;
		int m1 = 0,m2 = 0,m3 = 0,m4 = 0,m5 = 0,m6 = 0,m7 = 0;
		for(int i=0;i<23;i++) {
			m1 = a[i];
			m2 = b[i];
			m3 = c[i];
			m4 = d[i];
			m5 = e[i];
			m6 = f[i];
			m7 = g[i];
			
			if (m1 < m2) {
				m12 = m1;
			}else {
				m12 = m2;
			}
				
			if (m3 < m4) {
				m34 = m3;
			}else {
				m34 = m4;
			}
			if (m5 < m6) {
				m56 = m5;
			}else {
				m56 = m6;
			}
			
			if(m12 < m34) {
				menor1 = m12;
			}else {
				menor1 = m12;
			}
			if(m56 < m7) {
				menor2 = m56;
			}else {
				menor2 = m7;
			}
			if (menor1 < menor2) {
				menorF = menor1;
			}else {
				menorF = menor2;
			}
			
			
			
			System.out.println("En la hora " + i + " El consumo fue " + menorF);
			
		}
		}
		
		public static void menorConsumoHora(int a[], int b[], int c[], int d[], int e[], int f[], int g[]) {
			int m12 = 0, m34 = 0,m56 = 0; 
			int menor1 = 0, menor2 = 0, menorF = 0;
			int m1 = 0,m2 = 0,m3 = 0,m4 = 0,m5 = 0,m6 = 0,m7 = 0;
			int menorCasiAbsoluto = 2, dia = 0;
			
			for(int i=0;i<23;i++) {
				m1 = a[i];
				m2 = b[i];
				m3 = c[i];
				m4 = d[i];
				m5 = e[i];
				m6 = f[i];
				m7 = g[i];
				
				if (m1 < m2) {
					m12 = m1;
				}else {
					m12 = m2;
				}
					
				if (m3 < m4) {
					m34 = m3;
				}else {
					m34 = m4;
				}
				if (m5 < m6) {
					m56 = m5;
				}else {
					m56 = m6;
				}
				
				if(m12 < m34) {
					menor1 = m12;
				}else {
					menor1 = m12;
				}
				if(m56 < m7) {
					menor2 = m56;
				}else {
					menor2 = m7;
				}
				if (menor1 < menor2) {
					menorF = menor1;
				}else {
					menorF = menor2;
				}
				
				if (menorCasiAbsoluto < menorF) {
					dia = i;
					
				}else {
					menorCasiAbsoluto = menorF;
					dia = i;
				}
				
				
			}
			System.out.println("La hora " + dia + " Tuvo el consumo mas bajo de las semana, fue " + menorCasiAbsoluto);
	}
		public static void consumoTotal(int a[], int b[], int c[], int d[], int e[], int f[], int g[]) {
			
			int m1 = 0,m2 = 0,m3 = 0,m4 = 0,m5 = 0,m6 = 0,m7 = 0;
			int consumoTotal;
			
			for(int i=0;i<23;i++) {
				m1 = a[i];
				m2 = b[i];
				m3 = c[i];
				m4 = d[i];
				m5 = e[i];
				m6 = f[i];
				m7 = g[i];
				

				consumoTotal = m1 + m2 + m3 + m4 + m5 + m6 + m7;
				
			}
			System.out.println("El consumo total fue: " + consumoTotal);
	}
}
