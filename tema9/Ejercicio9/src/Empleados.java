
public class Empleados {
	private String nombre;
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
