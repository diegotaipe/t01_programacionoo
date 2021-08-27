package ejercicio.ajedrez.ordenamiento.objetos;

public class Alfil extends MainTableroAjedrez {
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
