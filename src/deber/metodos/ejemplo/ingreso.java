package deber.metodos.ejemplo;

public class ingreso {
	public ingreso() {
	}
//deber en grupo
//Impresion en caso de ingreso de nuevos libros a la biblioteca.
	public void imprimir(String titulo, String autor, String isbn, String editorial, int paginas, String FechaIngreso,
			int registro) {
		System.out.println("       Biblioteca General");
		System.out.println("----------------------------------");
		System.out.println("Ingreso de material bibliográfico");
		System.out.println("----------------------------------");
		System.out.println("Título:      " + titulo);
		System.out.println("Autor:       " + autor);
		System.out.println("ISBN:        " + isbn);
		System.out.println("Editorial:   " + editorial);
		System.out.println("Páginas:     " + paginas);
		System.out.println("F. Ingreso:  " + FechaIngreso);
		System.out.println("Registro:    " + registro);
		System.out.println();
	}

}
