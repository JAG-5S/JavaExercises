package arraysBidimensionales;

public class ArryaisBidemensionales {

	public static void main(String[] args) {
		final int TOTAL_MESES = 12, TOTAL_DIAS = 30;
		
		int diaMaxCalor = 0;
		int diaTemp10;
		
		int[][] temperatura; //declaracion de un arrray bidimensional
		temperatura = new int[TOTAL_MESES][TOTAL_DIAS];
		
		
		for (int mes=0; mes< temperatura.length; mes++) {
			for (int dia=0;dia<temperatura[mes].length;dia++) {
				temperatura[mes][dia] = (int)(Math.random()*40);
					
				
				
			}
		}
		for (int mes=0; mes<temperatura.length; mes++) {
			
			for (int dia=0;dia<temperatura[mes].length;dia++) {
				System.out.print(temperatura[mes][dia]+ "\t");
				}
				System.out.println();
			}
		for (int mes=0; mes<temperatura.length; mes++) {
			int tempMasAlta = temperatura[mes][0]; //cada mes inicializo la temperatura mas alta a la temperatura del primer dia
			for (int dia=1;dia<temperatura[mes].length;dia++) { //Aqui empiezo a comparar temperaturas a partir de la del segundo dia
				if (tempMasAlta < temperatura[mes][dia]) {
					tempMasAlta = temperatura[mes][dia];
					diaMaxCalor = dia;
				}
			}
			System.out.println("el dia " + diaMaxCalor + " hubo " + tempMasAlta);
		}
			//Para Cada mes Mostrar temperaturas inferior a 10 grados
		
		for (int mes=0; mes<temperatura.length; mes++) {
			diaTemp10 = 0;
			do {
				diaTemp10++;
				
			}while(temperatura[mes][diaTemp10] > 10);
			System.out.println("Para el mes " + mes + " el primer dia con menos de 10 grados es: " + diaTemp10);
		
	
		}
	}
}
