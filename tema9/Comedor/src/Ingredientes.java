
public class Ingredientes {
	private String nombre;
	private int cantidad;
	private String nombre1;
	private int cantidad1;
	private String nombre2;
	private int cantidad2;
	private String postre;
	public Ingredientes(String nombre, int cantidad, String nombre1, int cantidad1, String nombre2, int cantidad2) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.nombre1 = nombre1;
		this.cantidad1 = cantidad1;
		this.nombre2 = nombre2;
		this.cantidad2 = cantidad2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public int getCantidad1() {
		return cantidad1;
	}

	public void setCantidad1(int cantidad1) {
		this.cantidad1 = cantidad1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public int getCantidad2() {
		return cantidad2;
	}

	public void setCantidad2(int cantidad2) {
		this.cantidad2 = cantidad2;
	}

	public void verIngre(){
		System.out.println("\tNombre Ingrediente: "+nombre);
		System.out.println("\tCantidad: "+cantidad);
		System.out.println("\tNombre Ingrediente: "+nombre1);
		System.out.println("\tCantidad: "+cantidad1);
		System.out.println("\tNombre Ingrediente: "+nombre2);
		System.out.println("\tCantidad: "+cantidad2);
		
	}
	
}
