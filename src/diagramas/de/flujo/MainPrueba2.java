//Crear un programa que solicite ingresar un número (solo positivos), 
//y así seguirá solicitando ingresar un número hasta que se ingrese el número (-1), 
//cuando se ingrese el numero -1, ya no solicitará más números y 
//en ese momento el programa debe imprimir la suma solo de los números pares ingresados y 
//el promedio solo de los números impares ingresados hasta ese momento
package diagramas.de.flujo;

import java.util.Scanner;

public class MainPrueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);

		int n = 0;
		float SumaPar = 0;
		float SumaImpar = 0;
		int ElementosImpar = 0;
		float PromedioImpar = 0;

		for (int i = 1; i != -1; i++) {
			System.out.print("Ingrese un número positivo: ");
			n = lector.nextInt();
			if (n == -1) {
				i = -2;
			} else if (n % 2 == 0) {

				SumaPar = SumaPar + n;

			} else {
				SumaImpar = SumaImpar + n;
				ElementosImpar++;
				PromedioImpar = SumaImpar / ElementosImpar;

			}
			System.out.println("la suma de los pares: " + SumaPar);
			
			// System.out.println("la suma de los impares pares: " + SumaImpar);
			// System.out.println("Elementos impares: " + ElementosImpar);
			System.out.println("El promedio de los impares: " + PromedioImpar);
		}
	}

}
