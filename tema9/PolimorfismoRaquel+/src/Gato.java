
public class Gato extends Animal{
	private String color;

	public Gato(String nombre, String due�o, String color) {
		super(nombre, due�o);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void verDatos(){
		System.out.println("GATO");
		super.verDatos();
		Leer.mostrarEnPantalla("color: "+color);
	}
}
