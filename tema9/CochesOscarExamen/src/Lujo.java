
public class Lujo extends Coche{
	private Integer codigo=10001;
	
	public Lujo(String matricula, String marca, String modelo, Fecha fechaFabricacion, boolean disponible) {
		super(matricula, marca, modelo, fechaFabricacion, disponible);
		codigo++;
	}
	public  String verCoche(){
		return "Lujo "+super.verCoche()+" Codigo = "+codigo;
	}
}