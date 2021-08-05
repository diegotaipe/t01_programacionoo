package ejercicios.varios.vectores.matrices;

public class MainMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. Desarrollar un programa que imprima la siguiente imagen (matriz)

		int M[][] = new int[5][5];

		for (int fila = 0; fila < 5; fila++) {
			for (int columna = 0; columna < 5; columna++) {
				if (fila == columna) {
					M[fila][columna] = 1;
				} else {
					M[fila][columna] = 0;
				}
			}
		}
		System.out.println("Impresión de la matriz:");

		for (int fila = 0; fila < 5; fila++) {
			for (int columna = 0; columna < 5; columna++) {

				System.out.print(M[fila][columna] + " ");
			}
			System.out.println();
		}
	}

}
