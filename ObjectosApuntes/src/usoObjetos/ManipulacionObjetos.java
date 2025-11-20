package usoObjetos;

import java.awt.Rectangle;

public class ManipulacionObjetos {

	public static void main(String[] args) {
		Rectangle r1; //Declaracion Objetos
		
		r1 = new Rectangle (); //instanciacion de un objeto
		
		System.out.println(r1.toString());
		
		r1.x = 10;
		
		System.out.println(r1.toString());
		
		r1.add(r1);
		
		System.out.println(r1.toString());
		
	}

}
