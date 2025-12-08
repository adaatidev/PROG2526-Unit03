package boletin02;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Crea un programa que pida al usuario dos valores, tamaño y valor, y luego
		 * cree un array del tamaño dado y que almacene valor en todas sus posiciones.
		 * Luego muestra el array por pantalla
		 * -----------------------------------------------------------------------------
		 */

		// Variable que almacena el tamaño del array introducido por el usuario
		int tamano;

		// Variable que almacena el valor del array introducido por el usuario
		int valor;

		// Declaramos el array
		int[] array;

		// Creamos el scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario por el tamaño y el valor del array
		System.out.println("Introduzca el tamaño del array: ");
		tamano = sc.nextInt();

		System.out.println("Introduzca el valor del array: ");
		valor = sc.nextInt();

		// Le asignamos el tamaño al array
		array = new int[tamano];

		// Rellenamos el array con el valor introducido por el usuario
		Arrays.fill(array, valor);

		// Mostramos el array
		System.out.println(Arrays.toString(array));

		// Cerramos el scanner
		sc.close();

	} // Fin de main

} // Fin de clase
