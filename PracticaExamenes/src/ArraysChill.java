
public class ArraysChill {
	
	static  String[] municipios = {"MIJAS", "JUBRIQUE", "PUJERRA", "OJEN", "MÁLAGA", "RONDA", "COÍN", "TORROX", "ARDALES", "MARBELLA"};
	
	static int[][] nacimientos= {{0, 31, 1, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 33, 42, 22
	},{24, 56, 7, 0, 0, 0, 0, 0, 0, 0, 2, 12, 2, 10, 30, 29},{17, 22, 5, 0, 0, 0, 0, 0, 0, 1, 2, 9, 1, 13, 36, 32},
	{2, 41, 2, 0, 0, 0, 0, 0, 0, 0, 1, 7, 0, 11, 13, 32},{0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 11, 58, 3},
	{18, 8, 2, 0, 0, 0, 0, 0, 0, 0, 0, 11, 1, 7, 50, 36},{1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 17, 35, 64},
	{7, 3, 1, 0, 0, 0, 0, 0, 0, 0, 5, 7, 0, 26, 23, 0},{3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 4, 7, 130, 43},
	{4, 33, 1, 0, 0, 0, 0, 0, 0, 0, 4, 2, 0, 10, 20, 31}};

	public static void main(String[] args) {
		
		
		diaMunicipio();
		

	}
	
	static void diaMasNacimientos() {
		
		for(int i= 0; i<nacimientos.length;i++) {
			int max = nacimientos[i][0];
			int dia = 16;
			for(int b=0;b<nacimientos[i].length;b++) {
				if (nacimientos[i][b] > max) {
					max = nacimientos[i][b];
					dia = 16+b;
				}
				
			}
			System.out.println();
			System.out.print(municipios[i]+" Numero de nacidos: " + max + " Dia:"+ dia);
		}
		
	}
	
	static void diaMunicipio() {
		for(int i=0;i<nacimientos[0].length;i++) {
			int max = nacimientos[0][i];
			int pos = 0;
			for(int b=1;b<nacimientos.length;b++) {
				if(nacimientos[b][i] > max) {
					max = nacimientos[b][i];
					pos = b;
				}
			}
			System.out.println("dia: "+(16+i)+": "+municipios[pos]);
			System.out.println();
		}
		
	}
	
	static void masNacimientosConjunto() {
		int maxTotal = 0;
		int diaMax = 16;
		for(int i=0;i<nacimientos[0].length;i++) {
			int suma = 0;
			for(int b=1;b<nacimientos.length;b++) {
				suma += nacimientos[0][i];
			}
			if ( maxTotal < suma ) {
				maxTotal = suma;
				diaMax += i;
			}
			
			System.out.println("El dia con mas nacimientos es: "+diaMax);
			System.out.println();
		}
		
	}
	
	static void 
		
}


