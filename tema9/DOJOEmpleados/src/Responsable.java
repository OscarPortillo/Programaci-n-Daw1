import utilidades.Leer;
import utilidades.Fecha;

public class Responsable extends Empleado {
	private float bono;
	private String departamento;
	private int personasACargo = 0;
	private static float plusResponsabilidad = 200;
	public Responsable(String nombre, Fecha fecha_nac, Fecha fechaIngreso, float bono, String departamento) {
		super(nombre, fecha_nac, fechaIngreso);
		this.bono = bono;
		this.departamento = departamento;
	}
	public void visualizarDatos(){
		super.visualizarDatos();
		Leer.mostrarEnPantalla("Bono: "+bono);
		Leer.mostrarEnPantalla("Departamento: "+departamento);
		Leer.mostrarEnPantalla("Personas a cargo: "+personasACargo);
		Leer.mostrarEnPantalla("Plus de Responsabilidad"+plusResponsabilidad);
	}
	public String toString(){
		return super.toString()+"Bono: "+bono+"Departamento: "+departamento
				+"Plus de Responsabilidad"+plusResponsabilidad;
	}
	public static float getPlusResponsabilidad() {
		return plusResponsabilidad;
	}

	public static void setPlusResponsabilidad(float plusResponsabilidad) {
		Responsable.plusResponsabilidad = plusResponsabilidad;
	}

	public float getBono() {
		return bono;
	}

	public String getDepartamento() {
		return departamento;
	}
	public int getPersonasACargo() {
		return personasACargo;
	}

	public void setPersonasACargo(int personasACargo) {
		this.personasACargo = personasACargo;
	}
	public void sumarPersona(){
		personasACargo++;
	}
	public float calculoNomina(){
		float sueldo;
		sueldo = super.calculoNomina() + bono + (plusResponsabilidad * personasACargo);
		return sueldo;
	}

}
