/*Se ingresa por teclado 2 n�meros: A y B se desea mostrar la divisi�n 
entre dichos n�meros en caso de ser posible, caso contrario 
indicar al usuario que la divisi�n es imposible.*/
package diagramasflujo;

import java.util.Scanner;

public class MainT11_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Lector = new Scanner(System.in);
		System.out.println("    --- Divisi�n ---");
		System.out.println("Ingrese el primer n�mero: ");
		int A = Lector.nextInt();
		System.out.println("Ingrese el segundo n�mero: ");
		int B = Lector.nextInt();
		if(B!=0) {
			int D=A/B;
			System.out.println("Resultado: "+D);
			
		}else {
			System.out.println("La divisi�n no es posible: ");
		}
	}

}
