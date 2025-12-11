package boletin01;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Realiza un programa que pida 8 números enteros y los almacene en una tabla. A
		 * continuación, en un bucle distinto, recorrerá esa tabla y mostrará esos
		 * números junto con la palabra “par” o “impar” según proceda
		 * -----------------------------------------------------------------------------
		 */

		// Creamos el array
		int[] array = new int[8];

		// Creamos el scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		// Bucle for que pregunta por un número y los almacena en el array
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introduzca un número: ");
			array[i] = sc.nextInt();
		}

		// Bucle for que recorre los números del array y los muestra
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j]);
			// Ternario que muestra si el número es par o impar
			System.out.println(array[j] % 2 == 0 ? " - par" : " - impar");
		}

		// Cerramos el scanner
		sc.close();

	} // Fin de main

} // Fin de clase
