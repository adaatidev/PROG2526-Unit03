package boletin02;

import java.util.Random;

public class Ejercicio06 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Realiza un programa que cree dos tablas, la primera con los 6 números de una
		 * apuesta de la primitiva generados aleatoriamente entre 1 y 49 y, la segunda
		 * (ordenada) con los 6 números de la combinación ganadora. La combinación
		 * ganadora debe establecerse en el momento de crear la tabla. El programa
		 * devolverá el número de aciertos
		 * -----------------------------------------------------------------------------
		 */

		// Variable que almacena los aciertos
		int aciertos = 0;

		// Creamos el primer array de tamaño 6 (apuesta primitiva)
		int[] array1 = new int[6];

		// Creamos el segunda array de tamaño 6 (combinaciones ganadora)
		int[] array2 = { 8, 18, 21, 28, 38, 47, 48 };

		// Creamos un random
		Random rnd = new Random();

		// Bucle for que recorre el primer array asignando valores aleatorios entre 1 y
		// 49
		for (int i = 0; i < array1.length; i++) {
			array1[i] = rnd.nextInt(1, 50);

			// Condicional if dentro del bucle for que comprueba los aciertos y los
			// incrementa
			if (array1[i] == array2[i]) {
				aciertos++;
			}
		}

		// Mostramos el número de aciertos
		System.out.println("Números de aciertos: " + aciertos);

	} // Fin de main

} // Fin de clase
