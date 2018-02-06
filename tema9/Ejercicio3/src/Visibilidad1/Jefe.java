package Visibilidad1;
import Visibilidad2.EmpleadoEspecial;
public class Jefe extends Empleado{
	EmpleadoEspecial nombre;
	public Jefe(){
		nombre=new EmpleadoEspecial();
		nombre.nombreEs="";//solo por que es public
		super.edad=2;// se puede acceder desde cualquier otra
		super.nombre="emple";//se puede por que esta en el mismo paquete
		super.direccion="Avd Navarra";//esta en el mismo paquete
	}
}