package es.uned.lsi.eped.vehiculos;

import es.uned.lsi.eped.vehiculos.VehiculoIF.Combustible;

public class Principal {

	private static String combustible(Combustible c) {
		switch (c) {
			case GASOLINA:  return "Vehículo de Gasolina";
			case GASOIL:    return "Vehículo Diesel";
			case ACEITE:    return "Vehículo a base de Aceite";
			case HIDROGENO: return "Vehículo con pila de Hidrógeno";
			case ELECTRICO: return "Vehículo Eléctrico";
			default:        return "Vehículo con combustible desconocido";
		}
	}
	
	private static void infoVehiculo(Vehiculo v) {
		System.out.println("Es un vehículo de tipo "+v.tipoVehiculo());
		System.out.println(combustible(v.getCombustible()));
		System.out.println("Tiene "+v.getNumRuedas()+" ruedas.");
		System.out.println("Tiene "+v.getNumAsientos()+" asientos.");
	}
	
	public static void main(String [] args) {
		
		Coche micoche = new Coche(VehiculoIF.Combustible.GASOLINA,5,1500);
		micoche.definirAsiento(1, 1, 12);
		micoche.definirAsiento(2, 2, 0);
		micoche.definirAsiento(3, 2, 0);
		micoche.definirAsiento(4, 2, 0);
		
		Moto mimoto = new Moto(VehiculoIF.Combustible.HIDROGENO,500);
		
		Autobus miautobus = new Autobus(VehiculoIF.Combustible.ACEITE,15,4);
		miautobus.definirAsiento(1, 2, 18);
		miautobus.definirAsiento(2, 2, 18);
		int asiento = 3;
		for ( int fila = 3 ; fila < 6 ; fila++ ) {
			miautobus.definirAsiento(asiento++, fila, 3);			
			miautobus.definirAsiento(asiento++, fila, 3);			
			miautobus.definirAsiento(asiento++, fila, 3);			
			miautobus.definirAsiento(asiento++, fila, 3);			
		}

		infoVehiculo(micoche);
		infoVehiculo(mimoto);
		infoVehiculo(miautobus);
		
	}
	
}
