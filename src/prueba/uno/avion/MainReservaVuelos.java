package prueba.uno.avion;

import java.util.Scanner;

public class MainReservaVuelos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectorInt = new Scanner(System.in);
		Scanner lectorString = new Scanner(System.in);
		System.out.println("Ingrese información de pasajero");
		System.out.println("Ingrese nombre: ");
		String nombre = lectorString.nextLine();
		System.out.println("Ingrese apellido: ");
		String apellido = lectorString.nextLine();
		System.out.println("Ingrese edad: ");
		int edad = lectorInt.nextInt();
		System.out.println("Que tipo de pasajero es: 1:Pasajero Vip 2:Pasajero Económico ");
		int opcion = lectorInt.nextInt();
		String membresia = "";
		String descuento = "";
		if (opcion == 1) {
			System.out.println("Ingrese Código de Membresía");
			membresia = lectorString.nextLine();

		} else {
			System.out.println("Ingrese Código de Descuento");
			descuento = lectorString.nextLine();
		}

		PasajeroVip pasajero1 = new PasajeroVip();
		pasajero1.setNombre(nombre);
		pasajero1.setApellido(apellido);
		pasajero1.setCodigoMembresia(membresia);
		pasajero1.setEdad(edad);

		PasajeroVip pasajero2 = new PasajeroVip("Juan", "Tandre", "as2345", 23);

		PasajeroEconomico pasajeroEconomico1 = new PasajeroEconomico();
		pasajeroEconomico1.setNombre("Helena");
		pasajeroEconomico1.setApellido("Frias");
		pasajeroEconomico1.setCodigoDescuento("1234df");
		pasajeroEconomico1.setEdad(25);

		Pasajero[][] asientos = new Pasajero[4][5];
		asientos[0][0] = pasajero1;
		asientos[0][1] = pasajero2;
		asientos[0][2] = pasajero1;
		asientos[0][3] = pasajeroEconomico1;
		asientos[1][0] = pasajero1;
		asientos[1][1] = pasajeroEconomico1;

		int opcionSalir = 0;
		do {
			System.out.println();
			System.out.println("Ingrese datos del asiento, 0:continuar, -1:SALIR");
			opcionSalir = lectorInt.nextInt();
			if (opcionSalir == 0) {
				System.out.print("Ingrese fila del asiento: ");
				int fila = lectorInt.nextInt();
				System.out.print("Ingrese columna del asiento: ");
				int columna = lectorInt.nextInt();
				System.out.println("Los datos del pasajero son: ");
				System.out.println(asientos[fila][columna]);
			} else {
				System.out.println("Va ha salir del sistema");
			}
		} while (opcionSalir != -1);

	}

}
