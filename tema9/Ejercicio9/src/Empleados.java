
public class Empleados {
	@SuppressWarnings("unused")
	private String nombre;
	@SuppressWarnings("unused")
	private double sueldo;
	@SuppressWarnings("unused")
	private Integer edad;
	public Empleados(String nombre, Integer edad) {
		this.nombre = nombre;
		this.sueldo=1000;
		this.edad = edad;
	}
	public void visualizarTodosDatos(){
		Leer.mostrarEnPantalla("\nNombre: "+nombre+
				"\nSueldo: "+sueldo);
	}
}
