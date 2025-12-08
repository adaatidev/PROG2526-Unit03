package boletin01;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Escribe un programa que lea 10 números por teclado, los almacene en una
		 * tabla, y que luego los muestre en orden inverso, es decir, el primero que se
		 * introduce es el último en mostrarse
		 * -----------------------------------------------------------------------------
		 */

		// Creamos el array
		int[] array = new int[10];

		// Creamos el scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		// Bucle for que pregunta por un número y los almacena
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduzca un número: ");
			array[i] = sc.nextInt();
		}

		// Bucle for que muestra los números introducidos en orden inverso
		for (int j = array.length - 1; j >= 0; j--) {
			System.out.println(array[j]);
		}

		// Cerramos el scanner
		sc.close();

	} // Fin de main

} // Fin de clase
