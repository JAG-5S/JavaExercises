package cancion;

public class Cancion {
	
	public static final String SIN_TITULO = "El lazarillo de Tormes";
	public static final String SIN_AUTOR = "SAUROM";
	
	private String titulo;
	private String autor;
	
	public Cancion(String titulo, String autor) throws IllegalArgumentException {
		if(titulo == null||autor == null) {
			throw new IllegalArgumentException ("los parametros no pueden estar vacios o invalidos");
		}
		
		this.titulo = titulo;
		this.autor = autor;
		
	}
	
	public Cancion() {
		this (SIN_TITULO , SIN_AUTOR);
		
		//this.titulo = SIN_TITULO; NO ES NECESARIO
		//this.autor = SIN_AUTOR;
	}
	
	public Cancion(Cancion copia) {
		this (copia.titulo, copia.autor);
		
		//this.titulo = copia.titulo; ESTO SOBRA TAMBIEN
		//this.autor = copia.autor;
	}
	
	//METODOS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		// DEBE LANZAR EXEPCION NO PUEDE SER NULL
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		// DEBE LANZAR EXEPCION NO PUEDE SER NULL
		this.autor = autor;
	}
	
	public String toString() {
		 return "Titulo: " + this.titulo + " Autor: " + this.autor;
	}

	

}
