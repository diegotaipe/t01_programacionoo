package ejercicios.varios.vectores.matrices;

public class TareaVectores1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Declarar un vector x(8)
		int X[] = new int[8];
		// 2. Declarar un vector Y(3) y asignar a la posición 2 el valor de A
		char Y[] = new char[3];
		Y[2] = 'A';
		// 3. Declarar un vector A(5) asignar a la posición 0 el valor 25, posición 3 el
		// valor 49 y a la posición 2 el valor de la posición 0
		int A[] = new int[5];
		A[0] = 25;
		A[2] = 25;
		A[3] = 49;
		// 4. Declarar un vector B(10), a la posición B[0] asignele el valor del vector
		// A[3] del ejercicio anterior
		int B[] = new int[10];
		B[0] = A[3];
		// 5. Declarar un vector Z(12) y asignar a todas sus posiciones valores que
		// inician desde 1 y son secuenciales
		int Z[] = new int[12];
		Z[0] = 1;
		Z[1] = 2;
		Z[2] = 3;
		Z[3] = 4;
		Z[4] = 5;
		Z[5] = 6;
		Z[6] = 7;
		Z[7] = 8;
		Z[8] = 9;
		Z[9] = 10;
		Z[10] = 11;
		Z[11] = 12;
		// 6. Declarar un vector Y(10) y asignar a todas sus posiciones valores impares
		// que inician desde 1 y no son secuenciales
		int I[] = new int[10];
		I[0] = 1;
		I[1] = 5;
		I[2] = 3;
		I[3] = 9;
		I[4] = 7;
		I[5] = 13;
		I[6] = 11;
		I[7] = 15;
		I[8] = 19;
		I[9] = 17;
		// 7. Declarar un vector H(10) y asignar solo a las posiciones impares letras
		// que inician desde la A secuencialmente
		char H[] = new char[10];
		H[1] = 'A';
		H[3] = 'B';
		H[5] = 'C';
		H[7] = 'D';
		H[9] = 'E';
		// 8. Declarar un vector F(10) y En base al ejercicio anterior asignar los
		// valores de la siguiente manera:
		char F[] = new char[10];
		F[0] = H[3];
		F[3] = H[2];
		F[4] = H[6];
		F[7] = H[0];
		F[8] = H[1];
		F[9] = H[9];
		// 9. Declarar un vector L(15) y asignar valores en base a lo siguiente:
		int L[] = new int[15];
		L[0] = (3 + 5 + 7 + 9) / 4;
		L[4] = (5 + 7 + 8 + 15);
		L[7] = (6 * 7 * 3);
		L[10] = (10 / 2);
		// 10. Declara vector N(12) y realizar las siguientes asignaciones:
		float N[] = new float[12];
		N[0] = (3 + 10 + 9) / 3;
		N[4] = (7 + 8 + 10);
		N[12] = (5 * 7 * 3); // N[12] = No existe, error en ejecución
		N[20] = (7 + (-3) + 8); // N[20] = No existe, error en ejecución
		N[11] = 20 / 3;

	}

}
