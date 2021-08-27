package ejercicio.ajedrez.ordenamiento.objetos;

public class Caballo extends Pieza {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Caballo [color=" + color + "]";
	}

}
