package trabajo.en.grupo;

import java.util.Scanner;

public class MainGrupo1 {
//calcular la edad de la persona ingresando 2 fechas válidas
//Diego	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Lector = new Scanner(System.in);

		System.out.print("Ingrese dia de nacimiento: ");
		int DN = Lector.nextInt();
		System.out.print("Ingrese mes de nacimiento: ");
		int MN = Lector.nextInt();
		System.out.print("Ingrese año de nacimiento: ");
		int AN = Lector.nextInt();
		System.out.print("Ingrese dia actual: ");
		int DA = Lector.nextInt();
		System.out.print("Ingrese mes actual: ");
		int MA = Lector.nextInt();
		System.out.print("Ingrese año actual: ");
		int AA = Lector.nextInt();

		int dias_mes_anterior = 0;
		// int dias_mes_nacimiento = 0;
		// int dias_mes_actual = 0;
		int meses = 0;
		int dias = 0;
		int anios = 0;
		if (MA == 1 || MA == 2 || MA == 4 || MA == 6 || MA == 8 || MA == 9 || MA == 11) {
			dias_mes_anterior = 31;
		} else if (MA == 5 || MA == 7 || MA == 10 || MA == 12) {
			dias_mes_anterior = 30;
		} else if (MA == 3 && AA % 4 == 0) {
			dias_mes_anterior = 29;
		} else {
			dias_mes_anterior = 28;
		}

		if (DA >= DN) {
			if (MA >= MN) {
				if (AA >= AN) {
					dias = DA - DN;
					meses = MA - MN;
					anios = AA - AN;
				}
			} else {
				dias = DA - DN;
				meses = MA - MN + 12;
				anios = AA - AN - 1;

			}
		} else if (MA < MN) {
			DA = DA + dias_mes_anterior;
			dias = DA - DN;
			meses = MA - MN + 12 - 1;
			anios = AA - AN - 1;

		} else if (DA < DN && (MA < MN || MA > MN)) {
			DA = DA + dias_mes_anterior;
			dias = DA - DN;
			meses = MA - MN - 1;
			anios = AA - AN;
		} else if (MA == MN) {
			DA = DA + dias_mes_anterior;
			dias = DA - DN;
			meses = MA - MN + 12 - 1;
			anios = AA - AN - 1;
		}

		System.out.println("su edad: " + anios + " años /" + meses + " meses /" + dias + " dias");

	}

}
