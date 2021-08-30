package deber.metodos;

public class prestamo {
	public prestamo(){
//		
	}
	public void entregar(String usuario,String cedula,String fecha,int tiempo,String titulo, String autor, String isbn, char estado) {
		System.out.println("       Biblioteca General");
		System.out.println("----------------------------------");
		System.out.println("       Sistema de prestamo");
		System.out.println("----------------------------------");
		System.out.println("Usuario:            "+usuario);
		System.out.println("C.I.:               "+cedula);
		System.out.println("Fecha de Prestamo:  "+fecha);
		System.out.println("Tiempo de Prestamo: "+tiempo+" días");
		System.out.println("Título:             "+titulo);
		System.out.println("Autor:              "+autor);
		System.out.println("ISBN:               "+isbn);
		System.out.println("Estado:             "+estado);
		System.out.println("A: Excelente|B: Bueno|C: Regular");
		System.out.println();
	
	}
}
