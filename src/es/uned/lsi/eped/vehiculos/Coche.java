package es.uned.lsi.eped.vehiculos;

public class Coche extends Vehiculo {

	private int maletero;
	
	public Coche(Combustible combustible, int numAsientos, int maletero) {
		super(4,combustible,numAsientos);
		this.maletero = maletero;
		definirAsiento(0,1,18);
	}
	
	public int getMaletero() { return this.maletero; }
	
	public String tipoVehiculo() { return "Coche"; }
}
