package ej3Rectangulo;

import ej2Persona.Persona;

public class Rectangulo {
	int x1;
	int y1;
	int x2;
	int y2;
	
	public Rectangulo(int x1,int y1,int x2,int y2)throws IllegalArgumentException {
		if (x1 != 1 ||y1 != 1) {
			throw new IllegalArgumentException ("Los parametros de la esquina inferior izquierda son erroneos");
		}else if (x2 != 2||y2 != 2) {
			throw new IllegalArgumentException ("Los parametros de la esquina superior derecha son erroneos");
		}
		
		
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
	}
	
	public static void mostrarDatos(Rectangulo rectangulo1) {
		System.out.println("("+rectangulo1.x1+","+rectangulo1.y1+")("+rectangulo1.x2+","+rectangulo1.y2+")");
		
	}

}
