package diagramasflujo;

import java.util.Scanner;

public class MainE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Lector = new Scanner(System.in);
		System.out.println("Ingrese el valor del sueldo: ");
		int S = Lector.nextInt();
		if (S < 300) {
			int B = 40;
			System.out.println("Su bonificación es: " + B);
		} else {
			int B = 0;
			System.out.println("Su bonificación es: " + B);
		}

	}

}
