package bombilla;

public class Bombilla {

    public static final boolean DEFAULT_ESTADO_INICIAL = false;		//

    private static int bombillasPrendidas = 0;		//
    private static int numBombillasCreadas = 0;		//

    private boolean estado;
    private int numVecesPrendida;

    //Bombilla sin parametros
    public Bombilla() {
        this(DEFAULT_ESTADO_INICIAL);
    }

    //Bombilla Con parametros
    public Bombilla(boolean estadoInicial) {
        this.estado = estadoInicial;

        if (estadoInicial) {
            numVecesPrendida++;
            bombillasPrendidas++;
        }

        numBombillasCreadas++;
    }

    
    public boolean getEstado() {
        return this.estado;
    }

    //Enciende la bombilla
    public void encender() throws IllegalStateException{
        if (this.estado) {
            throw new IllegalStateException("Ya esta encendida");
        }
        this.estado = true;
        this.numVecesPrendida++;
        bombillasPrendidas++;
    }

    //Apaga la Bombilla
    public void apagar() throws IllegalStateException {
        if (!this.estado) {
        	throw new IllegalStateException("Ya esta Apagado");
        }
        this.estado = false;
        bombillasPrendidas--;
    }
    
    public void conmutar() {
    	if (this.estado) {
    		apagar();
    	}else {
    		encender();
    	}
    	
    }

    //Muestra el estado
    public String toString() {
    	String cadena;
    	
        cadena = "Estado: " + (estado ? "Encendido" : "Apagado") + ". Se ha encendido " + numVecesPrendida + " veces.";
        return cadena;
    }

    public static int getBombillasPrendidas() {
        return bombillasPrendidas;
    }

    public static int getNumBombillasCreadas() {
        return numBombillasCreadas;
    }
}
