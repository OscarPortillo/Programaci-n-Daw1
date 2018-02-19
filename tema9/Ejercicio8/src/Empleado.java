
public class Empleado implements Persona{
	private String nombre;
private String puesto;
	private String ape;
	private int edad;
	@Override
	
	public void pedirTodosDatos() {		 
		nombre=Leer.pedirCadena("Introduce el nombre");
		ape=Leer.pedirCadena("Introduce el apellido");
		edad=Leer.pedirEntero("Introduce la edad");
		puesto=Leer.pedirCadena("Introduce el puesto");
	}

	
	@Override
	public void visualizarTodosDatos() {
		Leer.mostrarEnPantalla("\nNombre: "+nombre+"\nApellido: "
	+ape+"\nEdad: "+edad+"\nPuesto: "+puesto);
		
	}
}
