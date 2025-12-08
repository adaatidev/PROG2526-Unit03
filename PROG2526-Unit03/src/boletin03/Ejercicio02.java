package boletin03;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
		 * “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las
		 * notas por teclado y luego el programa mostrará la tabla con las notas. A
		 * continuación, mostrará la nota mínima, máxima y media de cada alumno
		 * -----------------------------------------------------------------------------
		 */

		double suma = 0;

		double max = Double.MIN_VALUE;

		double min = Double.MAX_VALUE;

		// Creamos un array de tipo string de tamaño 4 que muestre los alumnos
		String[] alumnos = { "Alumno 1", "Alumno 2", "Alumno 3", "Alumno 4" };

		// Creamos un array para las notas de los alumnos de tipo double, con 4 filas y
		// 5 columnas
		double[][] notas = new double[5][4];

		// Creamos el scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		// Bucle for que recorre las columnas del array de las notas
		for (int i = 0; i < notas[i].length; i++) {

			// Le preguntamos al usuario sobre la nota de los alumnos
			System.out.println("Introduzca la nota del alumno " + (i + 1) + ": ");

			// Bucle for que almacena (lee la respuesta del usuario) las notas en su array
			// correspondiente
			for (int j = 0; j < notas.length; j++) {
				notas[j][i] = sc.nextDouble();
			} // Fin del segundo for
				// Espacio para que se vea más bonito
			System.out.println("-----------------------------------------------------------------------------");
		} // Fin del primer for

		// Bucle
		for (int k = 0; k < alumnos.length; k++) {
			System.out.print(alumnos[k] + "\t");
		}

		System.out.println();

		for (int m = 0; m < notas.length; m++) {

			for (int n = 0; n < notas[m].length; n++) {
				System.out.print(notas[m][n] + "\t" + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < notas[i].length; i++) {
			System.out.println("Notas del alumno " + (i + 1) + ": ");
			for (int j = 0; j < notas.length; j++) {
				suma += notas[j][i];
				if (notas[j][i] < min) {
					min = notas[j][i];
				}
				if (notas[j][i] > max) {
					max = notas[j][i];
				}
			}
			System.out.println("Máxima: " + max);
			System.out.println("Mínima: " + min);
			System.out.println("Media: " + suma / notas.length);
			System.out.println();

			suma = 0;

			max = Double.MIN_VALUE;

			min = Double.MAX_VALUE;
		}

		// Cerramos el scanner
		sc.close();

	} // Fin de main

} // Fin de clase
