package grupo.quicksort;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenamientoQuicksort {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		System.out.print("Ingrese la longitud del vector ");
		int a = lector.nextInt();

		int X[] = new int[a]; // declarar el vector tamaño [a]
		for (int i = 0; i < a; i++) {
			System.out.print("Ingrese valor de la posición " + i + ": ");
			int n = lector.nextInt();
			X[i] = n;
		}
		System.out.println("Vector ingresado:");
		for (int i = 0; i < a; i++) {
			System.out.print(X[i] + " ");
		}
		

		// Utilizando método de ordenamiento Quicksort
		System.out.println();
		quicksort(X, 0, a - 1);
		System.out.println("Vector ordenado de menor a mayor (Quicksort):");

		for (int n = 0; n < a; n++) {
			System.out.print(X[n] + " ");
		}
		// utilizando método de ordenamiento Java, (se debe usar solo uno de los dos)
				System.out.println();
				System.out.println("----- Ordenamiento de JAVA -----");
				//System.out.println("El vector antes de ordenar: " + Arrays.toString(X));
				Arrays.sort(X); // método para ordenar vector
				System.out.println("El vector despues de ordenar: " + Arrays.toString(X));
	}

	public static void quicksort(int[] vector, int izquierda, int derecha) {
		int pivote = vector[(izquierda + derecha) / 2]; // declarar pivote
		int i = izquierda; // declarar i al extremo izquierdo del vector X[]
		int j = derecha; // declarar j al extremo derecho del vector X[]

		do { // bucle
			while (vector[i] < pivote) // i recorre a la derecha, mientras valor de i < valor del pivote
				i++;
			while (vector[j] > pivote) // j recorre a la izquierda, mientras valor de j > valor del pivote
				j--;
			if (i <= j) {
				int auxiliar = vector[i];
				vector[i] = vector[j]; // intercambio de valores i y j
				vector[j] = auxiliar;
				i++;
				j--;
			}
		} while (i <= j); // fin del bucle do-while: cuando j < i (posiciones del vector)
		if (izquierda < j)
			quicksort(vector, izquierda, j); // trabaja lado izquierdo: desde posición 0 hasta j
		if (i < derecha)
			quicksort(vector, i, derecha); // establecer lado derecho: desde posición i hasta ultima posición del vector
	}
	
}
