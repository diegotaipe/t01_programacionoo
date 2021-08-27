package ejercicio.ajedrez.ordenamiento.objetos;

public class Peon extends Pieza {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Peon [color=" + color + "]";
	}

}
