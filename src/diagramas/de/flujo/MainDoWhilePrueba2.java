package diagramas.de.flujo;

import java.util.Scanner;

public class MainDoWhilePrueba2 {
//Utilizando Do While
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		float SumaPar = 0;
		int SumaImpar = 0;
		float ElementosImpar = 0;
		float PromedioImpar = 0;
		Scanner lector = new Scanner(System.in);
		
		do {// inicio bucle
			System.out.print("Ingrese un número positivo o (-1) para salir: ");
			n = lector.nextInt();
			if (n == -1) {

			} else if (n % 2 == 0) {

				SumaPar = SumaPar + n;

			} else {
				SumaImpar = SumaImpar + n;
				ElementosImpar++;
				PromedioImpar = SumaImpar / ElementosImpar;
			}
		} while (n != -1); // fin del bucle

		System.out.println("la suma de los pares: " + SumaPar);
		// System.out.println("la suma de los impares pares: " + SumaImpar);
		// System.out.println("Elementos impares: " + ElementosImpar);
		System.out.println("El promedio de los impares: " + PromedioImpar);
	}
}
