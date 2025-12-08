package boletin02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Necesitamos crear un programa para mostrar el ranking de puntuaciones de un
		 * torneo de ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las
		 * puntuaciones de todos los jugadores (habitualmente valores entre 1000 y 2800,
		 * de tipo entero) y luego muestre las puntuaciones en orden descendente (de la
		 * más alta a la más baja)
		 * -----------------------------------------------------------------------------
		 */

		// Creamos el array de tamaño 8
		Integer[] array = new Integer[8];

		// Creamos el scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		// Bucle for que le pregunta a todos los jugadores por su puntuación y los
		// almacena en el array
		for (int i = 0; i < array.length; i++) {
			System.out.println("Jugador " + (i + 1) + ", cuál es su puntuación? ");
			array[i] = sc.nextInt();
		}

		// Ordenamos el array en orden descendente
		Arrays.sort(array, Collections.reverseOrder());

		// Mostramos el array de las puntuaciones ya ordenadas
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}

		// Cerramos el scanner
		sc.close();

	} // Fin de main

} // Fin de clase
