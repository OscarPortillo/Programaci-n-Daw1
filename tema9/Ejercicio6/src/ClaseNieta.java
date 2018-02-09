
public class ClaseNieta extends hijaDe6{
	private String apellido;

	public ClaseNieta(String nombre, String apellido) {
		super(nombre);
		this.apellido = apellido;
	}

	public void metodo(){
		System.out.println("Soy la nieta");
		super.metodo();
		System.out.println(" "+apellido);
	}
	
}
