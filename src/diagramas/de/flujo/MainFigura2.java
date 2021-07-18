package diagramas.de.flujo;

import java.util.Scanner;

public class MainFigura2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Ingrese el número de filas: ");

		Scanner lector = new Scanner(System.in);
		int n = lector.nextInt();
		for (int fila = 1; fila <= n; fila++) {
			for (int ast = n; ast >= fila; ast--) {
				System.out.print("*");
			}
			System.out.println();// Salto de línea

		}
	}

}
