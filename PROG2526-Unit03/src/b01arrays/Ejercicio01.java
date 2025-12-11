package b01arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Crea una tabla de enteros de longitud 10 que se inicializará con números
		 * aleatorios comprendidos entre 1 y 100
		 * -----------------------------------------------------------------------------
		 */

		// Array para la tabla
		int numero[] = new int[10];

		// Creación del scanner
		Scanner sc = new Scanner(System.in);

		// Creación del random
		Random rnd = new Random();

		for (int i = 1; i < 10; i++) {
			numero[i] = rnd.nextInt(1, 101);
		}

		for (int j = 1; j < 10; j++) {
			System.out.println(numero[j] + " ");
		}

		// Cierre de scanner
		sc.close();

	} // Fin de main

} // Fin de clase
