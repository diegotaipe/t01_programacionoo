package diagramasflujo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese dos n�meros: ");
		Scanner Lector = new Scanner(System.in);// lector de teclado
		int A = Lector.nextInt();
		// System.out.println("N�mero ingresado: "+A);
		int B = Lector.nextInt();
		// System.out.println("N�mero ingresado: "+B);

		int S = A + B;
		int R = A - B;
		int P = A * B;

		System.out.println("La suma es: " + S);
		System.out.println("La resta es: " + R);
		System.out.println("El producto es: " + P);

	}

}
