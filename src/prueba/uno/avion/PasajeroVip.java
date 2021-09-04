package prueba.uno.avion;

public class PasajeroVip extends Pasajero {
	private String codigoMembresia;

	// declarar el constructor por default cuando tengamos un constructor con
	// argumentos
	public PasajeroVip() {

	}

	// constructor con argumentos
	public PasajeroVip(String nombre, String apellido, String codigoMembresia, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.codigoMembresia = codigoMembresia;
	}

	// Métodos SET y GET
	public String getCodigoMembresia() {
		return codigoMembresia;
	}

	public void setCodigoMembresia(String codigoMembresia) {
		this.codigoMembresia = codigoMembresia;
	}

	@Override
	public String toString() {
		return "PasajeroVip [codigoMembresia=" + codigoMembresia + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + "]";
	}





}
