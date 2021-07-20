package diagramasflujo;

import java.util.Scanner;

public class MainC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese un número: ");
		Scanner Lector = new Scanner(System.in);// lector de teclado
		int A = Lector.nextInt();
		// Rombo
		if (A == 1) {
			// Si
			System.out.println("Número correcto");

		} else {
			// No
			System.out.println("Número incorrecto");
			System.out.println("El número es: " + A);
		}

	}

}
