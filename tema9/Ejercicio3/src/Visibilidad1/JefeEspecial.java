package Visibilidad1;
import Visibilidad2.EmpleadoEspecial;
public class JefeEspecial extends EmpleadoEspecial{
	public JefeEspecial(){
		super.direccionEs="navarra";//esta en el mismo paquete
		super.nombreEs="oscar";//esta en el mismo paquete
	}
}