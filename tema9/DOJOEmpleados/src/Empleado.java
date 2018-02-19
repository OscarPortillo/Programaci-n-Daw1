import utilidades.Leer;
import utilidades.Fecha;
import java.util.*;

public class Empleado {

	private String nombre;
	private Fecha fecha_nac;
	private Integer num_empleado;
	private static int siguiente = 0;
	private static float salario_base = 1000;
	private Fecha fechaIngreso;
	
	public Empleado(String nombre, Fecha fecha_nac, Fecha fechaIngreso) {
		
		this.nombre = nombre;
		this.fecha_nac = fecha_nac;
		this.num_empleado = siguiente;
		this.fechaIngreso = fechaIngreso;
		siguiente++;		
	}
	public void visualizarDatos(){
		Leer.mostrarEnPantalla("\nNombre: "+nombre+"\nFecha de nacimiento: "+fecha_nac+"\nNumero de empleado: "+num_empleado+"\nSalario: "+calculoNomina()+
				"\nFecha de Ingreso: "+fechaIngreso);
	}
	public String toString(){
		return "Nombre: "+nombre+"Fecha Nacimiento: "+fecha_nac+
				"Numero de empleado: "+num_empleado+"Salario base: "+salario_base
				+"Fecha Ingreso: "+fechaIngreso;
				
	}
	public float calculoNomina(){
		float sueldo=salario_base;
		return sueldo;
	}
	
	public Integer edadEmpleado(Fecha fechaActual) {
		
		Integer edad;
		edad=fecha_nac.difFechas(fechaActual);
		
		edad = edad/365;
		return edad;
	}
	public Integer getNum_empleado() {
		return num_empleado;
	}
	public static int getSiguiente() {
		return siguiente;
	}
	public static float getSalario_base() {
		return salario_base;
	}
	public static void setSalario_base(float salario_base) {
		Empleado.salario_base = salario_base;
	}
	public Fecha verFecha(){		
		Fecha fechaActual;
		fechaActual=new Fecha(16,2,2018);
		return fechaActual;		
	}
	public String getNombre() {
		return nombre;
	}
	
	public Fecha getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(Fecha fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	public Fecha getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Fecha fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	
}//class
