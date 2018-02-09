
public class Jefe extends Empleado{
	private double plus;
	private String nombreDepart;
	public Jefe(String nombre, String nombreEmpresa, int edad, double sueldoBase, int porcentaje, double plus,
			String nombreDepart) {
		super(nombre, nombreEmpresa, edad, sueldoBase, porcentaje);
		this.plus = plus;
		this.nombreDepart = nombreDepart;
	}
	public void infoJefe(){
		
		super.infoEmpleado();		 
		System.out.println("Plus: "+plus);
		System.out.println("Departamento: "+nombreDepart);
		
	}
	public double sueldoTotalJefe(){
		double sueldoTotalJefe;
		sueldoTotalJefe=super.sueldoTotalEmpleado()+plus;
		return sueldoTotalJefe;
	}
	public double getPlus() {
		return plus;
	}
	public void setPlus(double plus) {
		this.plus = plus;
	}
	
}
