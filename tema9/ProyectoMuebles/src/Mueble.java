
public class Mueble {
	private static Integer codigo=0;
	private String descripcion;
	private Integer ancho;
	private Integer alto;
	private Integer fondo;
	public Mueble(String descripcion, Integer ancho, Integer alto, Integer fondo) {//CONSTRUCTOR		
		this.descripcion = descripcion;
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
	}	
	/*public void muestraMueble(){
		System.out.println("INFORMACION DEL MUEBLE");
		System.out.println("==========================");
		System.out.println("Codigo: "+codigo);
		System.out.println("Descripción: "+descripcion);
		System.out.println("Ancho: "+ancho);
		System.out.println("Altura: "+alto);
		System.out.println("Fondo: "+fondo);
	}
	@Override*/
	public String muestraMueble() {	
		codigo++;
		return "Mueble ["+"Codigo: "+codigo+" descripcion= " + descripcion + ", ancho = " + ancho + ", alto = " + alto + ", fondo = " + fondo + "]";
	}
	
}//class
