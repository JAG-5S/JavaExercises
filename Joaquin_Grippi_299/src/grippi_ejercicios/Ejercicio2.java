package grippi_ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		int filas = 2, columnas = 20;
		int [][] matrix= new int [filas][columnas];
		
		int num, sumaPar = 0, media, sumaContador = 0;
		
		//Almacenamos los numeros aleatorios en la Array
		for (int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				num = (int)(1+Math.random()*51);
				matrix[i][j] = num;
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		
		//Calculamos la media de numeros Pares
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<=matrix[i].length;j++) {
				int posicion = i * filas * j;
				if (posicion %2 == 0) {
					sumaPar += posicion; 
					sumaContador++;
					
				}
			}
		}
		media = sumaPar / sumaContador;
		
		//Mostramos los numeros impares inferiores a la media
		System.out.println("La media de los valores pares es: " + media);
		System.out.println("Los valores impares por debajo de la media son: ");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if (matrix[i][j] %2 ==1) {
					if (matrix[i][j] < media) {
						System.out.print(matrix[i][j] + " ");
					}
				}
				
			}
		}
	}

}
