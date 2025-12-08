package boletin01;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Crea un programa que pida diez números reales por teclado, los almacene en un
		 * array, y luego lo recorra para calcular la suma de todos los números y,
		 * además, averiguar el máximo y mínimo y mostrarlos por pantalla
		 * -----------------------------------------------------------------------------
		 */

		// Creamos una variable para almacenar el número máximo
		int max = Integer.MIN_VALUE;

		// Creamos una variable para almacenar el número mínimo
		int min = Integer.MAX_VALUE;

		// Variable para la suma de todos los números
		int suma = 0;

		// Creamos el array
		int[] array = new int[10];

		// Creamos el scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		// Bucle for que pregunta por un número y los almacena en el array
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduzca un número: ");
			array[i] = sc.nextInt();
			suma += array[i];
		}

		// Bucle for que recorre las posiciones del array
		for (int j = 0; j < array.length; j++) {
			// Condicionales if para almacenar el número máximo y el mínimo
			if (array[j] > max) {
				max = array[j];
			}
			if (array[j] < min) {
				min = array[j];
			}
		}

		// Mostramos el máximo, mínimo y la suma
		System.out.println("Suma de todos los números introducidos: " + suma);
		System.out.println("Número máximo: " + max);
		System.out.println("Número mínimo: " + min);

		// Cerramos el scanner
		sc.close();

	} // Fin de main

} // Fin de clase
