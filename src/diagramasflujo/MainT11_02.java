//Se ingresa por teclado 2 números: A y B se desea saber si A es múltiplo de B, 
//imprimir en pantalla los textos correspondientes para cada caso.
package diagramasflujo;

import java.util.Scanner;

public class MainT11_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Lector=new Scanner(System.in);
		System.out.println("    --- Multiplos ---");
		System.out.println("Ingrese el primer número: ");
		int A = Lector.nextInt();
		System.out.println("Ingrese el segundo número: ");
		int B = Lector.nextInt();
		
		int M=A%B;
		if(M==0) {
			System.out.println(A+" Es múltiplo de "+B);
		}else {
			System.out.println(A+" No es múltiplo de "+B);
		}
	}

}
