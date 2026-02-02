package cancion;

public class CD {
	
	private Cancion[] canciones;
	private int contador;	
	
	// Constructor sin parametros
	public CD() {
		
		this.canciones = new Cancion[10];
		contador = 0;
	}
	
	// Constructor Copia
	public CD(CD otroCD) {
		this.canciones = new Cancion[otroCD.canciones.length]; 
		for (int i = 0; i < otroCD.contador; i++) { 
			this.canciones[i] = otroCD.canciones[i];	//ERROR GRAVE, LOS PUNTEROS APUNTAN AL MISMO SITIO. NO SE ESTA CREANDO UNA COPIA
			} 
		this.contador = otroCD.contador;
		}
	
	//Entrega el numero de canciones
	public int numeroCanciones() { 
		return contador; 
		}
	
	//Entrega la Cancion en la posicion X
	public Cancion dameCancion(int posicion)throws IndexOutOfBoundsException {
		if (posicion < 0 || posicion >= contador) { 
			throw new IndexOutOfBoundsException("Posición no válida."); //Deberia ser illegal Argument Exception, Ya que se esta comprobando parametros...
			}
		return this.canciones[posicion];
	}
	
	//Graba cancion en posicion X
	public void grabaCancion(int posicion, Cancion nuevaCancion) {
		if (posicion < 0 || posicion >= contador) { 
			throw new IndexOutOfBoundsException("Posición no válida.");  //Deberia ser illegal Argument Exception, Ya que se esta comprobando parametros...
			}
		canciones[posicion] = nuevaCancion;
	}

	//Agrega cancion en el espacio libre
	public void agrega(Cancion nuevaCancion) {
		if (contador >= canciones.length) { 
			throw new IllegalStateException("El CD está lleno."); 
			} 
		canciones[contador] = nuevaCancion; 
		contador++;
		}
	
	
	//Elimina una cancion
	public void elimina(int posicion) {
		if (posicion < 0 || posicion >= contador) { 
			throw new IndexOutOfBoundsException("Posición no válida."); //Deberia ser illegal Argument Exception, Ya que se esta comprobando parametros..
			}
		for (int i = posicion; i < contador - 1; i++) {
			canciones[i] = canciones[i + 1]; 
			} 
		//canciones[contador - 1] = null; 		//solo se debe eliminar mediante contador
		contador--;
	}
	
	
	
	public String toString() { 
		String resultado = ""; 
		for (int i = 0; i < contador; i++) { 
			resultado = resultado + i + ": " + canciones[i] + "\n"; 
			} 
		return resultado;
		}
	
}

