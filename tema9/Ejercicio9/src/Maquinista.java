
public class Maquinista extends Empleados{
	
	private Integer numMaquina;
	private Integer numA�os;
	public Maquinista(String nombre, Integer edad, Integer numMaquina, Integer numA�os) {
		super(nombre, edad);
		this.numMaquina = numMaquina;
		this.numA�os = numA�os;
	}
	public void visualizarTodosDatos(){
		super.visualizarTodosDatos();
		Leer.mostrarEnPantalla("\nNumero de maquina: "+numMaquina+
				"\nNumero de a�os: "+numA�os);
	}
}
