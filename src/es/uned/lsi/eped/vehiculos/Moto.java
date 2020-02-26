package es.uned.lsi.eped.vehiculos;

public class Moto extends Vehiculo {

	private int cilindrada;
	
	public Moto(Combustible combustible, int cilindrada) {
		super(2,combustible,1);
		this.cilindrada = cilindrada;
		definirAsiento(0,1,16);
	}
	
	public int getCilindrada() { return this.cilindrada; }	
	public String tipoVehiculo() { return "Moto"; }
}
