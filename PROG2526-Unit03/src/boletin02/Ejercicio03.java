package boletin02;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio03 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Crea un programa que cree un array de tamaño 30 y lo rellene con valores
		 * aleatorios entre 0 y 9. Luego ordena los valores del array y los mostrará por
		 * pantalla
		 * -----------------------------------------------------------------------------
		 */

		// Creamos el array de tamaño 30
		int[] array = new int[30];

		// Creamos el random
		Random rnd = new Random();

		// Bucle for que asigna un valor aleatorio entre 0 y 9
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(0, 10);
		}

		// Ordenamos el array con Arrays.sort
		Arrays.sort(array);

		// Mostramos el array ordenado
		System.out.println(Arrays.toString(array));

	} // Fin de main

} // Fin de clase
