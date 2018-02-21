
public class Perro extends Animal {
	private String raza;

	public Perro(String nombre, String due�o, String raza) {
		super(nombre, due�o);
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
