package b01arrays;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de
		 * un determinado año y las almacene en una tabla (una posición por mes). A
		 * continuación, se debe mostrar un diagrama de barras horizontales con esos
		 * datos. Las barras del diagrama se pueden dibujar a base de asteriscos o
		 * cualquier otro carácter
		 */

		int asteriscos = 0;

		Scanner sc = new Scanner(System.in);

		String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre" };

		double[] temperaturas = new double[meses.length];

		System.out.println("Introduce la temperatura media de cada mes del año: ");

		for (int i = 0; i < meses.length; i++) {
			System.out.println("Temperatura media de " + meses[i] + ": ");
			temperaturas[i] = sc.nextDouble();
		}
			for (int j = 0; j < meses.length; j++) {
				System.out.println(meses[j] + ": ");
				asteriscos = (int) temperaturas[j];
			

			for (int k = 0; k < asteriscos; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
			
		sc.close();

	} // Fin de main

} // Fin de clase
