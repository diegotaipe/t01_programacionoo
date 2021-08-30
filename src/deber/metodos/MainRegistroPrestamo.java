package deber.metodos;

public class MainRegistroPrestamo {
//metodo main main para prestamo de libros a usuarios de una biblioteca.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prestamo prestamo1=new prestamo(); //instanciar clase prestamo()
		prestamo1.entregar("Diego Taipe", "1750142300", "13/08/2021", 20, "El médico", "Noah Gordon","9788499182575" , 'A');
		prestamo1.entregar("Cristian Pozo", "1712090000", "13/08/2021", 30, "Ecuador: I. o E.", "Miguel Pareja", "9978160728", 'B');
	}

}
