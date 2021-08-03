package ejercicios.vectores;

public class MainVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Declarar un vector miVector[10] de tipo int
		int miVector[] = new int[10];

		// 2. Declarar un vector miVector1[5] de tipo char
		char miVector1[] = new char[5];

		// 3. Declarar un vector miVec[4] de tipo char, y asignamos la letra 'A' a la
		// posición 0 y 2
		char miVec[] = new char[4];
		miVec[0] = 'A';
		miVec[2] = 'A';

		// 4. Declarar un vector miVec1[3] de tipo byte, y asignamos el número 0 a las
		// posiciónes 0,1,2 y 3.
		byte miVec1[] = new byte[3];
		// miVec[4] = 0; Esta es una mala asignación porque está fuera de rango la
		// posición 4
		miVec1[0] = 0;
		miVec1[1] = 0;
		miVec1[2] = 0;

		// 5. Declarar un vector miVec2[3] de tipo cahr, y asignamos la letra A a las
		// posiciones 0 y 1; y a la posición 2 la letra B; finalmente imprimir las posiciones 0 y 2.
		char miVec2[]=new char[3];
		miVec2[0]='A';
		miVec2[1]='A';
		miVec2[2]='B';
		System.out.println("Impresión 1: "+miVec2[0]);
		
		miVec2[0]='Z';
		System.out.println("Impresión 1: "+miVec2[0]);
		System.out.println("Impresión 2: "+miVec2[2]);
		System.out.print("Impresión de todo el vector: ");
		System.out.print(miVec2);
	}

}
