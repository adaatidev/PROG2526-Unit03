package boletin01;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de
		 * un determinado año y las almacene en una tabla (una posición por mes). A
		 * continuación, se debe mostrar un diagrama de barras horizontales con esos
		 * datos. Las barras del diagrama se pueden dibujar a base de asteriscos o
		 * cualquier otro carácter
		 * -----------------------------------------------------------------------------
		 */

		// Creamos un array que almacena los meses del año
		String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre" };

		// Creamos un array que almacena las temperaturas (con la longitud del array de
		// meses)
		double[] temperaturas = new double[meses.length];

		// Creamos el scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		// Bucle for que pregunta por la temperatura media de cada mes y lo almacena en
		// el array de temperaturas
		for (int i = 0; i < meses.length; i++) {
			System.out.print("Introduzca la temperatura media de " + meses[i] + ": ");
			temperaturas[i] = sc.nextDouble();
		}

		// Bucle for que muestra el mes que va a mostrar su temperatura media
		for (int j = 0; j < meses.length; j++) {
			System.out.print(meses[j] + ": ");

			// Bucle for que imprime asteriscos dependiendo de la temperatura introducida en
			// el anterior for
			for (int k = 0; k < (int) temperaturas[j]; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Cerramos el scanner
		sc.close();

	} // Fin de main

} // Fin de clase
