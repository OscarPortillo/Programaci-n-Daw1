
public class Jefe extends Empleado {
	private String titulo;
	private int a�oExperiencia;
	private String departJefe;
	
	public Jefe(String nombre, String apellido, double sueldo, String titulo,String departJefe, int a�oExperiencia) {
		super(nombre, apellido, sueldo);
		this.titulo = titulo;
		this.departJefe=departJefe;
		this.a�oExperiencia = a�oExperiencia;
		contador++;
	}//constructor
	
	public String getDepartJefe() {
		return departJefe;
	}
	public void setDepartJefe(String departJefe) {
		this.departJefe = departJefe;
	}
	private static Integer contador=0;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getA�oExperiencia() {
		return a�oExperiencia;
	}
	public void setA�oExperiencia(int a�oExperiencia) {
		this.a�oExperiencia = a�oExperiencia;
	}
	
	
	public void verInfoJefe(){
		super.verInfoEmple();//heredo informacion de empleados
		System.out.println("\t\n Titulo: "+titulo);
		System.out.println("\t\n A�os de experiencia: "+a�oExperiencia);
		System.out.println();
	}
}//class