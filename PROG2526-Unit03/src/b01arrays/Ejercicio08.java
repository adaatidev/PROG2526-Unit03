package b01arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
		 * valores enteros aleatorios entre 1 y 10. Luego pedirá un valor N y mostrará
		 * en qué posiciones del array aparece N
		 */

		int num;
		
		boolean encontrado = false;
		
		int[] numeros = new int[100];

		Random rnd = new Random();

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(1, 11);
		} // Fin de for

		System.out.println("Introduzca un número comprendido entre 1 y 10");
		num = sc.nextInt();
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] == num) {
				System.out.println("Se ha encontrado el número " + num + " en la posición " + i);
				encontrado = true;
			}
			
		} // Fin de for
		
		if (!encontrado) {
			System.out.println("El número " + num + " no está en el array");
		}
		
		sc.close();
		
	} // Fin de main

} // Fin de clase
