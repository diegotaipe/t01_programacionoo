package diagramasflujo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese dos números: ");
		Scanner Lector = new Scanner(System.in);// lector de teclado
		int A = Lector.nextInt();
		// System.out.println("Número ingresado: "+A);
		int B = Lector.nextInt();
		// System.out.println("Número ingresado: "+B);

		int S = A + B;
		int R = A - B;
		int P = A * B;

		System.out.println("La suma es: " + S);
		System.out.println("La resta es: " + R);
		System.out.println("El producto es: " + P);

	}

}
