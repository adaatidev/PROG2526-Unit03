package boletin01;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Crea una tabla de enteros de longitud 10 que se inicializará con números
		 * aleatorios comprendidos entre 1 y 100
		 * -----------------------------------------------------------------------------
		 */

		// Creamos el random
		Random rnd = new Random();

		// Creación del array, entre los [] está la longitud
		int[] array = new int[10];

		// Recorremos el array con un for
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(1, 101);

			// Otra forma de imprimir el array
			// System.out.println(i);
		}

		// Imprimimos los mensajes aleatorios del array
		System.out.println(Arrays.toString(array));

	} // Fin de main

} // Fin de clase
