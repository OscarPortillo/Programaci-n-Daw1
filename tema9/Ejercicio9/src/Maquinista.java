
public class Maquinista extends Empleados{
	
	private Integer numMaquina;
	private Integer numAños;
	public Maquinista(String nombre, Integer edad, Integer numMaquina, Integer numAños) {
		super(nombre, edad);
		this.numMaquina = numMaquina;
		this.numAños = numAños;
	}
	public void visualizarTodosDatos(){
		super.visualizarTodosDatos();
		Leer.mostrarEnPantalla("\nNumero de maquina: "+numMaquina+
				"\nNumero de años: "+numAños);
	}
}
