package diagramas.de.flujo;

import java.util.Scanner;

public class Main1 {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese un n�mero: ");
		Scanner Lector = new Scanner(System.in);
		int N = Lector.nextInt();
		for (int C = N + 1; C <= N + 5; C++) {
			System.out.println(C);
		}
		System.out.println("Se ha finalizado la impresi�n de los 5 n�meros");
	}

}
