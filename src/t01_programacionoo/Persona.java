package t01_programacionoo;

public class Persona {
	private String nombre;
	private String edad;
	
	void prestarLibro() {
		Libro Libro=new Libro();
		Libro.accion(nombre, edad);
	}
}
