
public class Cliente implements Persona{
	private String nombre;
	private String ape;
	private int edad;
	
	Cliente(String nombre){
		this.nombre=nombre;
	}
	
	@Override
	public void pedirTodosDatos() {		 
		nombre=Leer.pedirCadena("Introduce el nombre");
		ape=Leer.pedirCadena("Introduce el apellido");
		edad=Leer.pedirEntero("Introduce la edad");
	}

	
	@Override
	public void visualizarTodosDatos() {
		Leer.mostrarEnPantalla("\nNombre: "+nombre+"\nApellido: "+ape+"\nEdad: "+edad);
		
	}
	public void verNom(){
		System.out.println(nombre);
	}

}
