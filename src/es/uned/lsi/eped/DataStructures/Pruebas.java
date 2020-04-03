/**
 * 
 */
package es.uned.lsi.eped.DataStructures;

import java.util.InputMismatchException;
//import java.util.Iterator;
import java.util.Scanner;

/**
 * @author jcamor
 *
 */
public class Pruebas {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PruebaListas();
	}
	public static void PruebaListas() {
		List<Integer> miLista = new List<Integer>();
		miLista.insert(1,56);
		miLista.insert(2,80);
		miLista.insert(3,33);
		imprimirLista(miLista);
		System.out.println("El tamaño de la lista es: " + miLista.size);
		if (miLista.get(3).equals(33)) {
			System.out.println("En mi Lista, en la posición 3 está el elemento: " + miLista.get(3));
		}
		miLista.insert(4,633);
		//IteratorIF<Integer> iteLista= miLista.iterator();
		
		if (!miLista.isEmpty()) {
			for (int i = 1; i <= miLista.size(); i++) {	
				if (miLista.get(i)==33){
					System.out.println ("La posición del 33 es: " + i );
				}
			}
		}
		
		System.out.println("Introduzca números para la lista: (99 para salir) ");
		int numeroEntrada=0;
		Scanner entrada = new Scanner (System.in);
		int posicion = 0;
		do {
			
			try {
				posicion = miLista.size()+1;		
				System.out.print("Introduzca en la posición " + posicion + " :");	
				numeroEntrada = entrada.nextInt();
				System.out.println();
				if (numeroEntrada != 99) {
					miLista.insert(posicion, numeroEntrada);
				}
			}catch (InputMismatchException e) {
				System.out.println("Solo números!!!!!");
				entrada.next();
			}
		} while (numeroEntrada != 99);
		
		imprimirLista(miLista);
		System.out.println("El tamaño de la lista es: " +miLista.size);
		
		miLista.clear();
		
		//imprimirLista(miLista);
		
		System.out.println("El tamaño de la lista es: " + miLista.size);
		
		miLista.insert(1, 500);
		imprimirLista(miLista);
		miLista.set(1,450);
		imprimirLista(miLista);
		
		
		if (miLista.isEmpty()) {
			System.out.println("Lista vacia");
		}
		
	}

	public static void imprimirLista(List<Integer> miLista) {

		IteratorIF<Integer> iteLista = miLista.iterator();
		while (iteLista.hasNext()) {
			System.out.print("nº " + iteLista.getNext());
			System.out.println();
		}
	}
}