/*
 * Autor: Joaquin Grippi
 * Fecha: 10/12/25
 * Descripcion: Ejercicio1 del 5.17
 */
package ejercicio;

import libtarea3.Dado;

public class Ejercicio1 {

	public static void main(String[] args) {
	       	//1 
	        int maxPuntos = (int)(Math.random() * (31)) + 30;
	        System.out.println("Numero maximo de puntos: " + maxPuntos);
	        
	        //2  creo los dados
	        Dado dado1 = new Dado(6);
	        Dado dado2 = new Dado(6);
	        Dado dado3 = new Dado(6);

	        int sumaTotal = 0;
	        //En un try catch no poner valores Repetidos, colocar los valores por defecto.
	        int ultimoDado1 = 0;
	        int ultimoDado2 = 0;
	        int ultimoDado3 = 0;

	        System.out.println("\nLanzamientos:");

	        //3 Apuntes personales:  Lanzo los dados, se Podia hacer con un array de manera que usamos el getNumeroLanzamientos(). Array Bidimensional.
	        boolean contadorBucle = false;
	        int sumaFTotal =0;
	        while (sumaFTotal < maxPuntos) {
	        	
	        	try {
	        		ultimoDado1 = dado1.lanzar();
	        		ultimoDado2 = dado2.lanzar();
	        		ultimoDado3 = dado3.lanzar();
	        	} catch (IllegalArgumentException Ex1) {
	        		System.out.print("Error al lanzar los dados");
	        	}
	            int sumaLanzamiento = ultimoDado1 + ultimoDado2 + ultimoDado3;

	            //Si la suma total supera el max no se hace nada mas
	            if (sumaTotal + sumaLanzamiento > maxPuntos) {
	            	sumaFTotal = sumaTotal;
	            	sumaFTotal += sumaLanzamiento;
	            }else {
	            	sumaTotal += sumaLanzamiento;
	            	System.out.println("Dado1: " + ultimoDado1 + " | Dado2: " + ultimoDado2 + " | Dado3: " + ultimoDado3 + " | Suma acumulada: " + sumaTotal);
	            }
	        }

	        //4. Determino el dado ganador
	        Dado ganador = dado1;
	        // Apuntes personales: Combinar dado 1 con tipo int para decir que es ganador.
	        int puntosGanador = ultimoDado1;
	        
	        if (ultimoDado2 > puntosGanador) {
	            ganador = dado2;
	            puntosGanador = ultimoDado2;
	        }
	        if(ultimoDado3 > puntosGanador){
	            ganador = dado3;
	            puntosGanador = ultimoDado3;
	        }

	        //5
	        System.out.println("\n--- RESULTADOS FINALES ---");
	        System.out.println("Suma total de puntuaciones: " + sumaTotal);
	        System.out.println("Dado ganador: Dado" + ganador.toString());
	        System.out.println("Puntos obtenidos en el último lanzamiento: " + puntosGanador);
	        System.out.println("Numero de veces que ha salido la puntuacion del dado ganador: " + ganador.getNumeroVecesCara(puntosGanador));
	        System.out.println("Numero total de lanzamientos entre todos los dados: " + Dado.getNumeroLanzamientosGlobal());
	        System.out.println("Serie historica de lanzamientos del dado ganador: " + ganador.getSerieHistoricaLanzamientos());
	    }

	}

