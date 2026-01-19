/*
 * Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta
que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A
partir de la hora 41, se pagan a 16 euros la hora.
 * 
 */
package eje1;

import java.util.Scanner;
public class Eje1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int horasTrabajadas, salario=0;
		
		System.out.print("Introduce las horas trabajadas: ");
		horasTrabajadas = teclado.nextInt();
		while(horasTrabajadas <= 0) {
			System.out.print("Las horas Trabajadas no pueden ser negativas ni cero"+"\nIntroduce de nuevo las horas: ");
			horasTrabajadas = teclado.nextInt();
		}
		
		for (int i = 0; i < horasTrabajadas; i++) {
			if (i < 40) {
				salario += 12;
			} else {
				salario += 16;
			}
		}
		
		System.out.print("El salario semanal del trabajador es: " + salario);
		

	}

}
