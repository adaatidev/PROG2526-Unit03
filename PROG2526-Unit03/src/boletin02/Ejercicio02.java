package boletin02;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Crea un programa que pida al usuario 20 valores enteros e introduzca los 10
		 * primeros en un array y los 10 últimos en otro array. Por último, comparará
		 * ambos arrays y le dirá al usuario si son iguales o no
		 * -----------------------------------------------------------------------------
		 */

		// Creamos el primer array de tamaño 10
		int[] array1 = new int[10];

		// Creamos el segundo array de tamaño 10
		int[] array2 = new int[10];

		// Creamos el scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		// Bucle for que pregunta por el valor en el primer array y lo almacena
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Introduzca un número para el primer array: ");
			array1[i] = sc.nextInt();
		}

		// Bucle for que pregunta por el valor en el segundo array y lo almacena
		for (int j = 0; j < array2.length; j++) {
			System.out.println("Introduzca un número para el segundo array: ");
			array2[j] = sc.nextInt();
		}

		// Ternario para comprobar si los arrays son iguales o no
		System.out.println(Arrays.equals(array1, array2) ? "Son iguales" : "No son iguales");

		// Cerramos el scanner
		sc.close();

	} // Fin de main

} // Fin de clase
