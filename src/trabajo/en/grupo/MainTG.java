package trabajo.en.grupo;

import java.util.Scanner;

public class MainTG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Grupo 1 2 Fechas cumpleaños
		int AñoA, AñoN;
		int MesA, MesN, mes = 0;
		int diaA, diaN, dia = 0;
		int edad = 0;
		int dias_mes_actual = 0;

		Scanner lector = new Scanner(System.in);
		System.out.println("\tCalculadora de Edad>>");
		System.out.println();
		System.out.print("Año Actual:");
		AñoA = lector.nextInt();
		System.out.print("Mes Actual:");
		MesA = lector.nextInt();
		System.out.print("Dia Actual:");
		diaA = lector.nextInt();

		System.out.printf("fecha actual: %d/%d/%d ", AñoA, MesA, diaA);
		System.out.println();
		System.out.print("año Nacimiento:");
		AñoN = lector.nextInt();
		System.out.print("mes Nacimiento:");
		MesN = lector.nextInt();
		System.out.print("dia Nacimiento:");
		diaN = lector.nextInt();

		System.out.printf("fecha Nacimiento: %d/%d/%d ", AñoN, MesN, diaN);
		System.out.println();

		edad = AñoA - AñoN; /// cuantos años a cumplido formula//edad

		if (AñoA == AñoN) {
			edad = edad;
		}
		if (MesN > MesA) { // comprobar edad es verdadero
			edad = edad - 1;
		} else if (MesN == MesA) {
			if (diaN > diaA) {
				edad = edad - 1;
			} else {
				edad = edad;
			}
		}

		int dias_mes_nacimiento = 0;

		int diaMA = (MesA - 1); // Calculo mes Anterior

		if ((diaMA == 1 || diaMA == 3 || diaMA == 5 || diaMA == 7 || diaMA == 8 || MesN == 10 || diaMA == 0)) {
			dias_mes_nacimiento = 31;
		} else if ((diaMA == 4 || diaMA == 6 || diaMA == 9 || diaMA == 11)) { // los meses que tiene 31 dias
			dias_mes_nacimiento = 30;

		}
		if ((diaMA == 2) && AñoA % 4 == 0) { // bisisesto
			dias_mes_nacimiento = 29;
		} else if (diaMA == 2) { // normal
			dias_mes_nacimiento = 28;
		}

		mes = MesN - MesA;
		if (MesN > MesA) { // mes
			if (diaN > diaA) {
				mes = 11 - mes;
			} else if (diaA > diaN) {
				mes = 12 - mes;
				dia=diaA-diaN; //0j0/////////////////
			}
		} else if (MesA > MesN) {
			if (diaN > diaA) {
				mes = (MesA - MesN) - 1;
			} else if (diaA > diaN) {
				mes = MesA - MesN;
				dia=diaA-diaN; //ojo///////////////
			}
		} else if (MesN == MesA) {
			mes = 0;
			if (diaN > diaA) {
				mes = 11 - mes;
			} else if (diaA > diaN) {
				mes = mes;
			}
		}
		if ((MesN == 2 || MesA == 2) && (MesN != 2 || MesA != 2)) { // Dias

			if (diaN > diaA) {
				dia = dias_mes_nacimiento + diaA - diaN;
			}

		} else if (diaN <= diaA) {
			dia = (diaA - diaN);
		}
		if (diaN == diaA) {
			dia = 0;
		} else if (MesN != 2 && MesA != 2) {
			if (diaN <= 31 || diaA <= 31) {
				if (diaN > diaA) {
					dia = dias_mes_nacimiento + diaA - diaN;

				} else if (diaN <= diaA) {
					dia = diaA - diaN;
				}
			}
		}
		System.out.printf("Su edad es: %d años,%d meses ,%d dias", edad, mes, dia);

	}
}