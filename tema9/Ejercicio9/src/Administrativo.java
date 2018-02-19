
public class Administrativo extends Empleados{
	
	private String estudios;
	private Integer numOrdenador;
	public Administrativo(String nombre, Integer edad, String estudios, Integer numOrdenador) {
		super(nombre, edad);
		this.estudios = estudios;
		this.numOrdenador = numOrdenador;
	}
	public void visualizarTodosDatos(){
		super.visualizarTodosDatos();
		Leer.mostrarEnPantalla("\nEstudios: "+estudios+
				"\nNumero de ordenador: "+numOrdenador);
	}

}
