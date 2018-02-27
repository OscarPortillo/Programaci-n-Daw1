
public class Asignatura {
	
	private String nombreAsig;
	private Integer numHoras;
	private String nivel;
	
	public Asignatura(String nombreAsig, Integer numHoras, String nivel) {
		this.nombreAsig = nombreAsig;
		this.numHoras = numHoras;
		this.nivel = nivel;
	}//constructor

	public String getNombreAsig() {
		return nombreAsig;
	}//getNombre
	public void verAsig(){
		System.out.println("\tNombre: "+nombreAsig);
		System.out.println("\tNumero de horas: "+numHoras);
		System.out.println("\tNivel: "+nivel);
	}
}//class