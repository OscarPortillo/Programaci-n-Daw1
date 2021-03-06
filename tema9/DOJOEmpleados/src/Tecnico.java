import utilidades.Fecha;
import utilidades.Leer;

public class Tecnico extends Empleado{
	private String especialidad;
	private static float plusEspecialidad = 150;
	private Responsable jefe;
	public Tecnico(String nombre, Fecha fecha_nac, Fecha fechaIngreso, String especialidad, Responsable jefe) {
		super(nombre, fecha_nac, fechaIngreso);
		this.especialidad = especialidad;
		this.jefe = jefe;
	}
	public void visualizarDatos(){
		super.visualizarDatos();
		Leer.mostrarEnPantalla("Especialidad: "+especialidad);
		Leer.mostrarEnPantalla("Plus de especialidad: "+plusEspecialidad);
		Leer.mostrarEnPantalla("Jefe: "+jefe);
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public Responsable getJefe() {
		return jefe;
	}
	public static float getPlusEspecialidad() {
		return plusEspecialidad;
	}
	public static void setPlusEspecialidad(float plusEspecialidad) {
		Tecnico.plusEspecialidad = plusEspecialidad;
	}	
	public float calculoNomina(){
		float sueldo;
		sueldo = super.calculoNomina() + plusEspecialidad;
		return sueldo;
	}

}
