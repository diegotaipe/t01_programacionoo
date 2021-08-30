package ejercicio.ajedrez.ordenamiento.objetos;

import java.util.Arrays;

public class MainTableroAjedrez extends Pieza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rey reyNegro = new Rey();
		reyNegro.setColor("  Negro");

		Rey reyBlanco = new Rey();
		reyBlanco.setColor(" Blanco");

		Reina reinaNegro = new Reina();
		reinaNegro.setColor(" Negro");

		Reina reinaBlanco = new Reina();
		reinaBlanco.setColor("Blanco");

		Alfil alfil1Negro = new Alfil();
		alfil1Negro.setColor("Negro");
		Alfil alfil2Negro = new Alfil();
		alfil2Negro.setColor(" Negro");

		Alfil alfil1Blanco = new Alfil();
		alfil1Blanco.setColor("Blanco");
		Alfil alfil2Blanco = new Alfil();
		alfil2Blanco.setColor("Blanco");

		Caballo caballo1Negro = new Caballo();
		caballo1Negro.setColor("  Negro");
		Caballo caballo2Negro = new Caballo();
		caballo2Negro.setColor(" Negro");

		Caballo caballo1Blanco = new Caballo();
		caballo1Blanco.setColor("Blanco");
		Caballo caballo2Blanco = new Caballo();
		caballo2Blanco.setColor("Blanco");

		Torre torre1Negro = new Torre();
		torre1Negro.setColor(" Negro");
		Torre torre2Negro = new Torre();
		torre2Negro.setColor("Negro");

		Torre torre1Blanco = new Torre();
		torre1Blanco.setColor("Blanco");
		Torre torre2Blanco = new Torre();
		torre2Blanco.setColor("Blanco");

		Peon peon1Negro = new Peon();
		peon1Negro.setColor("  Negro");
		Peon peon2Negro = new Peon();
		peon2Negro.setColor("     Negro");
		Peon peon3Negro = new Peon();
		peon3Negro.setColor(" Negro");
		Peon peon4Negro = new Peon();
		peon4Negro.setColor(" Negro");
		Peon peon5Negro = new Peon();
		peon5Negro.setColor("  Negro");
		Peon peon6Negro = new Peon();
		peon6Negro.setColor("  Negro");
		Peon peon7Negro = new Peon();
		peon7Negro.setColor("    Negro");
		Peon peon8Negro = new Peon();
		peon8Negro.setColor("  Negro");

		Peon peon1Blanco = new Peon();
		peon1Blanco.setColor(" Blanco");
		Peon peon2Blanco = new Peon();
		peon2Blanco.setColor("   Blanco");
		Peon peon3Blanco = new Peon();
		peon3Blanco.setColor(" Blanco");
		Peon peon4Blanco = new Peon();
		peon4Blanco.setColor("Blanco");
		Peon peon5Blanco = new Peon();
		peon5Blanco.setColor(" Blanco");
		Peon peon6Blanco = new Peon();
		peon6Blanco.setColor(" Blanco");
		Peon peon7Blanco = new Peon();
		peon7Blanco.setColor("   Blanco");
		Peon peon8Blanco = new Peon();
		peon8Blanco.setColor(" Blanco");

		// System.out.println(reina1);
		Pieza ordenamientoAjedrez[][] = new Pieza[8][8];
		// fila 0
		ordenamientoAjedrez[0][0] = torre1Negro;
		ordenamientoAjedrez[0][1] = caballo1Negro;
		ordenamientoAjedrez[0][2] = alfil1Negro;
		ordenamientoAjedrez[0][3] = reyNegro;
		ordenamientoAjedrez[0][4] = reinaNegro;
		ordenamientoAjedrez[0][5] = alfil2Negro;
		ordenamientoAjedrez[0][6] = caballo2Negro;
		ordenamientoAjedrez[0][7] = torre1Negro;
		// fila 1
		ordenamientoAjedrez[1][0] = peon1Negro;
		ordenamientoAjedrez[1][1] = peon2Negro;
		ordenamientoAjedrez[1][2] = peon3Negro;
		ordenamientoAjedrez[1][3] = peon4Negro;
		ordenamientoAjedrez[1][4] = peon5Negro;
		ordenamientoAjedrez[1][5] = peon6Negro;
		ordenamientoAjedrez[1][6] = peon7Negro;
		ordenamientoAjedrez[1][7] = peon8Negro;
		// fila 6
		ordenamientoAjedrez[6][0] = peon1Blanco;
		ordenamientoAjedrez[6][1] = peon2Blanco;
		ordenamientoAjedrez[6][2] = peon3Blanco;
		ordenamientoAjedrez[6][3] = peon4Blanco;
		ordenamientoAjedrez[6][4] = peon5Blanco;
		ordenamientoAjedrez[6][5] = peon6Blanco;
		ordenamientoAjedrez[6][6] = peon7Blanco;
		ordenamientoAjedrez[6][7] = peon8Blanco;
		// fila 7
		ordenamientoAjedrez[7][0] = torre1Blanco;
		ordenamientoAjedrez[7][1] = caballo1Blanco;
		ordenamientoAjedrez[7][2] = alfil1Blanco;
		ordenamientoAjedrez[7][3] = reyBlanco;
		ordenamientoAjedrez[7][4] = reinaBlanco;
		ordenamientoAjedrez[7][5] = alfil2Blanco;
		ordenamientoAjedrez[7][6] = caballo2Blanco;
		ordenamientoAjedrez[7][7] = torre1Blanco;
		System.out.println("          ----------    Tablero de ajedrez     ----------");
		System.out.println("          -----------   Formación  inicial    -----------");
		System.out.println();
		for (int i = 0; i < 8; i++) {

			for (int j = 0; j < 8; j++) {
				if (ordenamientoAjedrez[i][j] == null) {
					System.out.print("               x      ");
				} else {
					System.out.print(ordenamientoAjedrez[i][j] + "  ");
				}
			}
			// doble salto de linea
			System.out.println("\n");
			// System.out.println();
		}
		System.out.println("\n*Nota: (x) espacios vacíos");
		// Imprime toda la matriz de manera horizontal
		//
		// System.out.println(Arrays.deepToString(ordenamientoAjedrez));
	}

}
