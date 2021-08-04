package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare un vector X[3] de tipo char y construya un programa que pida al
		// usuario que ingrese los valores para cada posición. Y finalmente que se
		// imprima todos los valores ingresados
		char X[] = new char[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("Ingrese valor de la posición " + i + ": ");
			Scanner lector = new Scanner(System.in);
			char n = lector.next().charAt(0);
			X[i] = n;
		}
		//Recorriendo el vector lleno
		for(int i=0;i<3;i++) {
			System.out.print("El valor de la posición " + i + ": ");
			System.out.println(X[i]);
		}
		System.out.print("Vector lleno: ");
		System.out.print(X);
	}

}
