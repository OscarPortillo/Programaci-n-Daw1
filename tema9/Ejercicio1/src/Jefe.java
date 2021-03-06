
public class Jefe extends Empleado {
	private String titulo;
	private int añoExperiencia;
	private String departJefe;
	
	public Jefe(String nombre, String apellido, double sueldo, String titulo,String departJefe, int añoExperiencia) {
		super(nombre, apellido, sueldo);
		this.titulo = titulo;
		this.departJefe=departJefe;
		this.añoExperiencia = añoExperiencia;
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
	public int getAñoExperiencia() {
		return añoExperiencia;
	}
	public void setAñoExperiencia(int añoExperiencia) {
		this.añoExperiencia = añoExperiencia;
	}
	
	
	public void verInfoJefe(){
		super.verInfoEmple();//heredo informacion de empleados
		System.out.println("\t\n Titulo: "+titulo);
		System.out.println("\t\n Años de experiencia: "+añoExperiencia);
		System.out.println();
	}
}//class