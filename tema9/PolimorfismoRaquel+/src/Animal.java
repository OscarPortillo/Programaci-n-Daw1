
public class Animal {
	private String nombre;
	private String due�o;


	public Animal(String nombre, String due�o) {
		this.nombre = nombre;
		this.due�o = due�o;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDue�o() {
		return due�o;
	}
	public void setDue�o(String due�o) {
		this.due�o = due�o;
	}
	public void verDatos (){
		Leer.mostrarEnPantalla("nombre: "+ nombre);
		Leer.mostrarEnPantalla("due�o: "+ due�o);
	}
}
