package prueba.uno.pasajero.bus;

public class PasajeroAdolescente extends Pasajero{
	private String deporteQuePractica;
	private String nombre;
	private String apellido;
	public String getDeporteQuePractica() {
		return deporteQuePractica;
	}

	public void setDeporteQuePractica(String deporteQuePractica) {
		this.deporteQuePractica = deporteQuePractica;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "PasajeroAdolescente [deporteQuePractica=" + deporteQuePractica + "]";
	}

	
}
