package es.uned.lsi.eped.vehiculos;

public abstract class Vehiculo implements VehiculoIF {

	private class Asiento {
		
		private int fila;
		private int edad;
		
		public Asiento() {
			this.fila = 0;
			this.edad = 0;
		}
		
		public int getFila() { return this.fila; }
		public int getEdad() { return this.edad; }
		
		public void setFila(int fila) { this.fila = fila; }
		public void setEdad(int edad) { this.edad = edad; }
		
	}
	
	private int         numRuedas;
    private Combustible combustible;
    private Asiento[]   asientos;

    public Vehiculo(int ruedas, Combustible combustible, int nAsientos) {
    	this.numRuedas = ruedas;
    	this.combustible = combustible;
    	this.asientos = new Asiento[nAsientos];
    	for ( int asiento = 0 ; asiento < nAsientos ; asiento++ ) {
    		this.asientos[asiento] = new Asiento();
    	}
    }
    
	public int getNumRuedas() { return this.numRuedas; }
	
	public int getNumAsientos() { return this.asientos.length; }

    public int getFilaAsiento(int asiento) { return this.asientos[asiento].getFila(); }
	
    public int getEdadAsiento(int asiento) { return this.asientos[asiento].getEdad(); }

    public Combustible getCombustible() { return this.combustible; }
	
	public abstract String tipoVehiculo();
	
	public void definirAsiento(int asiento, int fila, int edad) {
		this.asientos[asiento].setFila(fila);
		this.asientos[asiento].setEdad(edad);
	}

}
