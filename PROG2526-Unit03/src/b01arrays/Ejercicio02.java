package b01arrays;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Diseñar un programa que solicite al usuario 5 números decimales y los
		 * almacene en una tabla. Utiliza el mismo bucle tanto para solicitar los 5
		 * números como para almacenarlos en la tabla. A continuación, en un bucle
		 * distinto, mostrar por consola los números en el mismo orden en el que se han
		 * introducido
		 * -----------------------------------------------------------------------------
		 */

		// Variable para almacenar los números introducidos por el usuario
		double numero[] = new double[5];

		// Creación del scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca 5 números decimales mediante un
		// condicional
		do {
			System.out.println("Introduzca 5 números decimales");
		} while (numero);

		// Cierre de scanner
		sc.close();

	} // Fin de main

} // Fin de clase
