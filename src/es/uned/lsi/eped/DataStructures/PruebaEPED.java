/**
 * 
 */
package es.uned.lsi.eped.DataStructures;
//import Sequence.java;
import java.util.InputMismatchException;
//import java.util.Iterator;
import java.util.Scanner;

/**
 * @author jcamor
 *Pruebas de Listas para EPED. Ordenacion de menor a mayor y recorrido por la lista sin Iteradores
 */

public class PruebaEPED {
	private static Scanner entrada; // la crea aquí para poder cerrarla cuando acabe

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//PruListas();
		//PruPilas();
		PruColas();
	}
	public static void PruColas(){
		Queue<Integer> miCola = new Queue<Integer>();
		miCola.enqueue(1);
		miCola.enqueue(2);
		miCola.enqueue(3);
		miCola.enqueue(4);
		miCola.enqueue(5);
		miCola.enqueue(6);

		System.out.println(miCola.size);

		System.out.println("Recorrido mediante iterador:");
		IteratorIF<Integer> iteratorCola = miCola.iterator();
		while(iteratorCola.hasNext()){
			System.out.print(iteratorCola.getNext()+" ");
		}
		System.out.println();
		while (!miCola.isEmpty()){
			System.out.println(miCola.getFirst());
			miCola.dequeue();
		}

	}

	public static void PruPilas() {
		Stack<Integer> miPila = new Stack<Integer>();
		miPila.push(1);
		miPila.push(2);
		miPila.push(3);
		miPila.push(4);
		miPila.push(5);
		
		IteratorIF<Integer> iteratorPila = miPila.iterator();
		while(iteratorPila.hasNext()){
			System.out.print(iteratorPila.getNext()+" ");
		}
		System.out.println();

		while (!miPila.isEmpty()){
			System.out.println(miPila.getTop());
			miPila.pop();
		}
	}

	public static void PruListas() {
		List<Integer> miLista = new List<Integer>();
		miLista.insert(1, 56);
		miLista.insert(2, 80);
		miLista.insert(3, 33);
		imprimirLista(miLista);
		System.out.println("El tamaño de la lista es: " + miLista.size);
		if (miLista.get(3).equals(33)) {
			System.out.println("En mi Lista, en la posición 3 está el elemento: " + miLista.get(3));
		}
		miLista.insert(4, 633);
		// IteratorIF<Integer> iteLista= miLista.iterator();

		if (!miLista.isEmpty()) {
			for (int i = 1; i <= miLista.size(); i++) {
				if (miLista.get(i) == 33) {
					System.out.println("La posición del 33 es: " + i);
				}
			}
		}

		System.out.println("Introduzca números para la lista: (99 para salir) ");
		int numeroEntrada = 0;
		entrada = new Scanner(System.in);
		int posicion = 0;
		do {

			try {
				posicion = miLista.size() + 1;
				System.out.print("Introduzca en la posición " + posicion + " :");
				numeroEntrada = entrada.nextInt();
				//System.out.println();
				if (numeroEntrada != 99) {
					miLista.insert(posicion, numeroEntrada);
				}
			} catch (InputMismatchException e) {
				System.out.println("Solo números!!!!!");
				entrada.next();
			}
		} while (numeroEntrada != 99);

		imprimirLista(miLista);
		System.out.println("El tamaño de la lista es: " + miLista.size);

		// miLista.clear();

		miLista.insert(1, 500);
		imprimirLista(miLista);
		miLista.set(1, 450);
		miLista.remove(1);

		System.out.println();
		System.out.println("Imprimir Lista ordenada");

		imprimirLista(ordenarLista(miLista));

		if (miLista.isEmpty()) {
			System.out.println("Lista vacia");
		}

	}

	public static void imprimirLista(List<Integer> Lista) {

		// IteratorIF<Integer> iteLista = Lista.iterator();
		for (int i = 1; i <= Lista.size; i++) {
			if (Lista.get(i) != null) {
				System.out.print("nº " + Lista.get(i));
				System.out.println();
			}
		}
	}

	public static List<Integer> ordenarLista(List<Integer> Lista) {

		for (int i = 1; i < Lista.size(); i++) {
			for (int j = 1; j < (Lista.size()); j++) {
				if (Lista.get(j) > Lista.get(j + 1)) {
					int tmp = Lista.get(j + 1);
					Lista.set(j+1,Lista.get(j));
					Lista.set(j,tmp);
				}
			}	
		}
		return Lista;
		
	}
}
