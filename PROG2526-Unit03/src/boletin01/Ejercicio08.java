package boletin01;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
		 * valores enteros aleatorios entre 1 y 10. Luego pedirá un valor N y mostrará
		 * en qué posiciones del array aparece N
		 * -----------------------------------------------------------------------------
		 */

		// Variable que almacena el valor introducido por el usuario
		int num;

		// Variable de tipo string para mostrar las posiciones en cadena
		String cadena = "";

		// Creamos un array de números enteros de tamaño 100
		int[] array = new int[100];

		// Creamos un random
		Random rnd = new Random();

		// Creamos el scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario por un número N entre el 1 y el 10
		System.out.print("Introduzca un número entre 1 y 10: ");
		num = sc.nextInt();

		// Bucle for que rellena el array de números enteros aleatorios entre 1 y 10
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(1, 11);
		}

		// Imprimimos posiciones
		System.out.print("Posiciones: ");

		// Bucle for que recorre las posiciones del array
		for (int j = 0; j < array.length; j++) {

			// Condicional if dentro del bucle for que comprueba si el valor introducido por
			// el usuario es igual que la posición del array, si lo es concatena el valor a
			// la variable
			if (num == array[j]) {
				cadena += j + ", ";
			}
		}

		// Quitamos la última coma
		cadena = cadena.substring(0, cadena.length() - 2);

		// Mostramos las posiciones del array en cadena
		System.out.println(cadena);

		// Cerramos el scanner
		sc.close();

	} // Fin de main

} // Fin de clase
