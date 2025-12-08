package boletin02;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Crea un programa que cree un array de tamaño 1000 y lo rellene con valores
		 * enteros aleatorios entre 0 y 99. Luego pedirá por teclado un valor y se
		 * mostrará por pantalla si ese valor existe en el array, además de cuántas
		 * veces
		 * -----------------------------------------------------------------------------
		 */

		// Variable que almacena el valor introducido por el usuario
		int numero;

		// Variable que funciona como contador
		int contador = 0;

		// Creamos el array de tamaño 100
		int[] array = new int[100];

		// Creamos el random
		Random rnd = new Random();

		// Creamos el scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		// Bucle for que recorre las posiciones asignando un valor aleatorio
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(0, 100);
		}

		// Le pedimos un número al usuario entre el 0 y el 99
		System.out.println("Introduzca un número entre 0 y 99: ");
		numero = sc.nextInt();

		// Bucle for que recorre las posiciones del array
		for (int j = 0; j < array.length; j++) {

			// Condicional if dentro del bucle for que compara los valores del array con el
			// valor introducido por el usuario, si el valor coincide con el del usuario el
			// contador se incrementa
			if (numero == array[j]) {
				contador++;
			}
		}

		// Imprimimos un mensaje según un ternario que comprueba si el contador es mayor
		// o igual que 1 es que el valor sí que se ecuentra y sino no
		System.out.println(contador >= 1 ? "El valor existe en el array, se encuentra " + contador + " veces"
				: "El valor no se encuentra en el array");

		// Cerramos el scanner
		sc.close();

	} // Fin de main

} // Fin de clase
