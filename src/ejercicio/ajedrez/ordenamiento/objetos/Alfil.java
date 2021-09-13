package ejercicio.ajedrez.ordenamiento.objetos;
//CORRECCION error public class Alfil extends MainTableroAjedrez {
//¿Alfil es un MainTableroAjedrez? NO

//¿Alfil es una Pieza? SI
public class Alfil extends Pieza {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Alfil [color=" + color + "]";
	}

}
