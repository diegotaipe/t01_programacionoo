package diagramas.de.flujo;

public class Main3 {
//imprimir la tabla del 7 multiplicando hasta el 12
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Tabla de multiplicar del 7");
		int C = 7;
		for (int N = 0; N < 13; N++) {
			int T = C * N;
			System.out.println(C + " * " + N + " = " + T);
		}
	}

}
