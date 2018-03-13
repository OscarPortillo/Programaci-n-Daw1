
public class Normal extends Coche{
	private String aparcamiento;	
	private Fecha fecha;
	private Integer codigo=100;//esto me lo inveto yo para identificarlo mejor
	public Normal(String matricula, String marca, String modelo, Fecha fechaFabricacion, boolean disponible,
			Integer precioDiario, String aparcamiento, Fecha fecha,Integer codigo) {
		super(matricula, marca, modelo, fechaFabricacion, disponible, precioDiario);
		this.aparcamiento = aparcamiento;
		this.fecha = fecha;
		this.codigo=codigo;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public String alquilar() {
		return super.alquilar()+" Aparcamiento: "+aparcamiento+" Fecha: "+fecha+" Codigo: "+codigo;
	}
}
