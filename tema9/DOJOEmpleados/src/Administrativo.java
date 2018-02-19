import utilidades.Leer;
import utilidades.Fecha;

public class Administrativo extends Empleado{

	
	private static float plusAntiguedad = 100;
	private String departamento;
	private Responsable jefe;
	
	public Administrativo(String nombre, Fecha fecha_nac, Fecha fechaIngreso, String departamento, Responsable jefe) {
		super(nombre, fecha_nac, fechaIngreso);
		this.departamento = departamento;
		this.jefe = jefe;
	}
	public void visualizarDatos(){
		super.visualizarDatos();
		Leer.mostrarEnPantalla("Departamento: "+departamento);
		Leer.mostrarEnPantalla("Responsable: "+jefe);
	}
	
	public static float getPlusAntiguedad() {
		return plusAntiguedad;
	}

	public static void setPlusAntiguedad(float plusAntiguedad) {
		Administrativo.plusAntiguedad = plusAntiguedad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public Responsable getJefe() {
		return jefe;
	}
	public float calcularAntiguedad(){
		float difFecha;
		Fecha fechaActual;
		fechaActual = super.verFecha();
		//fechaIngreso 
		difFecha = fechaActual.difFechas(super.getFechaIngreso());
		difFecha = difFecha/365f;
		return difFecha;
	} 
	
	public float calculoNomina(){		
		float sueldo;
		sueldo = super.calculoNomina() + (calcularAntiguedad() * plusAntiguedad);
		return sueldo;
		
	}

}