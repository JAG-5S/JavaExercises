package dado;

/**
 * 
 * 
 * 
 * 
 */

public class Dado {
	//Atributos Constantes
	public static final byte NUMERO_CARAS_PREDETERMINADO= 6; //numero de caras por predeterminado
	public static final String [] CARAS = { 		//Definimos las caras del dado
		    "UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS",
		    "SIETE", "OCHO", "NUEVE", "DIEZ",
		    "ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE",
		    "DIECISÉIS", "DIECISIETE", "DIECIOCHO", "DIECINUEVE", "VEINTE"
		};
	//Atributos estaticos
	private static int numLanzamientos;		//Contador de numero de lanzamientos
	private static int[] registroCaras;
	//Atributos
	private byte numeroCaras ;	
	
	
	/**
	 * Constructor con 2 parametros
	 * 
	 * @param numeroCaras El numero de caras del dado
	 * @throws IllegalArgumentException Si el numero de caras no coincide con las permitidas
	 */
	Dado (byte numeroCaras)throws IllegalArgumentException {
		if ( numeroCaras != 4 && numeroCaras != 6 && numeroCaras != 8 && numeroCaras != 12 && numeroCaras != 20) {
			throw new IllegalArgumentException("El numero de caras asignadas no es posible");
		}
		this.numeroCaras = numeroCaras;
		registroCaras = new int[numeroCaras];
	}
	
	Dado(){
		this.numeroCaras = NUMERO_CARAS_PREDETERMINADO;
	}
	
	public byte getNumeroCaras () {
		  return (byte)registroCaras.length;
		}
	
	public long getNumeroLanzamientos() {
		  long totalLanzamientos=0;
		  for (int i=0; i<registroCaras.length; i++) {
		    totalLanzamientos += registroCaras[i];
		  }
		  return totalLanzamientos;
	}
	
	public int getNumeroVecesCara (byte cara) throws IllegalArgumentException {
		  if (cara < 1 || cara > this.getNumeroCaras()) {
		    throw new IllegalArgumentException ("numero de cara no válida");
		  }
		  return registroCaras[cara-1];
		}
	
	
	
	/**
	 * Lanzamos uno de los dados
	 * 
	 * @param dado1 el dado que lanzamos
	 * @return
	 */
	
	public static String lanzar(Dado dado1) {
		int caraRamdon = (int)(Math.random() * dado1.numeroCaras);
		numLanzamientos++;
		registroCaras[caraRamdon]++;
		return CARAS[caraRamdon];
		
	}
	
	/**
	 * Devuelve una cadena que representa el estado del dado lanzado. Esa Cadena proporcionara la Siguetne informacion.
	 * <ol>
	 * <li><strong>Numero de caras</strong> del Dado.</li>
	 * <li><strong>Veces lanzado</strong></li>
	 * </ol>
	 * <strong>El formato de salida</strong> será del siguiente tipo: </p>
	 * <pre>Número de caras: xxx. Número de lanzamientos: zzz </pre>
	 * <p>
	 * donde xxx será el número de caras del dado y zzz el número de veces que ha sido lanzado hasta el momento.
	 * Algunos ejemplos de salida podrían ser:
	 * </p>
	 * <pre>numero de caras: 4. Numero de Lanzamientos: 2</pre>
	 * <pre>numero de caras: 88. Numero de Lanzamientos: 4</pre>
	 */
	@Override
	public String toString() {
		 return "numero de caras: " + this.numeroCaras + ". Numero de Lanzamientos:  " + numLanzamientos;
	}
	
}
