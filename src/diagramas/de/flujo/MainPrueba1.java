/*Crear un programa que solicite ingresar un n�mero (solo positivos), 
y as� seguir� solicitando ingresar un n�mero hasta que se ingrese el n�mero cero (0), 
cuando se ingrese el numero cero, ya no solicitar� m�s n�meros y 
en ese momento el programa debe imprimir la suma y 
el promedio de los n�meros ingresados hasta ese momento. 
Adicional deber� imprimir la cantidad de n�meros ingresados por el usuario.
*/
package diagramas.de.flujo;

import java.util.Scanner;

public class MainPrueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);

		int n = 0;
		float suma = 0;
		int elementos = 0;
		float promedio = 0;

		for (int i = 1; i != 0; i++) {
			System.out.print("Ingrese un n�mero positivo: ");
			n = lector.nextInt();
			if (n == 0) {
				i = -1;
			} else {
				suma = suma + n;
				promedio = suma / i;
				elementos++;
			}
			System.out.println("suma: " + suma);
			System.out.println("n�mero de elementos: " + elementos);
			System.out.println("promedio: " + promedio);
		}

		// otra forma do-while

		/*
		 * int n = 0; int elementos = -1; float suma = 0; float promedio = 0f;
		 * 
		 * do { suma = suma + n; elementos++;
		 * System.out.print("Ingrese un n�mero positivo: "); n = lector.nextInt(); }
		 * while (n != 0);
		 * 
		 * promedio = suma / elementos;
		 * 
		 * System.out.println("Suma: " + suma);
		 * System.out.println("numero de elementos: " + elementos);
		 * System.out.println("el promedio es: " + promedio);
		 */
	}

}
