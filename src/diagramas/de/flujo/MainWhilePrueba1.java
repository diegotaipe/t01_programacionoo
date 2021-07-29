package diagramas.de.flujo;

import java.util.Scanner;

public class MainWhilePrueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int n = 0;
		float suma = 0;
		float elementos = 0;
		float promedio = 0;

		System.out.print("Ingrese un número positivo o (0) para salir: ");
		n = lector.nextInt();
		suma = suma + n; // variable n guardada en suma, para evitar borrado
		while (n != 0) { // la variable n almacena se borra al iniciar el bucle

			System.out.print("Ingrese un número positivo: ");
			n = lector.nextInt();

			suma = suma + n;
			elementos++;
			promedio = suma / elementos;

		} // fin de bucle
		System.out.println("suma total: " + suma);
		System.out.println("número de elementos ingresados: " + elementos);
		System.out.println("promedio total: " + promedio);
	}

}
