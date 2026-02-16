package astros;

public class Satelites extends Astros {
	
	private double distanciaPlaneta;
	private int orbitaPlanetaria;
	private Planetas planetaAlquePertenece;
	
	public Satelites(double radioEcutorial, double rotacionSobreSuEje, double masa
			, double temperaturaMedia, double gravedad, double distanciaPlaneta, int orbitaPlanetaria, Planetas planetaAlQuePertenece) {
		super(radioEcutorial, rotacionSobreSuEje, masa, temperaturaMedia, gravedad);
		
		this.distanciaPlaneta = distanciaPlaneta;
		this.orbitaPlanetaria = orbitaPlanetaria;
		this.planetaAlquePertenece = planetaAlQuePertenece;
	}
	
	/**
	 * @return the distanciaPlaneta
	 */
	protected double getDistanciaPlaneta() {
		return distanciaPlaneta;
	}

	/**
	 * @param distanciaPlaneta the distanciaPlaneta to set
	 */
	protected void setDistanciaPlaneta(double distanciaPlaneta) {
		this.distanciaPlaneta = distanciaPlaneta;
	}

	/**
	 * @return the orbitaPlanetaria
	 */
	protected int getOrbitaPlanetaria() {
		return orbitaPlanetaria;
	}

	/**
	 * @param orbitaPlanetaria the orbitaPlanetaria to set
	 */
	protected void setOrbitaPlanetaria(int orbitaPlanetaria) {
		this.orbitaPlanetaria = orbitaPlanetaria;
	}

	/**
	 * @return the planetaAlquePertenece
	 */
	protected Planetas getPlanetaAlquePertenece() {
		return planetaAlquePertenece;
	}

	/**
	 * @param planetaAlquePertenece the planetaAlquePertenece to set
	 */
	protected void setPlanetaAlquePertenece(Planetas planetaAlquePertenece) {
		this.planetaAlquePertenece = planetaAlquePertenece;
	}

	@Override
	public String muestra() {
		return super.muestra() + "Satelites [distanciaPlaneta=" + distanciaPlaneta + ", orbitaPlanetaria=" + orbitaPlanetaria
				+ ", planetaAlquePertenece=" + planetaAlquePertenece + "]";
	}

	
	
}
