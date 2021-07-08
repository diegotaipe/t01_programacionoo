/*Se ingresa por teclado 2 números: A y B se desea mostrar la división 
entre dichos números en caso de ser posible, caso contrario 
indicar al usuario que la división es imposible.*/
package diagramasflujo;

import java.util.Scanner;

public class MainT11_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Lector = new Scanner(System.in);
		System.out.println("    --- División ---");
		System.out.println("Ingrese el primer número: ");
		int A = Lector.nextInt();
		System.out.println("Ingrese el segundo número: ");
		int B = Lector.nextInt();
		if(B!=0) {
			int D=A/B;
			System.out.println("Resultado: "+D);
			
		}else {
			System.out.println("La división no es posible: ");
		}
	}

}
