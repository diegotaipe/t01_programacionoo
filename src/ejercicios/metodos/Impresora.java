//1. declaración del paquete
package ejercicios.metodos;
//2. declaración de importaciones
//3. comentarios
//Clase que se encarga de imprimir en formato A4
//4. declaración de la clase
public class Impresora {
	//5. constantes
	//6. variables
	public String color;
	//7. Constructores
	public Impresora() {
		
	}
	//8.métodos
	public void imprimir(String datosAImprimir, int letra) {
		System.out.println("Logo UCE");
		System.out.println("***********");
		System.out.println(datosAImprimir);
		System.out.println("***********");
		System.out.println("Pie de firma");
		
	}
}
