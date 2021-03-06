
public class Empleado {
	private String nombre;
	private String nombreEmpresa;
	private int edad;
	private double sueldoBase;
	private int porcentaje;

	
	public Empleado(String nombre, String nombreEmpresa, int edad, double sueldoBase, int porcentaje) {
		this.nombre = nombre;
		this.nombreEmpresa = nombreEmpresa;
		this.edad = edad;
		this.sueldoBase = sueldoBase;
		this.porcentaje = porcentaje;
	}
	public void infoEmpleado(){
		System.out.println("***************************");
		System.out.println("Nombre de la empresa: "+nombreEmpresa);
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Sueldo Base: "+sueldoBase);
		System.out.println("Aumento: "+porcentaje);
		return;
	}
	public double sueldoTotalEmpleado(){
		double sueldo;
		sueldo=sueldoBase+porcentaje;
		return sueldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public int getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}
	
}
