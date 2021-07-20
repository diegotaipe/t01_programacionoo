package diagramas.de.flujo;

import java.util.Scanner;

public class MainFigura1 {
//modificación
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Ingrese el número de filas: ");

		Scanner lector = new Scanner(System.in);
		int n = lector.nextInt();

		for (int fila = 1; fila <= n; fila = fila + 1) {

			for (int ast = 1; ast <= fila; ast ++) {
				System.out.print("*");
			}
			System.out.println();//Salto de linea
		}
	}

}
