//Se ingresa por teclado 2 n�meros: A y B se desea saber si A es m�ltiplo de B, 
//imprimir en pantalla los textos correspondientes para cada caso.
package diagramasflujo;

import java.util.Scanner;

public class MainT11_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Lector=new Scanner(System.in);
		System.out.println("    --- Multiplos ---");
		System.out.println("Ingrese el primer n�mero: ");
		int A = Lector.nextInt();
		System.out.println("Ingrese el segundo n�mero: ");
		int B = Lector.nextInt();
		
		int M=A%B;
		if(M==0) {
			System.out.println(A+" Es m�ltiplo de "+B);
		}else {
			System.out.println(A+" No es m�ltiplo de "+B);
		}
	}

}
