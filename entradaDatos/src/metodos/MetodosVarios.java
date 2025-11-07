package metodos;

public class MetodosVarios {

	public static void main(String[] args) {
		boolean par;
		par = esPar(7);
		System.out.println(par + " " + esPar(8) + " " + esImPar(8));

	}
	
	//Calcula si numero es par devolviendo un valor booleano.
	public static boolean esPar (int numero) {
		boolean par;
		if (numero%2 == 0) {
			par = true;
		}else {
			par = false;
		}
		return par;
		
	}
	
	public static boolean esImPar (int numero) {
		boolean par;
		return !esPar(numero);
		
	}

}
