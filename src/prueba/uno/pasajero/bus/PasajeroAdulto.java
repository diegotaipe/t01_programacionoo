package prueba.uno.pasajero.bus;

public class PasajeroAdulto extends Pasajero {
	private int codigoDeSeguro;
	private String empresaDeTrabajo;
	private String nombre;
	private String apellido;
	
	public int getCodigoDeSeguro() {
		return codigoDeSeguro;
	}
	public void setCodigoDeSeguro(int codigoDeSeguro) {
		this.codigoDeSeguro = codigoDeSeguro;
	}
	public String getEmpresaDeTrabajo() {
		return empresaDeTrabajo;
	}
	public void setEmpresaDeTrabajo(String empresaDeTrabajo) {
		this.empresaDeTrabajo = empresaDeTrabajo;
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
		return "PasajeroAdulto [codigoDeSeguro=" + codigoDeSeguro + ", empresaDeTrabajo=" + empresaDeTrabajo + "]";
	}


	
	
}
