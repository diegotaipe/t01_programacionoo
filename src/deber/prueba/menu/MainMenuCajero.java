package deber.prueba.menu;

import java.util.Scanner;

public class MainMenuCajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		do {
			System.out.println();
			System.out.println("Banco del Pichincha: seleccione una opción");
			System.out.println("1. Retirar dinero");
			System.out.println("2. Cambiar clave");
			System.out.println("3. Bloquear clave");
			System.out.println("4. SALIR");
			Scanner Lector = new Scanner(System.in);
			int n = Lector.nextInt();
			opcion = n;
			if (opcion == 1) {
				System.out.println("Ingrese el valor a retirar");
				int retiro = Lector.nextInt();
				System.out.println("El valor a retirar es: " + retiro);
				System.out.println("------------------------------------------");
			}
			if (opcion == 2) {
				System.out.println("Ingrese nueva clave");
				int clave = Lector.nextInt();
				System.out.println("Su clave ha sido cambiada con exito");
				System.out.println("------------------------------------------");
			}
			if (opcion == 3) {
				System.out.println("Su cuenta ha sido bloqueada");
				System.out.println("------------------------------------------");
			}

		} while (opcion != 4);
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println("Tenga un buen día");
		System.out.println("------------------------------------------");
	}

}
