package es.uned.lsi.eped.vehiculos;

public interface VehiculoIF {

	public enum Combustible {
		GASOLINA, GASOIL, ELECTRICO, ACEITE, HIDROGENO
	}
	public int getNumRuedas();
	public int getNumAsientos();
	public int getFilaAsiento(int asiento);
	public int getEdadAsiento(int asiento);
	public Combustible getCombustible();
	public String tipoVehiculo();
	public void definirAsiento(int asiento, int fila, int edad);
}
