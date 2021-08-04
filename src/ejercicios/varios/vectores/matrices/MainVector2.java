package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare un vector X[] cuya longitud se solicite al usuario de tipo int, y construya un programa que pida al
		// usuario que ingrese los valores para cada posición. Y finalmente que se
		// imprima todos los valores ingresados
		Scanner lector = new Scanner(System.in);
		System.out.print("Ingrese la longitud del vector ");
		int a = lector.nextInt();
		
		int X[] = new int[a];
		for (int i = 0; i < a; i++) {
			System.out.print("Ingrese valor de la posición " + i + ": ");
			
			int n = lector.nextInt();
			X[i] = n;
		}
		//Recorriendo el vector lleno
		for(int i=0;i<a;i++) {
			System.out.print("El valor de la posición " + i + ": ");
			System.out.println(X[i]);
		}
//		System.out.print("Vector lleno: ");
//		System.out.print(X);
	}

}
