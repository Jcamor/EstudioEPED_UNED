package es.uned.lsi.eped.vehiculos;

public class Autobus extends Vehiculo {

	private int linea;
	
	public Autobus(Combustible combustible, int numAsientos, int numLinea) {
		super(4,combustible,numAsientos);
		this.linea = numLinea;
		definirAsiento(0,1,25);
	}

	public int getLinea() { return this.linea; }
	public String tipoVehiculo() { return "Autobús"; }
}
