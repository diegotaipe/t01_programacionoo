package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Declare una matriz A [3,4] de tipo char, y desarrolle un programa que vaya
		// solicitando cada una de sus posiciones
		Scanner lector = new Scanner(System.in); // este es mi teclado

		System.out.print("Ingrese el número de filas del vector: ");
		int longitudFila = lector.nextInt();

		System.out.print("Ingrese el número de columnas del vector: ");
		int longitudColumna = lector.nextInt();

		char A[][] = new char[longitudFila][longitudColumna];

		for (int fila = 0; fila < longitudFila; fila++) {
			for (int columna = 0; columna < longitudColumna; columna++) {
				System.out.print("Ingrese el valor fila [" + fila + "] y columna [" + columna + "]: ");
				char n = lector.next().charAt(0);

				A[fila][columna] = n;
			}

		}
		System.out.println("Iniciamos a imprimir la matriz:");
		for (int fila = 0; fila < longitudFila; fila++) {
			for (int columna = 0; columna < longitudColumna; columna++) {

				System.out.print(A[fila][columna]+" ");

			}
			System.out.println();
		}
	}

}
