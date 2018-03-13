
public class Coche {
	private String matricula;
	private String marca;
	private String modelo;
	private Fecha fechaFabricacion;
	private boolean disponible;
	
	
	public Coche(String matricula, String marca, String modelo, Fecha fechaFabricacion, boolean disponible) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.fechaFabricacion = fechaFabricacion;
		this.disponible = disponible;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Fecha getFechaFabricacion() {
		return fechaFabricacion;
	}
	public void setFechaFabricacion(Fecha fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	} 
	public String verCoche() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", fechaFabricacion="
				+ fechaFabricacion + ", disponible=" + disponible + "]";
	}
	
}//class
