
public class Perro extends Animal {
	private String raza;

	public Perro(String nombre, String dueño, String raza) {
		super(nombre, dueño);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	public void verDatos(){
		System.out.println("PERRO");
		super.verDatos();
		Leer.mostrarEnPantalla("raza: "+raza);
	}
}
